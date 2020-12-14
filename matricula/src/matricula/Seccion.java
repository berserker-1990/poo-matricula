package matricula;

import java.util.ArrayList;
import java.util.List;

public class Seccion {
	private String seccionId;
	private String hora;
	private ProfesorIS profesorIs;
	private Clase clase;
	private List<Alumno> listaAlumnos;
	
	public Seccion (String seccionId, String hora, ProfesorIS profesorIs, Clase clase) {
		this.setSeccionId(seccionId);
		this.setHora(hora);
		this.setProfesorIs(profesorIs);
		this.setClase(clase);
		this.listaAlumnos = new ArrayList<Alumno>();
		
	}

	public String getSeccionId() {
		return seccionId;
	}

	public void setSeccionId(String seccionId) {
		this.seccionId = seccionId;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public ProfesorIS getProfesorIs() {
		return profesorIs;
	}

	public void setProfesorIs(ProfesorIS profesorIs) {
		this.profesorIs = profesorIs;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	public Clase getClase() {
		return clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}
	
	@Override
    public String toString() { 
        return String.format("\nSeccionId: " + this.getSeccionId() + "\nHora: " + this.getHora() + "\nClase: " 
        		+ this.getClase().getNombre() + "\nProfesor: " + this.getProfesorIs().getNombre() + " " + this.getProfesorIs().getApellido()
        		+ "\nNro. de alumnos: " + this.getListaAlumnos().size()); 
    }
}
