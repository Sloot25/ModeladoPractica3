package Decorator; 

import Composite.Soldado; 

public class PiernasRanaGigante extends ArmasDecorator{
  public PiernasRanaGigante(Soldado soldado){
    this.soldado = soldado;
    this.nombre = "Piernas de rana gigante";
  }
  public int getVelocidad(){
    return soldado.getVelocidad() + 3;
  }
  public int getDefensa(){
    return soldado.getDefensa() - 1;
  }
}
