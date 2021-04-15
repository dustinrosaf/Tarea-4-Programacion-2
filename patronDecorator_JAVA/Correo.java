package patrondecorator_java;

public class Correo {

	private int id;
	private String correo;

	public Correo() {

	}

	public Correo(int id, String correo) {
		this.id = id;
		this.correo = correo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
