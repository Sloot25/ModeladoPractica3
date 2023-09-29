import Composite.Soldado;
import java.util.ArrayList;

public class CheemsAdapter extends Soldado{
  private String rango;
  private String formacion;
  private ArrayList<Soldado> soldados;
  private CheemsSoldado cheems;
  private String espaciado;

  /*  Constructor de la clase
   *
   *  @param CheemsSoldado; Recibe un cheems al cual sera aplicado el adaptador 
   *          String: Recibe el rango que tendra nuestro cheems 
   *    
   *  Inicializa nuestros atributos, incluyendo un espaciado correspondiente al rango de nuestro cheems
   *
   * */
  public CheemsAdapter(CheemsSoldado cheems, String rango){
    this.cheems = cheems;
    this.rango = rango; 
    this.soldados = new ArrayList<Soldado>();
    espaciado = "";
    this.formacion = "";    
    switch(this.rango){
      case "Cabo":
        espaciado += "    ";
      case "Teniente":
        espaciado += "    ";
        break;
    }
  }

  /*  Asigna el valor recibido como atributo de clase     
   *
   *  @Param String: recibe una cadena correspondiente a la formacion de nuestro batallon 
   *
   * */
  public void setFormacion(String formacion){
    this.formacion = formacion;
  }

  /*  Añade un soldado a nuestro cheems dependiendo del rango de nuestro cheems y del rango del soldado recibido
   *  Si cheems es cabo no pude recibir soldado 
   *  Si cheems es teniente, pero no recibe un cabo entonces no puede ser añadido 
   *  Si cheems es Capitan, pero no recibe un teniente entonces no puede ser añadido 
   *
   *  @param Soldado: El soldado a ser añadido 
   *
   * */
  
  public void add(Soldado soldado){
    if(rango.equals("Cabo") || (rango.equals("Teniente") && !soldado.getRango().equals("Cabo")) || (rango.equals("Capitan") && !soldado.getRango().equals("Teniente")) )
      throw new UnsupportedOperationException("El proceso de agregar soldado a Cheems ha fallado");
    soldados.add(soldado);
  }

  /*  Remueve un soldado de nuestro ArrayList, si cheems es cabo no puede realizar esta accion porque cheems es un cabo 
   *
   *  @param  Soldado: Recibe el soldado a ser eliminado 
   *
   * */

  public void remove(Soldado soldado){
    if(rango.equals("Cabo"))
      throw new UnsupportedOperationException("El rango de cheems es cabo");
    soldados.remove(soldado);
  }

  /*  Regresa un entero correspondiente al ataque/defensa/velocidad con el que llega cheems
   *  
   *  @return int: Correspondiente al ataque/defensa/velocidad de cheems
   *
   * */

  @Override
  public int getAtaque(){
    return (int)cheems.getAtaqueMagico();
  }
  @Override
  public int getDefensa(){
    return (int)cheems.getDefensaMagica(); 
  }
  public int getVelocidad(){
    return (int)cheems.getMovimientoMagico();
  }

  /*  Regresa un String con las armas con las que ha llegado cheems, a este String se le reemplaza el 
   *  salto de linea para unirlo con un espaciado, esto porque se busca que los espacios concuerden al 
   *  momento de reportarse 
   *
   *  @return String: cadena de las armas actuales de cheems
   *
   * */

  @Override 
  public String getArmas(){
    return '\n'+ espaciado + cheems.mostrarReliquias().replace("\n", '\n' + espaciado);
  }

  /*  Regresa el nombre de Cheems como Cheems 
   *
   *  @return String: Cheems
   *
   * */

  @Override
  public String getNombre(){
    return "Cheems";
  }

  /*  Devuelve el rango actual de nuestro cheems 
   *
   *  @return String: correspondiente al rango
   *
   * */

  @Override
  public String getRango(){
    return this.rango;
  }

  /*  Devuelve la formacion actual de nuestro cheems 
   *
   *  @return String: correspondiente a la formacion 
   *
   * */

  @Override
  public String getFormacion(){
    return this.formacion;
  }

  /*  Devuelve en forma de cadena un reporte de nuestro cheems 
   *
   *  @return String correspondiente al reporte de nuestro cheems
   *
   * */

  @Override
  public String reportarse() {

    return  espaciado + this.getRango() + ": " + this.getNombre() + '\n'+
    espaciado + "Formacion de combate: " + this.getFormacion() + '\n' +
    espaciado + "Armas: " + this.getArmas() + '\n' +
    espaciado + "Ataque: " + this.getAtaque() + '\n' +
    espaciado + "Defensa: " + this.getDefensa() + '\n' +
    espaciado + "Velocidad: " + this.getVelocidad() + '\n' + reporteBatallon();
  }

  /*  Regresa un reporte del batallon a cargo de cheems si es que este existe 
   *
   *  @return String: correspondiente al reporte del batallon de cheems
   *
   * */

  @Override 
  public String reporteBatallon(){
    if(rango.equals("Cabo"))
      return "";
    String reporte = "";
    for(Soldado soldado : soldados)
      reporte += soldado.reportarse() + '\n';
    return reporte; 
  }
    
}
