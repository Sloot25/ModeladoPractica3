import java.util.Scanner;
import Composite.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;
		EquiparNuevoSoldado equiparNuevoSoldado = new EquiparNuevoSoldado();
		ReportarBatallones reportarBatallones = new ReportarBatallones();
    CuartelCheems cuartel = new CuartelCheems();
    CheemsSoldado cheems = cuartel.desplegarCheems();
    Soldado cheemsDeLaHoja = new CheemsAdapter(cheems, "Cabo");
    reportarBatallones.setCheems(cheemsDeLaHoja);

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
				case 2:
					reportarBatallones.reportar();
					break;
				case 3:
          reportarBatallones.setCheems(equiparNuevoSoldado.agregarArma(cheemsDeLaHoja));
          reportarBatallones.agregarCheems();
          System.out.println("----------------------------------------------------------------------------------------");
          System.out.println("\n              Nuestro soldado Cheems ha llegado al campo de batalla ");
          System.out.println("         Cheems al ser nuevo en la ciudad fue agregado como cabo al batallon 2");
          System.out.println("\n----------------------------------------------------------------------------------------");
          break;
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
