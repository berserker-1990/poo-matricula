package matricula;

public class Alumno extends Persona{
	private String numeroRegistro;
	
	public Alumno(String identidad, String nombre, String apellido, String numeroRegistro) {
		super(identidad, nombre, apellido);
		this.setNumeroRegistro(numeroRegistro);
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
}
