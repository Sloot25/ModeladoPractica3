package Decorator; 

import Composite.Soldado;

public class EspadaGiganteAnime extends ArmasDecorator{
  public EspadaGiganteAnime(Soldado soldado){
    this.soldado = soldado; 
    this.nombre = "Espada gigante de anime";
  }
  public int getAtaque(){
    return soldado.getAtaque() + 3; 
  }
  public int getDefensa(){
    return soldado.getDefensa() - 1;
  }
}
