package app;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import data.Account;
import data.Transac;

@Path("bankXML")
public class RestXML {

	boolean started = false;
	static int nbAccount = 10;
	static int nbTransac = 100;
	public static List<Account> listAccount;
	public static List<Transac> listTransac;

	private void start() {
		if (!started) {
			listAccount = new ArrayList<Account>();
			listTransac = new ArrayList<Transac>();

			for (int i = 0; i < nbAccount; i++)
				listAccount.add(new Account(i, Math.random() * 5000));
			for (int j = 0; j < nbTransac; j++)
				listTransac.add(new Transac(j));
			started = true;
		}
	}

	private Account getAccount(int iBAN) {
		for (Account element : listAccount)
			if (element.getIBAN() == iBAN)
				return element;
		return null;
	}

	@GET
	@Produces("text/plain")
	@Path("/start")
	public String startApp() {
		start();
		return "Start ok";
	}
	
	@GET
	@Produces("application/xml")
	@Path("/getAccount/{iBAN}")
	public Account getAccountWS(@PathParam("iBAN") int iBAN) {
		return getAccount(iBAN);

	}

	@GET
	@Produces("application/xml")
	@Path("/doTransac/{iBAN}/{type}/{amount}")
	public Transac doTransac(@PathParam("iBAN") int iBAN, @PathParam("type") String type,
			@PathParam("amount") double amount) {

		Transac currentTransac = new Transac(++nbTransac, type, amount, iBAN);
		Account currentAcc = getAccount(iBAN);
		if (currentTransac.getType().equals("Credit"))
			currentAcc.crediter(currentTransac);
		else if (currentTransac.getType().equals("Debit"))
			currentAcc.debiter(currentTransac);
		else
			;
		return currentTransac;
	}
}
