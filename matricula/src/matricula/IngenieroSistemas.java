package matricula;

import java.util.Iterator;
import java.util.List;

class IngenieroSistemas extends Persona implements Registro, Matricula{
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

	@Override
	public Boolean EliminarSeccion(String seccionId,  List<Seccion> listSecciones) {
		Boolean encontrado = false;
		
		//Recorrer arreglo de secciones para encontrar la seccionId
		//El interface Iterator dispone de un método adicional que permite eliminar objetos 
		//de una lista mientras la recorremos (el método remove) 
		Iterator<Seccion> iterador = listSecciones.iterator();
		//Usamos el método hasNext, para comprobar si hay algun elemento
        while(iterador.hasNext()){
        	//Creamos una sección temporal para comparar el atributo seccionId
        	Seccion seccionEncontrada = iterador.next();
        	if(seccionEncontrada.getSeccionId().toLowerCase().equals(seccionId.toLowerCase())){
        		encontrado = true;
        		iterador.remove();
        	}
        }
		return encontrado;
	}

	@Override
	public void AgregarAlumno(Seccion seccion, Alumno alumno) {
		seccion.addAlumno(alumno);
	}

	@Override
	public void CancelarAlumno(Seccion seccion, Alumno alumno) {
		//Recorrer arreglo de alumnos que tienen la sección
		//Usando Iterador para eliminar elementos del arreglo
		
		seccion.getListaAlumnos().remove(alumno);
//	    	//Creamos una sección temporal para comparar el atributo seccionId
//	    	Alumno alumnoEncontrado = iterador.next();
//	    	if(seccionTemporal.getSeccionId().toLowerCase().equals(seccionId.toLowerCase())){
//	    		iterador.remove();
//	    	}
//	    }
	}	
	
}
