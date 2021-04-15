package patronproxy_java;

import patronproxy_java.IConsola;
import patronproxy_java.Consola;

public class ConsolaPlay implements IConsola {

	
	public Consola eliminarJuegos(Consola consola, double juego) {
		double juegosActuales = consola.getJuego() - juego;
		consola.setJuego(juegosActuales);
		System.out.println("Juegos Actuales: " + consola.getJuego());
		return consola;
	}

	
	public Consola agregarJuegos(Consola consola, double juego) {
		double juegosActuales = consola.getJuego() + juego + 1;
		consola.setJuego(juegosActuales);
		System.out.println("Juegos Actuales: " + consola.getJuego());
		return consola;
	}

	
	public void mostrarJuegos(Consola consola) {
		System.out.println("Juegos Actuales: " + consola.getJuego());
	}

}
