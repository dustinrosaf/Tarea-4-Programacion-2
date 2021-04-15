package patrondecorator_java;

import patrondecorator_java.ICorreo;
import patrondecorator_java.Correo;

public abstract class CorreoDecorador implements ICorreo{

	protected ICorreo correoDecorado;
	
	public CorreoDecorador(ICorreo correoDecorado) {
		this.correoDecorado = correoDecorado;
	}

	
	public void abrirCorreo(Correo c) {
		this.correoDecorado.abrirCorreo(c);
	}	
	
}