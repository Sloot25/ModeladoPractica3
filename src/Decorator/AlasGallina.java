package Decorator; 

import Composite.Soldado;

public class AlasGallina extends ArmasDecorator{
  public AlasGallina(Soldado soldado){
    this.soldado = soldado; 
  }
  
  /*
   * Actualiza el valor de la defensa del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es velocidad actualizada
   */
  public int getDefensa(){
    return soldado.getDefensa() - 1; 
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
    return "Alas de gallina, " + soldado.getArmas();
  }

  public int getAtaque(){
    return soldado.getAtaque();
  }
  
}
