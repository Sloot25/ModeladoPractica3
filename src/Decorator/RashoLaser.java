package Decorator; 

import Composite.Soldado; 

public class RashoLaser extends ArmasDecorator{
  public RashoLaser(Soldado soldado){
    this.soldado = soldado; 
    this.nombre = "Rasho laser";
  }
  public int getAtaque(){
    return soldado.getAtaque() + 2;
  }
  public int getVelocidad(){
    return soldado.getVelocidad() - 1;
  }
}
