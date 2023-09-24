package Decorator; 

import Composite.Soldado; 

public class PistolaPapas extends ArmasDecorator {
  public PistolaPapas(Soldado soldado){
    this.soldado = soldado; 
    this.nombre = "Pistola de papas";
  }
  public int getAtaque(){
    return soldado.getAtaque() + 2;
  }
  public int getDefensa(){
    return soldado.getDefensa() - 1;
  }
}
