package matricula;

public class ProfesorIS extends IngenieroSistemas implements Profesor{
	private String numeroEmpleado;
	private Float sueldo;
	
	public ProfesorIS() {
		super();
	}
	
	public ProfesorIS(String identidad, String nombre, String apellido, String numeroColegiado,String numeroEmpleado,Float sueldo) {
		super(identidad, nombre, apellido, numeroColegiado);
		this.setNumeroEmpleado(numeroEmpleado);
		this.setSueldo(sueldo);
	}

	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public Float getSueldo() {
		return sueldo;
	}

	public void setSueldo(Float sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
    public String toString() { 
        return String.format("\nIdentidad: " + this.getIdentidad() + "\nNombre: " + this.getNombre() + " " + this.getApellido() + 
        		"\nNro. colegiado: " + this.getNumeroColegiado() + "\nNro. empleado: " + this.numeroEmpleado + "\nSueldo: " + this.getSueldo().toString()); 
    }

	@Override
	public void darClases() {
		System.out.print("El ing. " + this.getNombre() + " " + this.getApellido() + " está listo para impartir la clase ");
	}
	

}
