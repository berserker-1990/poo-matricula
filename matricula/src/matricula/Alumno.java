package matricula;

public class Alumno extends Persona{
	private String numeroRegistro;
	
	public Alumno(String identidad, String nombre, String apellido, String numeroRegistro) {
		super(identidad, nombre, apellido);
		this.setNumeroRegistro(numeroRegistro);
	}

	public Alumno() {
		
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	@Override
    public String toString() { 
        return String.format("\nIdentidad: " + this.getIdentidad() + "\nNombre: " + this.getNombre() + " " + this.getApellido() + 
        		"\nNro.Registro: " + this.getNumeroRegistro() + "\n"); 
    }
}
