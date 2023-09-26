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
        nuevoSoldado = agregarArmadura(nuevoSoldado);
        nuevoSoldado = agregarArma(nuevoSoldado);
        nuevoSoldado = agregarComplemento(nuevoSoldado);
        System.out.println(nuevoSoldado);
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
     * Metodo que pregunta la armadura que portara su soldado (opcional)
     * 
     * @param nombre: Recibe el soldado instanceado en el metodo anterior
     * 
     * @return soldado: Regresa un soldado decorado con la armadura
     */
    public Soldado agregarArmadura(Soldado soldado){
        do{
            String menu = "Indique la armadura que desea equipar.\n" +
                        "1.- Armadura de kevlar.\n" +
                        "2.- Armadura de grafeno.\n" +
                        "3.- Armadura de tanque.\n" +
                        "4.- Iron Cheems.\n" +
                        "0.- Sin armadura";
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
                    return new ArmaduraKevlar(soldado);
        
                case 2:
                    return new ArmaduraGrafeno(soldado);

                case 3:
                    return new ArmaduraTanque(soldado);
                
                case 4:
                    if (soldado.getRango().equals("Capitan")){
                        return new IronCheems(soldado); 
                    } else{
                        System.out.println("El soldado no esta autorizado para portar esta armadura.");
                    }
                case 0:
                    System.out.println("Soldado sin armadura...");
                    break;
                default:
                System.out.println("Opcion no valida");
            }
        }while(opcion != 0);
        return soldado;
    }

    /*
     * Metodo que pregunta el arma que portara su soldado (obligatorio ya que
     * ningun soldado debe ir desarmado)
     * 
     * @param nombre: Recibe el soldado instanceado en el metodo anterior
     * 
     * @return soldado: Regresa un soldado decorado con rl arma
     */
    public Soldado agregarArma(Soldado soldado){
        boolean booleano = true;
        System.out.println("Indique el arma que desea equipar. (Obligatorio).");
        while (booleano){
            System.out.println("1.- Espada gigante de anime.\n" +
                            "2.- Pistola de papas.\n" +
                            "3.- Rasho laser.\n");
             
            try {
                String opcionUsuario = sc.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
            } catch (NumberFormatException ex){ 
                System.out.println("Por favor elige una opcion VALIDA:");
                continue;
            }

            switch (opcion) {
                case 1:
                    return new EspadaGiganteAnime(soldado);
        
                case 2:
                    return new PistolaPapas(soldado);

                case 3:
                    return new RashoLaser(soldado);

                default:
                    throw new IllegalArgumentException("Opcion no válida");  
            }
        }
        return soldado;
    }

    /*
     * Metodo que pregunta el complemento que portara su soldado (opcional)
     * 
     * @param nombre: Recibe el soldado instanceado en el metodo anterior
     * 
     * @return soldado: Regresa un soldado decorado con el complemento
     */
    public Soldado agregarComplemento(Soldado soldado){
        do{
            String menu = "Indique el complemeto que desea equipar.\n" +
                        "1.- Alas de gallina.\n" +
                        "2.- Piernas de rana gigante.\n" +
                        "3.- Turbinas.\n" +
                        "0.- Sin complemento";
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
                    return new AlasGallina(soldado);
        
                case 2:
                    return new PiernasRanaGigante(soldado);

                case 3:
                    return new Turbinas(soldado);

                case 0:
                    System.out.println("Soldado sin complemento..."); 
                    return soldado;

                default:
                    throw new IllegalArgumentException("Opcion no válida");
            }
        } while(opcion != 0);
    }


}
