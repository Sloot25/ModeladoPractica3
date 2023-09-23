import Composite.Soldado; 
package Decorator; 
public class ArmaduraGrafeno extends ArmasDecorator{
  public ArmaduraGrafeno(Soldado soldado){
    this.soldado = soldado; 
  }
  public int getDefensa(){
    return soldado.getDefensa() + 3; 
  }
  public int getVelocidad(){
    return soldado.getVelocidad() - 1;
  }
}
