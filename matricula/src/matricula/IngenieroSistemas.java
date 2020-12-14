package matricula;

public class IngenieroSistemas extends Persona{
	String numeroColegiado;
	
	public IngenieroSistemas(String identidad, String nombre, String apellido,String numeroColegiado) {
		super(identidad, nombre, apellido);
		this.numeroColegiado = numeroColegiado;
	}
}
