package app;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.MarshallerProperties;

import data.Transac;

public class Main {
	
	public static void main(String[] args) throws Exception {

		String uri1 = "http://localhost:9090/GlassProd/bank/getListTransac";
		String uri2 =
		URL url = new URL(uri);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Accept", "application/json");
		Map<String, Object> properties = new HashMap<String, Object>();

		properties.put("eclipselink.media-type", "application/json");
		properties.put(MarshallerProperties.JSON_INCLUDE_ROOT, false);

		JAXBContext ctx = JAXBContextFactory.createContext(new Class[] { Transac.class }, properties);
		Unmarshaller jsonUnmarshaller = ctx.createUnmarshaller();
		StreamSource jsonStream2 = new StreamSource(connection.getInputStream());

		List<Transac> listA = (List<Transac>) jsonUnmarshaller.unmarshal(jsonStream2, Transac.class).getValue();
		connection.disconnect();
		for (Transac element : listA)
			System.out.println(element.toString());
	}


}