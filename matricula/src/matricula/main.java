package matricula;
import java.util.Scanner;
import java.util.InputMismatchException;

public class main implements Registro{

	public static void main(String[] args) {
		//Declarando variables
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
									System.out.println("Registrar profesorIS");
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
	
	//IMPLEMENTANDO MÉTODOS DE LA INTERFACE Registro
	@Override
	public void RegistrarProfesorIS(String identidad, String nombre, String apellido, String numeroColegiado,
			String numeroEmpleado, Float sueldo) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void EliminarProfesorIS(String identidad) {
		// TODO Esbozo de método generado automáticamente
		
	}

}
