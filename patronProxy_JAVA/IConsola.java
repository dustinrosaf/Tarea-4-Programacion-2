package patronproxy_java;

import patronproxy_java.Consola;

public interface IConsola {

	Consola eliminarJuegos(Consola consola, double juego);
	Consola agregarJuegos(Consola consola, double juego);
	void mostrarJuegos(Consola consola);
}



