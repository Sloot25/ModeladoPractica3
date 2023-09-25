package Decorator;

import Composite.Soldado;

public abstract class ArmasDecorator extends Soldado {
  Soldado soldado; 
  String nombre;
  public String toString(){
    return nombre;
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
  public void darOrden(String orden){
    this.soldado.darOrden(orden);
  }
  public void recibirOrden(String orden){
    this.soldado.recibirOrden(orden);
  }
  public String getArmas(){
    return nombre + ", " + soldado.getArmas();
  }
}
