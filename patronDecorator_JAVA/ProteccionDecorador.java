package patrondecorator_java;

import patrondecorator_java.ICorreo;
import patrondecorator_java.Correo;

public class ProteccionDecorador extends CorreoDecorador {

	public ProteccionDecorador(ICorreo correoDecorado) {
		super(correoDecorado);
	}

    
	
	public void abrirCorreo(Correo c) {
		correoDecorado.abrirCorreo(c);
		agregarProteccion(c);
	}

	public void agregarProteccion(Correo c) {		
		System.out.println("Se agregó proteccion de 2 Pasos al correo  " + c.getCorreo());
	}

}
