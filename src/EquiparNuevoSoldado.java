/*
* Clase encargada de solicitar los datos al usuario para crear
* un nuevo soldado
*/
import Composite.*;
import Decorator.*;

import java.util.Scanner;

public class EquiparNuevoSoldado {
    Scanner sc = new Scanner(System.in);
    int opcion;
    String nombre;
    String formacion = "";

    /*
     * Metodo encargado de solicitar los datos al usuario para crear
     * un nuevo soldado
     */
    public void crearNuevoSoldado(){
        System.out.println("Indique el nombre del soldado");
        nombre = sc.nextLine();
        Soldado nuevoSoldado = escogerRango(nombre);
        System.out.println(nuevoSoldado);
        agregarArma(nuevoSoldado);
    } 

    /*
     * Metodo que pregunta al usuario el rango del soldado a crear
     * 
     * @param nombre: Recibe el nombre del soldado que creo
     * 
     * @return soldado: Regresa un soldado de tipo Cabo, Teniente o Capitan
     *                  dependiendo de la opcion escogida. Con atributos como
     *                  nombre y formacion = ""
     */
    public Soldado escogerRango(String nombre){
        do {
            String menu = "Indique el rango de tu soldado.\n" +
                    "1.- Capitan.\n" +
                    "2.- Teniente.\n" +
                    "3.- Cabo.\n";
            System.out.println(menu);
            while (true) {
                try {
                    String opcionUsuario = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                } catch (NumberFormatException ex){ 
                    System.out.println("Por favor elige una opcion VALIDA:");
                    System.out.println(menu);
                }
            }
            switch (opcion) {
            case 1:
                return new Capitan(nombre,formacion); 
    
            case 2:
                return new Teniente(nombre); 

            case 3:
                return new Cabo(nombre);

            default:
                throw new IllegalArgumentException("Opcion no válida");
            }
        } while (opcion !=0);
    }

    /*
     * Metodo que pregunta el arma que portara su soldado (opcional)
     * 
     * @param nombre: Recibe el soldado instanceado en el metodo anterior
     * 
     * @return soldado: Regresa un soldado decorado con la armadura
     */
    public void agregarArma(Soldado soldado){
        int contador_armas = 0;
        do{
            String menu = "Indique la armadura que desea equipar.\n" +
                        "1.- Armadura de kevlar.\n" +
                        "2.- Armadura de grafeno.\n" +
                        "3.- Armadura de tanque.\n" +
                        "4.- Iron Cheems.\n" +
                        "5.- Espada gigante de anime.\n" +
                        "6.- Pistola de papas.\n" +
                        "7.- Rasho laser.\n" +
                        "8.- Alas de gallina.\n" +
                        "9.- Piernas de rana gigante.\n" +
                        "10.- Turbinas.\n" +
                        "0.- Finalizar";
            System.out.println(menu);
            while (true) {
                try {
                    String opcionUsuario = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                } catch (NumberFormatException ex){ 
                    System.out.println(menu);
                }
            }
            switch (opcion) {
                case 1:
                    contador_armas += 1; 
                    soldado = new ArmaduraKevlar(soldado);
                    System.out.println("REPORTE DE SOLDADO:\n");
                    System.out.println(soldado);
                    break;

                case 2:
                    contador_armas += 1;
                    soldado = new ArmaduraGrafeno(soldado);
                    System.out.println("REPORTE DE SOLDADO:\n");
                    System.out.println(soldado);
                    break;

                case 3:
                    contador_armas += 1;
                    soldado = new ArmaduraTanque(soldado);
                    System.out.println("REPORTE DE SOLDADO:\n");
                    System.out.println(soldado);
                    break;
                
                case 4:
                    if (soldado.getRango().equals("Capitan")){
                        contador_armas += 1;
                        soldado = new IronCheems(soldado); 
                        System.out.println("REPORTE DE SOLDADO:\n");
                        System.out.println(soldado);
                        break;
                    } else{
                        System.out.println("El soldado no esta autorizado para portar esta armadura.");
                        continue;
                    }
                case 5:
                    contador_armas += 1;
                    soldado = new EspadaGiganteAnime(soldado);
                    System.out.println("REPORTE DE SOLDADO:\n");
                    System.out.println(soldado);
                    break;
        
                case 6:
                    contador_armas += 1;
                    soldado = new PistolaPapas(soldado);
                    System.out.println("REPORTE DE SOLDADO:\n");
                    System.out.println(soldado);
                    break;

                case 7:
                    contador_armas += 1;
                    soldado = new RashoLaser(soldado);
                    System.out.println("REPORTE DE SOLDADO:\n");
                    System.out.println(soldado);
                    break;

                case 8:
                    contador_armas += 1;
                    soldado = new AlasGallina(soldado);
                    System.out.println("REPORTE DE SOLDADO:\n");
                    System.out.println(soldado);
                    break;

                case 9:
                    contador_armas += 1;
                    soldado = new PiernasRanaGigante(soldado);
                    System.out.println("REPORTE DE SOLDADO:\n");
                    System.out.println(soldado);
                    break;

                case 10:
                    contador_armas += 1;
                    soldado = new Turbinas(soldado);
                    System.out.println("REPORTE DE SOLDADO:\n");
                    System.out.println(soldado);
                    break;

                case 0:
                    if (contador_armas == 0){
                        System.out.println("Tu soldado no puede ir desarmado a la guerra. No seas cruel :c.");
                        continue;
                    } else{
                        System.out.println("REPORTE FINAL DE SOLDADO:\n");
                        System.out.println(soldado);
                        opcion = -1;
                        break;
                    }

                default:
                System.out.println("Opcion no valida");
            }
        } while(opcion != -1);
    }
}