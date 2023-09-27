package Decorator; 

import Composite.Soldado;

public class ArmaduraGrafeno extends ArmasDecorator{
  public ArmaduraGrafeno(Soldado soldado){
    this.soldado = soldado; 
  }

  /*
   * Actualiza el valor de la defensa del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es velocidad actualizada
   */
  public int getDefensa(){
    return soldado.getDefensa() + 3; 
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
    return "Armadura de grafeno, " + soldado.getArmas();
  }

  public int getAtaque(){
    return soldado.getAtaque();
  }
}
