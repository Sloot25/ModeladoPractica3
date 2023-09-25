package Decorator; 

import Composite.Soldado; 

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
  public String getArmas(){
    return "Piernas de rana gigante, " + soldado.getArmas();
  }
}
