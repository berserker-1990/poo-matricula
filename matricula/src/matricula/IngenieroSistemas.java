package matricula;

class IngenieroSistemas extends Persona implements Registro{
	private String numeroColegiado;
	
	public IngenieroSistemas() {
		super();
	}
	
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
	
	@Override
	public ProfesorIS CrearProfesorIs(String identidad, String nombre, String apellido, String numeroColegiado,String numeroEmpleado,Float sueldo) {
		ProfesorIS profesorIs = new ProfesorIS(identidad, nombre, apellido, numeroColegiado, numeroEmpleado, sueldo);
		return profesorIs;
	} 

	@Override
	public Alumno CrearAlumno(String identidad, String nombre, String apellido, String numeroRegistro) {
		Alumno alumno = new Alumno(identidad, nombre, apellido, numeroRegistro);
		return alumno;
	}
	
	@Override
	public Clase CrearClase(String codigo, String nombre) {
		Clase clase = new Clase(codigo, nombre);
		return clase;
	}
	
	@Override
	public Seccion CrearSeccion(String seccionId, String hora, ProfesorIS profesorIs, Clase clase) {
		Seccion nuevaSeccion = new Seccion(seccionId, hora, profesorIs, clase);
		return nuevaSeccion;
	} 
	
	
}
