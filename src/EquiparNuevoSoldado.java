import Composite.*;
import Decorator.*;

import java.util.Scanner;

public class EquiparNuevoSoldado {
    Scanner sc = new Scanner(System.in);
    int opcion;
    String nombre;
    String formacion;


    public void crearNuevoSoldado(){
        // pide el nombre del soldado
        System.out.println("Indique el nombre del soldado");
        nombre = sc.nextLine();
        
        // no es necesario que tenga formacion
        formacion = "MataJudios";

        // construye un objeto de tipo Capitan, Teniente o Cabo 
        // depende de lo que elija el usuario
        Soldado nuevoSoldado = escogerRango(nombre, formacion);

        // con ayuda de un bucle, le preguntara que armas desea agregarle
        // al soldado
        nuevoSoldado = agregarArmadura(nuevoSoldado);
        nuevoSoldado = agregarArma(nuevoSoldado);
        nuevoSoldado = agregarComplemento(nuevoSoldado);

        
        // imprime en pantalla todas las estadisticas
        /*  
        System.out.println(nuevoSoldado.getRango() + ": " + nuevoSoldado.getNombre() + '\n' +
        "Formacion de combate: " + formacion + '\n' +
        "Armas: " + nuevoSoldado.getArmas() + '\n' +
        "Ataque: " + nuevoSoldado.getAtaque() + '\n' +
        "Defensa: " + nuevoSoldado.getDefensa() + '\n' +
        "Velocidad: " + nuevoSoldado.getVelocidad() + '\n');
        */
        System.out.println(nuevoSoldado);

    } 

    public Soldado escogerRango(String nombre, String formacion){
        System.out.println("Indique el rango de tu soldado.");
        System.out.println("1.- Capitan.\n" +
                        "2.- Teniente.\n" +
                        "3.- Cabo.\n");
        while (true) {
            try {
                String opcionUsuario = sc.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                break;
            } catch (NumberFormatException ex){ 
                System.out.println("Por favor elige una opcion VALIDA:");
                System.out.println("1.- Capitan.\n" +
                                "2.- Teniente.\n" +
                                "3.- Cabo.\n");
            }
		}

        switch (opcion) {
            case 1:
                return new Capitan(nombre, formacion); 
    
            case 2:
                return new Teniente(nombre); 

            case 3:
                return new Cabo(nombre);

            default:
                throw new IllegalArgumentException("Tipo de soldado no válido");
        }
    }

    public Soldado agregarArmadura(Soldado soldado){
        do{
            System.out.println("Indique la armadura que desea equipar.");
            System.out.println("1.- Armadura de kevlar.\n" +
                            "2.- Armadura de grafeno.\n" +
                            "3.- Armadura de tanque.\n" +
                            "4.- Iron Cheems.\n" +
                            "0.- Sin armadura");
            while (true) {
                try {
                    String opcionUsuario = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                } catch (NumberFormatException ex){ 
                    System.out.println("Por favor elige una opcion VALIDA:");
                    System.out.println("1.- Armadura de kevlar.\n" +
                            "2.- Armadura de grafeno.\n" +
                            "3.- Armadura de tanque.\n" +
                            "4.- Iron Cheems.\n" +
                            "0.- Sin armadura");
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
                    throw new IllegalArgumentException("Opcion no válida");
            }
        }while(opcion != 0);
        return soldado;
    }

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

    public Soldado agregarComplemento(Soldado soldado){
        do{
            System.out.println("Indique el complemeto que desea equipar.");
            System.out.println("1.- Alas de gallina.\n" +
                            "2.- Piernas de rana gigante.\n" +
                            "3.- Turbinas.\n" +
                            "0.- Sin complemento");
            while (true) {
                try {
                    String opcionUsuario = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                } catch (NumberFormatException ex){ 
                    System.out.println("Por favor elige una opcion VALIDA:");
                    System.out.println("1.- Alas de gallina.\n" +
                            "2.- Piernas de rana gigante.\n" +
                            "3.- Turbinas.\n" +
                            "0.- Sin complemento");
                }
            }

            switch (opcion) {
                case 1:
                    //return new AlasGallina(soldado);
        
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
