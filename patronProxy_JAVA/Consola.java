package patronproxy_java;

public class Consola {

	private int idConsola;
	private String usuario;
	private double juego;

	public Consola(int idConsola, String usuario, double juego) {
		this.idConsola = idConsola;
		this.usuario = usuario;
		this.juego = juego;
	}

	public int getIdConsola() {
		return idConsola;
	}

	public void setIdConsola(int idConsola) {
		this.idConsola = idConsola;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getJuego() {
		return juego;
	}

	public void setJuego(double juego) {
		this.juego = juego;
	}

}

