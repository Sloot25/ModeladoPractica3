package Decorator;

import Composite.Soldado;

public class AlasGallina extends ArmasDecorator{
    public AlasGallina(Soldado soldado){
        this.soldado = soldado; 
      }
      public int getDefensa(){
        return soldado.getDefensa() - 1; 
      }
      public int getVelocidad(){
        return soldado.getVelocidad() + 2;
      }
      public String getArmas(){
        return "Alas de gallina, " + soldado.getArmas();
      }
    
}
