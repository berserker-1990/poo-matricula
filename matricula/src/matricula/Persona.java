package matricula;

public abstract class Persona {
	private String identidad;
	private String nombre;
	private String apellido;
	
	public Persona(String identidad, String nombre, String apellido) {
		this.setIdentidad(identidad);
		this.setNombre(nombre);
		this.setApellido(apellido);
	}

	public String getIdentidad() {
		return identidad;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
