package patronproxy_java;

import java.util.logging.Logger;

import patronproxy_java.IConsola;
import patronproxy_java.ConsolaPlay;
import patronproxy_java.Consola;

public class ConsolaProxy implements IConsola {

	private IConsola consolaReal;
	private final static Logger LOGGER = Logger.getLogger(ConsolaProxy.class.getName());

	public ConsolaProxy(IConsola consolaReal) {
		this.consolaReal = consolaReal;
	}
	
	
	public Consola eliminarJuegos(Consola consola, double juego) {
		LOGGER.info("----Consola Proxy - Eliminar Juegos----");
		if (consolaReal == null) {
			consolaReal = new ConsolaPlay();
			return consolaReal.eliminarJuegos(consola, juego);
		} else {
			return consolaReal.eliminarJuegos(consola, juego);
		}
	}

	
	public Consola agregarJuegos(Consola consola, double juego) {
		LOGGER.info("----Consola Proxy - Agregar Juegos----");
		if (consolaReal == null) {
			consolaReal = new ConsolaPlay();
			return consolaReal.agregarJuegos(consola, juego);
		} else {
			return consolaReal.agregarJuegos(consola, juego);
		}
	}

	
	public void mostrarJuegos(Consola consola) {
		LOGGER.info("----Consola Proxy - Mostrar Juegos----");
		if (consolaReal == null) {
			consolaReal = new ConsolaPlay();
			consolaReal.mostrarJuegos(consola);
		} else {
			consolaReal.mostrarJuegos(consola);
		}
	}

}
