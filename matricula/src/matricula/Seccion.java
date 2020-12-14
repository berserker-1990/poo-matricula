package matricula;

public class Seccion implements Matricula{
	private String seccionId;
	private Alumno[] listaAlumnos = new Alumno [30];
	
	public Seccion (String seccionId) {
		this.seccionId = seccionId;
	}

	@Override
	public void AgregarAlumno(String seccionId, String numeroRegistro) {
		//this.seccionId = seccionId;
		
		
	}

	@Override
	public void CancelarAlumno(String seccionId, String numeroRegistro) {
		// TODO Esbozo de método generado automáticamente
		
	}
}
