package Composite;

import java.util.ArrayList;

public class Teniente extends Soldado{
  private ArrayList<Soldado> cabos;
  public Teniente(String nombre){
    cabos = new ArrayList<Soldado>();
    this.nombre = nombre; 
    this.rango = "Teniente";
  }

  /*
   * Metodos encargados de actualizar las listas de las clases teniente y 
   * capitan.
   * 
   * @param soldado: recibe un objeto de tipo soldado y loa agrega o elimina 
   *                 de la lista dependiendo el metodo
   */
  public void remove(Soldado soldado){
    cabos.remove(soldado);
  }
  public void add(Soldado soldado){
    if(!soldado.getRango().equals("Cabo"))
      throw new UnsupportedOperationException();
    soldado.setFormacion(this.getFormacion());
    cabos.add(soldado);
  }

  /*
   * Metodo encargado de ocupar los metodos toString() y 
   * reporteBatallon() para obtener la informacion de el y sus 
   * subordinados
   * 
   * @return string con toda la información del soldado y su batallon
   */
  public String reportarse(){
    return this.toString() + reporteBatallon();
  }

  /*
   * Metodo que itera sobre las listas de los tenientes para recuperar
   * la informacion de sus subordinados
   * 
   * @return string con toda la informacion de sus subordinados
   */
  public String reporteBatallon(){
    String reporte = "";
    for(Soldado soldado : cabos)
      reporte +=  soldado.reportarse() + '\n';
    return reporte;
  }

  /*
   * Metodo encargado de utilizar los getters para recuperar la 
   * informacion del soldado
   * 
   * @return string con toda la informacion del soldado
   */
  public String toString(){
      return "    " + this.rango + ": " + this.nombre + '\n' +
      "    Formacion de combate: " + getFormacion() + '\n' +
      "    Armas: " + getArmas() + '\n' +
      "    Ataque: " + this.getAtaque() + '\n' +
      "    Defensa: " + this.getDefensa() + '\n' +
      "    Velocidad: " + this.getVelocidad() + '\n';
  }

  /*
   *  @return ArrayList : una lista de los soldados a cargo de nuestro teniente
   *
   * */

  public ArrayList<Soldado> getSoldados(){
    return this.cabos;
  }
}
