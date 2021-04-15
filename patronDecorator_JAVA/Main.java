package patrondecorator_java;

import patrondecorator_java.ProteccionDecorador;
import patrondecorator_java.ICorreo;
import patrondecorator_java.CorreoPersonal;
import patrondecorator_java.Correo;

public class Main {

	public static void main(String[] args) {
		Correo c = new Correo(1, "dustinrosaf@gmail.com");	
		
		ICorreo correo = new CorreoPersonal();
		ICorreo correoProtegido = new ProteccionDecorador(correo);
		
		//correo.abrirCorreo(c);
		correoProtegido.abrirCorreo(c);
	}

}

