package Decorator; 

import Composite.Soldado; 

public class RashoLaser extends ArmasDecorator{
  public RashoLaser(Soldado soldado){
    this.soldado = soldado; 
  }

  /*
   * Actualiza el valor del ataque del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es velocidad actualizada
   */
  public int getAtaque(){
    return soldado.getAtaque() + 2;
  }

  /*
   * Actualiza el valor de la velocidad del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es velocidad actualizada
   */
  public int getVelocidad(){
    return soldado.getVelocidad() - 1;
  }

  /*
   * Actualiza el valor de las armas del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es velocidad actualizada
   */
  public String getArmas(){
    return "Rasho laser, " + soldado.getArmas();
  }
}
