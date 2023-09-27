package Decorator; 

import Composite.Soldado;

public class ArmaduraKevlar extends ArmasDecorator{
  public ArmaduraKevlar(Soldado soldado){
    this.soldado = soldado;
  }
  /*
   * Actualiza el valor de la velocidad del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es velocidad actualizada
   */
  public int getVelocidad(){
    return this.soldado.getVelocidad() - 1;
  }

   /*
   * Actualiza el valor de la defensa del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es defensa actualizada
   */
  public int getDefensa(){
    return this.soldado.getDefensa() + 2;
  }

   /*
   * Actualiza el valor de las armas del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return string con las armas que va equipando
   */
  public String getArmas(){
    return "Armadura de kevlar, " + soldado.getArmas();
  }

  public int getAtaque(){
    return soldado.getAtaque();
  }
  
}
