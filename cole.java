package Practicas;

import java.util.Scanner;

public class Practica1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nombre;
		String fecha_nacimiento;
		String numero_cuenta;
		double saldo = 0;
		String log_ingresos = " ";
		String log_gastos = " ";
		int opcion1;
		int opcion2;
		int opcion3;
		boolean seguir = true;
		int ingresos;
		int retirar;
		int cantidad;

		System.out.print("Introduce tu nombre: ");
		nombre = entrada.nextLine();

		System.out.print("Introduce tu fecha de nacimiento: ");
		fecha_nacimiento = entrada.nextLine();

		System.out.print("Introduce tu numero de cuenta: ");
		numero_cuenta = entrada.nextLine();

		System.out.println("Saldo actual = " + saldo + "\n");
		
		

		/* While sirve para meterlo en un bucle */
		/* Seguir == true significa */
		while (seguir == true) {

			System.out.println("Selecciona una opcion: \n"
			+ "1. Datos de la cuenta \n"
			+ "2. Ingresar \n"
			+ "3. Retirar \n"
			+ "4. Equivalencia de la moneda \n" 
			+ "5. Cantidad de ingresos realizados \n"
			+ "6. Cantidad de gastos realizados \n" 
			+ "7. Salir \n" 
			+ ">> ");
			
            System.out.print("Elige una opci�n: ");
            
			opcion1 = entrada.nextInt();

			switch (opcion1) {

			case 1:

				System.out.print("Datos de cuenta; " + (nombre + fecha_nacimiento + numero_cuenta + saldo));

				break;

			case 2:
				System.out.print("Introduce la cantidad que desea ingresar: ");

				ingresos = entrada.nextInt();

				saldo += ingresos;

				System.out.println("El dinero actual es: + " + saldo);

				log_ingresos += "+" + ingresos;

				break;

			case 3:

				System.out.print("Introduce la cantidad que desea retirar: ");

				retirar = entrada.nextInt();

				if (retirar > saldo) {

					System.out.println("�Estas seguro que desea retirarlo?: \n" + "1. Si \n" + "2. No \n" + ">>");

					opcion2 = entrada.nextInt();

					/* Switch: sirve para que no vuelva a la opcion1 */

					switch (opcion2) {

					case 1:

						saldo -= retirar;

						System.out.println("Realizar retirada: " + saldo);
						
						log_gastos += "-" + retirar;

						break;
					case 2:
						
						System.out.println(" ");
					}
					
				} else {
					
					saldo -= retirar;
					
					System.out.println("El dinero actual es de: " + saldo);
					
					log_gastos += "-" + retirar;
				}

				System.out.println("Su dinero actual en la cuenta es de: " + saldo + "0 �");



				break;

			case 4:

				System.out.print("Introduzca la cantidad que quieres cambiar de moneda: ");

				cantidad = entrada.nextInt();

				System.out.println("�Que equivalencia quieres obtener?: \n" + "1. Dolares estadounidenses \n"
						+ "2. Libras esterlinas \n" + "3. Yuanes chinos \n" + ">>");

				opcion3 = entrada.nextInt();

				switch (opcion3) {

				case 1:

					System.out.println("Cantidad de dinero en dolares estadounidenses: " + (cantidad * 0.95));

					break;

				case 2:

					System.out.println("Cantidad de dinero en libras esterlinas: " + (cantidad * 1.15));

					break;

				case 3:

					System.out.println("Cantidad de dinero en yuanes chinos: " + (cantidad * 0.13));

				}

				break;
			case 5:

				System.out.println("Sus ingrsos realidados son de: " + log_ingresos + "�");

				break;

			case 6:

				System.out.println("Sus gastos realidados son de: " + log_gastos + "�");

				break;

			case 7:

				System.out.println("Gracias por confiar en tu banco.");

				seguir = false;

				break;

			default:
				System.out.println("ERROR. El n�mero introducido no es valido. ");
			}

		}
	}
}
