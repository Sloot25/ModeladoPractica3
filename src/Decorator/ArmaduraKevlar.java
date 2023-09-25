package Decorator; 

import Composite.Soldado;

public class ArmaduraKevlar extends ArmasDecorator{
  public ArmaduraKevlar(Soldado soldado){
    this.soldado = soldado;
    this.nombre = "Armadura de kevlar";
  }
  public int getVelocidad(){
    return this.soldado.getVelocidad() - 1;
  }
  public int getDefensa(){
    return this.soldado.getDefensa() + 2;
  }
  
}
