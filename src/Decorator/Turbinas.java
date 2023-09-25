package Decorator; 

import Composite.Soldado;

public class Turbinas extends ArmasDecorator{
  public Turbinas(Soldado soldado){
    this.soldado = soldado;
    this.nombre = "Turbinas";
  }
  public int getVelocidad(){
    return soldado.getVelocidad() + 5;
  }
  public int getAtaque(){
    return soldado.getAtaque() - 2;
  }

  
}
