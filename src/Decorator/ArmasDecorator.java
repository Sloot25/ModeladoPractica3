/*
 * Clase Decorator que atribuye responsabilidades a las clases
 * de tipo soldado
 */
package Decorator;

import java.util.ArrayList;
import Composite.Soldado;

public abstract class ArmasDecorator extends Soldado {
  Soldado soldado; 

  /*
   * Metodos getters y setters
   */
  public void setFormacion(String formacion){
    soldado.setFormacion(formacion);
  }
  public String getRango(){
    return this.soldado.getRango();
  }
  public String getNombre(){
    return soldado.getNombre();
  }
  public String getFormacion(){
    return soldado.getFormacion();
  }

  /*
   * Metodos encargados de actualizar las listas de las clases teniente y 
   * capitan.
   * 
   * @param soldado: recibe un objeto de tipo soldado y loa agrega o elimina 
   *                 de la lista dependiendo el metodo
   */
  public void add(Soldado soldado){
    this.soldado.add(soldado);
  }
  public void remove(Soldado soldado){
    this.soldado.remove(soldado);
  }

  /*
   * Metodo encargado de obtener la informacion del sldado y sus subordinados
   * Este es el qeu se ocupa en la clase ReportarBatallones
   * 
   * @return string con toda la información del soldado y su batallon
   */
  public String reportarse(){
    String espaciado = "";
    switch (soldado.getRango()) {
      case "Teniente":
        espaciado = "    ";
        break;
      case "Cabo":
        espaciado = "        ";
        break;
    }
    return  espaciado + this.getRango() + ": " + this.getNombre() + '\n'+
    espaciado + "Formacion de combate: " + this.getFormacion() + '\n' +
    espaciado + "Armas: " + this.getArmas() + '\n' +
    espaciado + "Ataque: " + this.getAtaque() + '\n' +
    espaciado + "Defensa: " + this.getDefensa() + '\n' +
    espaciado + "Velocidad: " + this.getVelocidad() + '\n' + reporteBatallon();
  }

  /*
   * Metodo que itera sobre las listas de los tenientes y capitanes para 
   * recuperar la informacion de sus subordinados
   * 
   * @return string con toda la informacion de sus subordinados
   */
  public String reporteBatallon(){
    return soldado.reporteBatallon();
  }

  /*
   * Metodo encargado de utilizar los getters para recuperar la 
   * informacion del soldado, este es ocupado en la clase EquiparNuevoSoldado
   * 
   * @return string con toda la informacion del soldado
   */
  public String toString(){
    return  this.getRango() + ": " + this.getNombre() + '\n' +
      "Formacion de combate: " + getFormacion() + '\n' +
      "Armas: " + getArmas() + '\n' +
      "Ataque: " + this.getAtaque() + '\n' +
      "Defensa: " + this.getDefensa() + '\n' +
      "Velocidad: " + this.getVelocidad() + '\n';
  }

  /*
   * @return ArrayList: Regresa una lista de los soldados a cargo de nuestro soldado 
   * */

  public ArrayList<Soldado> getSoldados(){
    return this.soldado.getSoldados();
  }

}
