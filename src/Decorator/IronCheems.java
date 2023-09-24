package Decorator; 

import Composite.Soldado; 

public class IronCheems extends ArmasDecorator{
  public IronCheems(Soldado soldado){
    this.soldado = soldado; 
    this.nombre = "IronCheems";
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
