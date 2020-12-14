package matricula;

public class ProfesorIS extends IngenieroSistemas{
	private String numeroEmpleado;
	private Float sueldo;
	
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
	

}
