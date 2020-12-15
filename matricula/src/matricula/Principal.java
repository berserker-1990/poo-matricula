package matricula;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Declarando variables
		List<ProfesorIS> listProfesores = new ArrayList<ProfesorIS>();
		List<Alumno> listAlumnos = new ArrayList<Alumno>();
		List<Clase> listClases = new ArrayList<Clase>();
		List<Seccion> listSecciones = new ArrayList<Seccion>();
		
		int opcion;//Variable que almacena la opcion seleccionada  del menu principal(DEBE SER UN ENTERO)
		int opcionRegistrar;//Variable que almacena la opcion seleccionada  del menu registrar 
		int opcionMatricular;//Variable que almacena la opcion seleccionada  del menu matricular
		boolean salir = false;//Variable para validar la opcion salir
		Scanner teclado = new Scanner(System.in);
		
		//Creando el administrador del programa
		IngenieroSistemas administradorPrograma = new IngenieroSistemas("123456", "Juan", "Pérez", "56789");
		
		
		//Llamando al método que imprime el menú
		MostrarMenuPrincipal();
		while (!salir) { // Mientras no sea salir
			try{
				opcion = teclado.nextInt();
				
				switch (opcion) {
					case 1:
						MostrarMenuRegistrar();
						opcionRegistrar = teclado.nextInt();
						
							switch (opcionRegistrar) {
								case 1:
									RegistrandoProfesor(teclado, listProfesores, administradorPrograma);
									break;
								case 2:
									RegistrandoAlumno(teclado, listAlumnos, administradorPrograma);
									break;
								case 3:
									RegistrandoClase(teclado, listClases, administradorPrograma);
									break;
								case 4:
									RegistrandoSeccion(teclado, listSecciones, administradorPrograma, listProfesores, listClases, listAlumnos);
									break;
								case 5:
									EliminarSeccion(teclado, listSecciones, administradorPrograma);
									break;
								default:
			                        System.out.println("Solo números entre 1 y 5");
			                        break;
							}
							MostrarMenuPrincipal();
	                    break;
					case 2:
						MostrarMenuMatricular();
						opcionMatricular = teclado.nextInt();
						
						switch (opcionMatricular) {
							case 1:
								AgregandoAlumno(teclado, listSecciones, administradorPrograma, listAlumnos);
								break;
							case 2:
								CancelandoALumno(teclado, listSecciones, administradorPrograma, listAlumnos);
								break;
							default:
		                        System.out.println("Solo números entre 1 y 4");
		                        break;
						}
						MostrarMenuPrincipal();
	                    break;
					case 3:
						salir = true;
	                    break;
					default:
	                    System.out.println("Solo números entre 1 y 3");
				}
				
			}catch(InputMismatchException e) {
				System.out.println("Debe insertar un número");
	            teclado.next();
			}
		}		

	}


	//Método que imprime el menú principal
	public static void MostrarMenuPrincipal() {
		System.out.println("\n************** Menú Principal **************\n");
		System.out.println("1- Registrar");
		System.out.println("2- Matricular");
		System.out.println("3- Salir\n");
		System.out.print("Seleccione una opción: ");
	}
	
	//Método que imprime el menú de registro
	public static void MostrarMenuRegistrar() {
		System.out.println("\n********** Menú para Registrar *************\n");
		System.out.println("1- Registrar profesorIS");
		System.out.println("2- Registrar alumno");
		System.out.println("3- Crear clase");
		System.out.println("4- Crear sección");
		System.out.println("5- Eliminar sección\n");
		System.out.print("Seleccione una opción: ");
	}
	
	//Método que imprime el menú de matricula
	public static void MostrarMenuMatricular() {
		System.out.println("\n************ Menú para Registrar *******\n");
		System.out.println("1- Matricular alumno");
		System.out.println("2- Cancelar alumno\n");
		System.out.print("Seleccione una opción: ");
	}
	
	//Llama el método CrearProfesor de la clase IngenieroSistemas, el cual crea un ProfesorIs y lo  agrega a la lista
	public static void RegistrandoProfesor(Scanner teclado, List<ProfesorIS> listProfesores, IngenieroSistemas administradorPrograma) {
		//Declarando variables necesarias para el profesor
		String identidad; 
		String nombre;
		String apellido; 
		String numeroColegiado;
		String numeroEmpleado; 
		Float sueldo;
		
		//Capturando los datos
		System.out.print("\nIngrese la identidad: ");
		identidad = teclado.next();
		System.out.print("\nIngrese el nombre: ");
		nombre = teclado.next();
		System.out.print("\nIngrese el apellido: ");
		apellido = teclado.next();
		System.out.print("\nIngrese el número de colegiado: ");
		numeroColegiado = teclado.next();
		System.out.print("\nIngrese el número de empleado: ");
		numeroEmpleado = teclado.next();
		System.out.print("\nIngrese el sueldo: ");
		sueldo = teclado.nextFloat();
		
		//Mostrar mensaje de confirmación
		System.out.println("\n******************************");
		System.out.println("**Profesor creado con éxito!**");
		System.out.println("******************************");
		//System.out.println("\nDatos del empelado: \n" + profesor.toString());
		
		//Agregando el profesor a la lista de profesores
		listProfesores.add(administradorPrograma.CrearProfesorIs(identidad, nombre, apellido, numeroColegiado, numeroEmpleado, sueldo));
		
		System.out.println("\nLista de profesores IS: \n" );
		//Imprimiendo los registros
		for(ProfesorIS element : listProfesores) {
			System.out.println(element.toString());
		}
		System.out.println("\n" );
	}
	
	//Llama al método  CrearAlumno de la clase IngenieroSistemas, el cual crea un Alumno y lo agrega a la lista de alumnos
	public static void RegistrandoAlumno(Scanner teclado, List<Alumno> listAlumnos, IngenieroSistemas administradorPrograma){
		//Declarando variables necesarias para el alumno
		String identidad; 
		String nombre;
		String apellido; 
		String numeroRegistro;
		
		//Capturando los datos
		System.out.print("\nIngrese la identidad: ");
		identidad = teclado.next();
		System.out.print("\nIngrese el nombre: ");
		nombre = teclado.next();
		System.out.print("\nIngrese el apellido: ");
		apellido = teclado.next();
		System.out.print("\nIngrese el número de registro: ");
		numeroRegistro = teclado.next();
		
		//Mostrar mensaje de confirmación
		System.out.println("\n******************************");
		System.out.println("***Alumno creado con éxito!***");
		System.out.println("******************************");
		
		//Agregando el alumno a la lista de alumnos
		listAlumnos.add(administradorPrograma.CrearAlumno(identidad, nombre, apellido, numeroRegistro));
		
		System.out.println("\nLista de alumnos: \n" );
		//Imprimiendo la lista de alumnos
		for(Alumno element: listAlumnos) {
			System.out.println(element.toString());
		}
	}
	
	//Llama al método CrearClase() de la clase IngenieroSistemas, el cual crea una clase y lo agrega a una lista
	public static void RegistrandoClase(Scanner teclado, List<Clase> listClases, IngenieroSistemas administradorPrograma) {
		//Declarando variables necesarias para la clase
		String codigo; 
		String nombre;
		
		//Capturando los datos
		System.out.print("\nIngrese el código: ");
		codigo = teclado.next();
		System.out.print("\nIngrese el nombre: ");
		nombre = teclado.next();
		
		//Mostrar mensaje de confirmación
		System.out.println("\n******************************");
		System.out.println("***Clase creado con éxito!****");
		System.out.println("******************************");
		
		//Creando la clase y agegandola a la lista de clases
		listClases.add(administradorPrograma.CrearClase(codigo, nombre));
		
		System.out.println("\nLista de clases: \n" );
		//Imprimiendo la lista de clases
		for(Clase element: listClases) {
			System.out.println(element.toString());
		}
	}
	
	//Llama al método CrearClase() de la clase IngenieroSistemas, el cual crea una clase y lo agrega a una lista
	public static void RegistrandoSeccion(Scanner teclado, List<Seccion> listSecciones, IngenieroSistemas administradorPrograma, List<ProfesorIS> listProfesores, List<Clase> listClases, List<Alumno> listAlumnos) {
		//Declarando variables necesarias para la clase
		String seccionId;
		String hora;
		String numeroEmpleado;
		String codigoClase;
		Boolean encontrado = false; //Variable para validar si encuentra o no el profesor o la sección
		ProfesorIS profesor = new ProfesorIS();
		Clase clase = new Clase();
		
		
		if (listProfesores.size()> 0) {
			if(listClases.size()> 0) {
				//Capturando los datos1
				System.out.print("\nIngrese el id de la sección: ");
				seccionId = teclado.next();
				System.out.print("\nIngrese la hora: ");
				hora = teclado.next();
				
				//Si no encuentra al profesor
				while(!encontrado) {
					System.out.print("\nIngrese el número de empleado: ");
					numeroEmpleado= teclado.next();
					
					//Recorrer arreglo de profesores para encontrar el código
					for(ProfesorIS element: listProfesores) {
						if(element.getNumeroEmpleado().toLowerCase().equals(numeroEmpleado.toLowerCase())) {
							encontrado = true;
							profesor.setIdentidad(element.getIdentidad());
							profesor.setNombre(element.getNombre());
							profesor.setApellido(element.getApellido());
							profesor.setNumeroEmpleado(element.getNumeroEmpleado());
							profesor.setNumeroColegiado(element.getNumeroColegiado());
							profesor.setSueldo(element.getSueldo());
						}
					}
					
					if(!encontrado) {
						System.out.print("\nEmpleado no encontrado: ");	
					}
					
				}
				
				//Volver a poner encontrado en false
				encontrado = false;
				
				//Si no encuentra la clase
				while(!encontrado) {
					System.out.print("\nIngrese el código de la clase: ");
					codigoClase= teclado.next();
					
					//Recorrer arreglo de clases para encontrar el código
					for(Clase element: listClases) {
						if(element.getCodigo().toLowerCase().equals(codigoClase.toLowerCase())) {
							encontrado = true;
							clase.setCodigo(element.getCodigo());
							clase.setNombre(element.getNombre());
						}
					}
					
					if(!encontrado) {
						System.out.print("\nClase no encontrada: ");	
					}
				}
				
				//Creando la sección y agregandola
				listSecciones.add(administradorPrograma.CrearSeccion(seccionId, hora, profesor, clase));
				
				//Mostrar mensaje de confirmación
				System.out.println("\n******************************");
				System.out.println("***Sección creada con éxito!***");
				System.out.println("******************************\n");
				
				profesor.darClases();
				System.out.print(clase.getNombre());
				
				System.out.println("\nLista de secciones: \n" );
				//Imprimiendo la lista de secciones
				for(Seccion element: listSecciones) {
					System.out.println(element.toString());
				}
				
			}else {
				System.out.print("\nNo hay clases registradas, vaya a Registrar y después a Registrar clase\n");
			}

		}else {
			System.out.print("\nNo hay profesores registrados, vaya a Registrar y después a Registrar profesorIS\n");
		}
		
	}
	
	
	//Llama al método que elimina la sección
	public static void EliminarSeccion(Scanner teclado, List<Seccion> listSecciones, IngenieroSistemas administradorPrograma) {
		//Declarando variables necesarias para la clase
		String seccionId;
		Boolean encontrado = false; //Variable que sirve validar si encuentra la sección
		
		
		//Capturando los datos
		System.out.print("\nIngrese el id de la sección: ");
		seccionId = teclado.next();
		
		//Lamando al método que elimina la sección, devuelve un booleano, true si lo encuentra y elimina
		encontrado = administradorPrograma.EliminarSeccion(seccionId, listSecciones);
        
		if(! encontrado) {
			System.out.print("\nNo se encontró ninguna sección con ese id\n");	
		}else {
			//Mostrar mensaje de confirmación
			System.out.println("\n******************************");
			System.out.println("**Sección eliminada con éxito!*");
			System.out.println("******************************");
			
			System.out.println("\nLista de secciones: \n" );
			//Imprimiendo la lista de secciones
			for(Seccion element: listSecciones) {
				System.out.println(element.toString());
			}
		}	
	}
	
	//Llama al método que elimina la sección
	public static void AgregandoAlumno(Scanner teclado, List<Seccion> listSecciones, IngenieroSistemas administradorPrograma,  List<Alumno> listAlumnos) {
		//Declarando variables necesarias para la clase
		String seccionId;
		String numeroRegistro;
		Boolean seccionEncontrada = false; //Variable que sirve validar si encuentra la sección
		Boolean alumnoEncontrado = false; //Variable que sirve validar si encuentra el alumno
		
		//Validando si hay secciones creadas y alumnos registrados
		if(listSecciones.size()> 0) {
			if(listAlumnos.size()> 0) {
				//Capturando los datos
				System.out.print("\nIngrese el id de la sección: ");
				seccionId = teclado.next();
				System.out.print("\nIngrese el número de registro del alumno: ");
				numeroRegistro = teclado.next();
				
				//Recorrer la secciones para encontrar la sección
				for(Seccion seccion: listSecciones) {
					if(seccion.getSeccionId().toLowerCase().equals(seccionId.toLowerCase())) {
						seccionEncontrada = true;
						//Recorrer los alumnos para encontrar el alumno
						for(Alumno alumno: listAlumnos) {
							if(alumno.getNumeroRegistro().toLowerCase().equals(numeroRegistro.toLowerCase())) {
								alumnoEncontrado = true;
								//Si existe la sección y el alumno llama al método agregarAlumno
								administradorPrograma.AgregarAlumno(seccion, alumno);
								//Mostrar mensaje de confirmación
								System.out.println("\n******************************");
								System.out.println("**Alumno agregado con éxito!***");
								System.out.println("******************************");
								//Imprimir la sección y el alumno
								System.out.println(seccion.toString());
								System.out.println("\nLista de Alumnos: ");
								seccion.imprimirAlumnos();
							}	
						}
					}
				}
				
				if(!seccionEncontrada || !alumnoEncontrado) {
					System.out.print("\nSección o alumno no encontrado\n");
				}
				
			}else {
				System.out.print("\nNo hay alumnos registrados, vaya a Registrar y después a Registrar alumno\n");
			}
		}else {
			System.out.print("\nNo hay secciones creadas, vaya a Registrar y después a Crear sección\n");
		}
	}
	
	public static void CancelandoALumno(Scanner teclado, List<Seccion> listSecciones, IngenieroSistemas administradorPrograma, List<Alumno> listAlumnos) {
		//Declarando variables necesarias para la clase
		String seccionId;
		String numeroRegistro;
		Boolean seccionEncontrada = false; //Variable que sirve validar si encuentra la sección
		Boolean alumnoEncontrado = false;  //Variable que sirve validar si encuentra el alumno
		
		//Validando si hay secciones creadas y alumnos registrados
		if(listSecciones.size()> 0) {
			if(listAlumnos.size()> 0) {
				//Capturando los datos
				System.out.print("\nIngrese el id de la sección: ");
				seccionId = teclado.next();
				System.out.print("\nIngrese el número de registro del alumno: ");
				numeroRegistro = teclado.next();
				
				//Recorrer la secciones para encontrar la sección
				for(Seccion seccion: listSecciones) {
					if(seccion.getSeccionId().toLowerCase().equals(seccionId.toLowerCase())) {
						seccionEncontrada = true;
						//Recorrer los alumnos para encontrar el alumno
						for(Alumno alumno: listAlumnos) {
							if(alumno.getNumeroRegistro().toLowerCase().equals(numeroRegistro.toLowerCase())) {
								alumnoEncontrado = true;
								//Si existe la sección y el alumno llama al método agregarAlumno
								administradorPrograma.CancelarAlumno(seccion, alumno);
								//Mostrar mensaje de confirmación
								System.out.println("\n******************************");
								System.out.println("**Alumno eliminado con éxito!**");
								System.out.println("******************************");
								//Imprimir la sección y el alumno
								System.out.println(seccion.toString());
								System.out.println("\nLista de Alumnos: ");
								seccion.imprimirAlumnos();
							}	
						}
					}
				}
				
				if(!seccionEncontrada || !alumnoEncontrado) {
					System.out.print("\nSección o alumno no encontrado\n");
				}
				
			}else {
				System.out.print("\nNo hay alumnos registrados, vaya a Registrar y después a Registrar alumno\n");
			}
		}else {
			System.out.print("\nNo hay secciones creadas, vaya a Registrar y después a Crear sección\n");
		}
		
//		//Capturando los datos
//		System.out.print("\nIngrese el id de la sección: ");
//		seccionId = teclado.next();
//		
//		//Lamando al método que elimina la sección, devuelve un booleano, true si lo encuentra y elimina
//		encontrado = administradorPrograma.EliminarSeccion(seccionId, listSecciones);
//        
//		if(! encontrado) {
//			System.out.print("\nNo se encontró ninguna sección con ese id\n");	
//		}else {
//			//Mostrar mensaje de confirmación
//			System.out.println("\n******************************");
//			System.out.println("**Sección eliminada con éxito!*");
//			System.out.println("******************************");
//			
//			System.out.println("\nLista de secciones: \n" );
//			//Imprimiendo la lista de secciones
//			for(Seccion element: listSecciones) {
//				System.out.println(element.toString());
//			}
//		}
	}
}
