package Decorator; 

import Composite.Soldado; 

public class RashoLaser extends ArmasDecorator{
  public RashoLaser(Soldado soldado){
    this.soldado = soldado; 
  }
  public int getAtaque(){
    return soldado.getAtaque() + 2;
  }
  public int getVelocidad(){
    return soldado.getVelocidad() - 1;
  }
  public String getArmas(){
    return "Rasho laser, " + soldado.getArmas();
  }
}
