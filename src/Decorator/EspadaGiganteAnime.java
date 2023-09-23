import Composite.Soldado;
package Decorator; 
public class EspadaGiganteAnime extends ArmasDecorator{
  public EspadaGiganteAnime(Soldado soldado){
    this.soldado = soldado; 
  }
  public int getAtaque(){
    return soldado.getAtaque() + 3; 
  }
  public int getDefensa(){
    return soldado.getDefensa() - 1;
  }
}
