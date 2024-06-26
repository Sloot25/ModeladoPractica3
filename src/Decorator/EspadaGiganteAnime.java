package Decorator; 

import Composite.Soldado;

public class EspadaGiganteAnime extends ArmasDecorator{
  public EspadaGiganteAnime(Soldado soldado){
    this.soldado = soldado; 
  }

  /*
   * Actualiza el valor del ataque del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es velocidad actualizada
   */
  public int getAtaque(){
    return soldado.getAtaque() + 3; 
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
   * Actualiza el valor de las armas del soldado o armaduras 
   * que estemos decorando 
   * 
   * @return int que es velocidad actualizada
   */
  public String getArmas(){
    return "Espada gigante de anime, " + soldado.getArmas();
  }

  public int getVelocidad(){
    return soldado.getVelocidad();
  }
}
