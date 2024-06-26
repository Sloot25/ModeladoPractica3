package Decorator; 

import Composite.Soldado; 

public class IronCheems extends ArmasDecorator{
  public IronCheems(Soldado soldado){
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
   * Actualiza el valor de la defensa del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es velocidad actualizada
   */
  public int getDefensa(){
    return soldado.getDefensa() + 2; 
  }

  /*
   * Actualiza el valor de la velocidad del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es velocidad actualizada
   */
  public int getVelocidad(){
    return soldado.getVelocidad() + 2;
  }

  /*
   * Actualiza el valor de las armas del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es velocidad actualizada
   */
  public String getArmas(){
    return "IronCheems, " + soldado.getArmas();
  }
}
