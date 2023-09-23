import Composite.Soldado; 
package Decorator; 
public class IronCheems extends ArmasDecorator{
  public IronCheems(Soldado soldado){
    this.soldado = soldado; 
  }
  public int getAtaque(){
    return soldado.getAtaque() + 2;
  }
  public int getDefensa(){
    return soldado.getDefensa() + 2; 
  }
  public int getVelocidad(){
    return soldado.getVelocidad() + 2;
  }
}
