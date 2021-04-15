
package patronobserver_java;

public class PesoDOPObservador extends Observador{
	
	private double valorCambio = 58.55;
	
	public PesoDOPObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	
	public void actualizar() {		
		System.out.println("DOP: " + (sujeto.getEstado() * valorCambio));
	}