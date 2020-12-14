package matricula;

public class IngenieroSistemas extends Persona{
	private String numeroColegiado;
	
	public IngenieroSistemas(String identidad, String nombre, String apellido,String numeroColegiado) {
		super(identidad, nombre, apellido);
		this.setNumeroColegiado(numeroColegiado);
	}

	public String getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(String numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}
}
