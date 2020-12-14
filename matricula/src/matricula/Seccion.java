package matricula;

public class Seccion {
	private String seccionId;
	private String horaInicial;
	private String horaFinal;
	private ProfesorIS profesorIs;
	private Alumno[] listaAlumnos = new Alumno [30];
	
	public Seccion (String seccionId, String horaInicial, String horaFinal) {
		this.setSeccionId(seccionId);
		this.setHoraInicial(horaInicial);
		this.setHoraFinal(horaFinal);
	}

	public String getSeccionId() {
		return seccionId;
	}

	public void setSeccionId(String seccionId) {
		this.seccionId = seccionId;
	}

	public String getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public Alumno[] getListaAlumnos() {
		return listaAlumnos;
	}
	
	//Cambiar este
	public void setListaAlumnos(Alumno[] listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
}
