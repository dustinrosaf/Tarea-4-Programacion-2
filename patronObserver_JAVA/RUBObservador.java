package patronobserver_java;



public class RUBObservador extends Observador{

	private double valorCambio = 71.45;
	
	public RUBObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("RUS: " + (sujeto.getEstado() * valorCambio));
	}

}


