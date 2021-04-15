package patronproxy_java;

import patronproxy_java.IConsola;
import patronproxy_java.ConsolaPlay;
import patronproxy_java.Consola;
import patronproxy_java.ConsolaProxy;


public class Main {

	public static void main(String[] args) {
		Consola c = new Consola(1, "Playstation", 5);
		
		IConsola consolaProxy = new ConsolaProxy(new ConsolaPlay());
		consolaProxy.mostrarJuegos(c);
		c = consolaProxy.agregarJuegos(c, 1);
		c = consolaProxy.eliminarJuegos(c, 3);
		consolaProxy.mostrarJuegos(c);
		
	}

}
