package matricula;

public abstract class Persona {
	private String identidad;
	private String nombre;
	private String apellido;
	
	public Persona(String identidad, String nombre, String apellido) {
		this.identidad = identidad;
		this.nombre = nombre;
		this.apellido = apellido;
	}

}
