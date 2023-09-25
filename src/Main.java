import java.util.Scanner;
import Composite.*; 

public class Main {
  public static void main(String[] args) {
    // Ciclo do para preguntar al usuario por las acciones del robot 
		Scanner sc = new Scanner(System.in);
		int opcion;
    EquiparNuevoSoldado equiparNuevoSoldado = new EquiparNuevoSoldado();


		System.out.println("***********************************************************");
		System.out.println("*                                                         *");
		System.out.println("*    BIENVENIDO A LA ORGANIZACION MATRIOSKA-CHEEMS.       *");
		System.out.println("*                                                         *");
		System.out.println("***********************************************************\n");
		System.out.println("Por favor elige la opcion que deseas ejecutar.");
    
    do {
			System.out.println("1.- Equipar nuevo soldado.\n" +
							"2.- Reportar batallones.\n" +
							"3.- Equipar a Cheems.\n" +
              "0.- Salir del menu.");

			while (true) {
				try {
					String opcionUsuario = sc.nextLine();
					opcion = Integer.parseInt(opcionUsuario);
					break;
				} catch (NumberFormatException ex) {
					System.out.println("1.- Equipar nuevo soldado.\n" +
							"2.- Reportar batallones.\n" +
							"3.- Equipar a Cheems.\n" +
              "0.- Salir del menu.");
				}
			}

			switch (opcion) {

				case 1:
					equiparNuevoSoldado.crearNuevoSoldado();
					break;
        /*
				case 2:
					Batallon.reportar();
					break;
        */
				case 0:
					System.out.println("Saliendo del menu...");
					break;

				default:
					System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
					break;
			}
		} while (opcion != 0);
	}
}
