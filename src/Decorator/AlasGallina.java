package Decorator;

import Composite.Soldado;

public class AlasGallina extends ArmasDecorator{
    public AlasGallina(Soldado soldado){
        this.soldado = soldado; 
        this.nombre = "Alas de gallina";
      }
      public int getDefensa(){
        return soldado.getDefensa() - 1; 
      }
      public int getVelocidad(){
        return soldado.getVelocidad() + 2;
      }
}
