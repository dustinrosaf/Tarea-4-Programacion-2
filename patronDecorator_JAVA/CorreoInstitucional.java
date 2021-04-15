
package patrondecorator_java;

import patrondecorator_java.ICorreo;
import patrondecorator_java.Correo;

public class CorreoInstitucional implements ICorreo {

	
	public void abrirCorreo(Correo c) {
		System.out.println("-------------------------");
		System.out.println("Se abrió un correo Institucional");
		System.out.println("Correo: " + c.getCorreo());		
	}

}