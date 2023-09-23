import Composite.Soldado;
package Decorator; 
public class Turbinas extends ArmasDecorator{
  public Turbinas(Soldado soldado){
    this.soldado = soldado;
  }
  public int getVelocidad(){
    return soldado.getVelocidad() + 5;
  }
  public int getAtaque(){
    return soldado.getAtaque() - 2;
  }

  
}
