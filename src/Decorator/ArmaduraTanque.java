package Decorator;

import Composite.Soldado; 

public class ArmaduraTanque extends ArmasDecorator{
  public ArmaduraTanque(Soldado soldado){
    this.soldado = soldado; 
  }
  public int getDefensa(){
    return soldado.getDefensa() + 5;
  }
  public int getVelocidad(){
    return soldado.getVelocidad() - 5; 
  }
}
