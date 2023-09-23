import Composite.Soldado; 
package Decorator; 
public class PiernasRanaGigante extends ArmasDecorator{
  public PiernasRanaGigante(Soldado soldado){
    this.soldado = soldado;
  }
  public int getVelocidad(){
    return soldado.getVelocidad() + 3;
  }
  public int getDefensa(){
    return soldado.getDefensa() - 1;
  }
}
