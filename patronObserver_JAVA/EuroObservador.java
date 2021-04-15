
package patronobserver_java;

public class EuroObservador extends Observador {

	private double valorCambio = 0.89;
	
	public EuroObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("Euro: " + (sujeto.getEstado() * valorCambio));
	}
}