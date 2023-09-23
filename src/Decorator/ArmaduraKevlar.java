import Composite.Soldado;
package Decorator; 

public class ArmaduraKevlar extends ArmasDecorator{
  public ArmaduraKevlar(Soldado soldado){
    this.soldado = soldado;
  }
  public int getVelocidad(){
    return this.soldado.getVelocidad() - 1;
  }
  public int getDefensa(){
    return this.soldado.getDefensa() + 2;
  }
  
}
