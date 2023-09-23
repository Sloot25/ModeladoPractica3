import Composite.Soldado; 
package Decorator; 

public class PistolaPapas extends ArmasDecorator {
  public PistolaPapas(Soldado soldado){
    this.soldado = soldado; 
  }
  public int getAtaque(){
    return soldado.getAtaque() + 2;
  }
  public int getDefensa(){
    return soldado.getDefensa() - 1;
  }
}
