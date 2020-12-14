package matricula;

public class Alumno extends Persona{
	String numeroRegistro;
	
	public Alumno(String identidad, String nombre, String apellido, String numeroRegistro) {
		super(identidad, nombre, apellido);
		this.numeroRegistro = numeroRegistro;
	}
}
