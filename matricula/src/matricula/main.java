package matricula;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class main implements Registro{

	public static void main(String[] args) {
		//Declarando variables
		List<ProfesorIS> listProfesores = new ArrayList<ProfesorIS>();
		List<Alumno> listAlumnos = new ArrayList<Alumno>();
		
		int opcion;//Variable que almacena la opcion seleccionada  del menu principal(DEBE SER UN ENTERO)
		int opcionRegistrar;//Variable que almacena la opcion seleccionada  del menu registrar 
		int opcionMatricular;//Variable que almacena la opcion seleccionada  del menu matricular
		boolean salir = false;//Variable para validar la opcion salir
		Scanner teclado = new Scanner(System.in);
		
		
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
									RegistrarProfesorIS(teclado, listProfesores);
									break;
								case 2:
									System.out.println("Registrar alumno");
									break;
								case 3:
									System.out.println("Crear clase");
									break;
								case 4:
									System.out.println("Crear sección");
								default:
			                        System.out.println("Solo números entre 1 y 4");
			                        break;
							}
							MostrarMenuPrincipal();
	                    break;
					case 2:
						MostrarMenuMatricular();
						opcionMatricular = teclado.nextInt();
						
						switch (opcionMatricular) {
							case 1:
								System.out.println("Matricular alumno");
								break;
							case 2:
								System.out.println("Cancelar alumno");
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
		System.out.println("4- Crear sección\n");
		System.out.print("Seleccione una opción: ");
	}
	
	//Método que imprime el menú de matricula
	public static void MostrarMenuMatricular() {
		System.out.println("\n************ Menú para Registrar *******\n");
		System.out.println("1- Matricular alumno");
		System.out.println("2- Cancelar alumno\n");
		System.out.print("Seleccione una opción: ");
	}
	
	//Método para registrar un profesor
	public static void RegistrarProfesorIS(Scanner teclado, List<ProfesorIS> listProfesores) {
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
		
		//set a las propiedades del objeto profesor
		ProfesorIS profesor = new ProfesorIS();
		profesor.setIdentidad(identidad);
		profesor.setNombre(nombre);
		profesor.setApellido(apellido);
		profesor.setNumeroColegiado(numeroColegiado);
		profesor.setNumeroEmpleado(numeroEmpleado);
		profesor.setSueldo(sueldo);
		
		//Imprimiendo el profesor creado
		System.out.println("\n*****************************");
		System.out.println("**Empleado crado con éxito!**");
		System.out.println("*****************************");
		//System.out.println("\nDatos del empelado: \n" + profesor.toString());
		
		//Insertando el profesor a la lista
		listProfesores.add(profesor);
		System.out.println("\nLista de empleados: \n" );
		listProfesores.toString();
		for(ProfesorIS element : listProfesores) {
			System.out.println(element.toString());
		}
		System.out.println("\n" );
	}
	
	

}
