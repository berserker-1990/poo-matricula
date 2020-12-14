package matricula;

public interface Registro {
	//Método para registrar un profesor
	public ProfesorIS CrearProfesorIs(String identidad, String nombre, String apellido, String numeroColegiado,String numeroEmpleado,Float sueldo);
//	//Método para eliminar un profesor
//	public void EliminarProfesorIS();
//	
//	
	//Método para registrar un alumno
	public Alumno CrearAlumno(String identidad, String nombre, String apellido, String numeroRegistro);
//	//Método para eliminar un alumno
//	public void EliminarAlumno();
//	
//	
	//Método para crear una clase
	public Clase CrearClase(String codigo, String nombre);
//	//Método para eliminar una clase
//	public void EliminarClase();
//	
	//Método para crear una sección
	public Seccion CrearSeccion(String seccionId, String hora, ProfesorIS profesorIs, Clase clase);
//	//Método para eliminar una sección
//	public void EliminarSeccion(String seccionId);
}
