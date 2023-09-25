package Decorator;

import Composite.Soldado;

public abstract class ArmasDecorator extends Soldado {
  Soldado soldado; 

  public String getFormacion(){
    return soldado.getFormacion();
  }
  public String getNombre(){
    return soldado.getNombre();
  }
  public void setFormacion(String formacion){
    soldado.setFormacion(formacion);
  }
  public void add(Soldado soldado){
    this.soldado.add(soldado);
  }
  public void remove(Soldado soldado){
    this.soldado.remove(soldado);
  }
  public String getRango(){
    return this.soldado.getRango();
  }
  public String reporteBatallon(){
    return soldado.reporteBatallon();
  }

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
  public String toString(){
    return  this.getRango() + ": " + this.getNombre() + '\n' +
      "Formacion de combate: " + getFormacion() + '\n' +
      "Armas: " + getArmas() + '\n' +
      "Ataque: " + this.getAtaque() + '\n' +
      "Defensa: " + this.getDefensa() + '\n' +
      "Velocidad: " + this.getVelocidad() + '\n';
  }
}
