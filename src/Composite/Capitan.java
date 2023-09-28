package Composite;

import java.util.ArrayList;

public class Capitan extends Soldado {
  ArrayList<Soldado> tenientes; 

  public Capitan(String nombre, String formacion){
    tenientes = new ArrayList<Soldado>();
    this.nombre = nombre; 
    this.formacion = formacion; 
    this.rango = "Capitan";
  }

  /*
   * Metodos encargados de actualizar las listas de las clases teniente y 
   * capitan.
   * 
   * @param soldado: recibe un objeto de tipo soldado y los agrega o elimina 
   *                 de la lista dependiendo el metodo
   */
  public void add(Soldado soldado){
    if(!soldado.getRango().equals("Teniente"))
      throw new UnsupportedOperationException();
    soldado.setFormacion(getFormacion());
    tenientes.add(soldado);
  }
  public void remove(Soldado soldado){
    tenientes.remove(soldado);
  }

  /*
   * Metodo encargado de ocupar los metodos toString() y 
   * reporteBatallon() para obtener la informacion de el y sus 
   * subordinados
   * 
   * @return string con toda la información del soldado y su batallon
   */
  public String reportarse(){
    return toString() + reporteBatallon();
  }

  /*
   * Metodo que itera sobre las listas de los capitanes para recuperar
   * la informacion de sus subordinados
   * 
   * @return string con toda la informacion de sus subordinados
   */
  public String reporteBatallon(){
    String reporte = "";
    for(Soldado soldado : tenientes)
      reporte += soldado.reportarse() + '\n';
    return reporte;
  }

  /*
   * Metodo encargado de utilizar los getters para recuperar la 
   * informacion del soldado
   * 
   * @return string con toda la informacion del soldado
   */
  public String toString(){
    return  this.rango + ": " + this.nombre + '\n'+
      "Formacion de combate: " + this.formacion + '\n' +
      "Armas: " + this.getArmas() + '\n' +
      "Ataque: " + this.getAtaque() + '\n' +
      "Defensa: " + this.getDefensa() + '\n' +
      "Velocidad: " + this.getVelocidad() + '\n';
  }

  /*
   *  public ArrayList<Soldado> getSoldados();
   *
   * */


}
