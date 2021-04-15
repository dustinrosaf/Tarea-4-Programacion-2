package patrondecorator_java;

import patrondecorator_java.ICorreo;
import patrondecorator_java.Correo;

public class CorreoPersonal implements ICorreo {

	
	public void abrirCorreo(Correo c) {
		System.out.println("-------------------------");
		System.out.println("Se abrió un correo Peronal");
		System.out.println("Correo: " + c.getCorreo());		
	}

}
