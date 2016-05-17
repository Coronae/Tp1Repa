package app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class Start extends Application {
	public Set<Class<?>> getClasses() {
		// A quoi cela sert ? Qu'est ce que c'est ?
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(RestJson.class);
		return s;
	}
}