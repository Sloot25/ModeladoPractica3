package Decorator;

import Composite.Soldado;

public abstract class ArmasDecorator extends Soldado {
  Soldado soldado; 
  String nombre;
  public String toString(){
    return nombre;
  }
  public String getFormacion(){
    return soldado.getFormacion();
  }
  public void setFormacion(String formacion){
    soldado.setFormacion(formacion);
  }
  public int getAtaque(){
    return soldado.getAtaque();
  }
  public int getVelocidad(){
    return soldado.getVelocidad();
  }
  public int getDefensa(){
    return soldado.getDefensa();
  }
  public void add(Soldado soldado){
    this.soldado.add(soldado);
  }
  public void remove(Soldado soldado){
    this.soldado.remove(soldado);
  }
  public String getArmas(){
    return nombre + ", " + soldado.getArmas();
  }
  public String getRango(){
    return this.soldado.getRango();
  }
  public String reportarse(){
    return soldado.reportarse();
  }
}
