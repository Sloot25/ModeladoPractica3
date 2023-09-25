package Composite;

public abstract class Soldado {
  String nombre; 
  String formacion; 
  String rango;
  int ataque;
  int defensa;
  int velocidad;
  String armas = "";

  public int getAtaque(){
    return ataque;
  }
  public int getDefensa(){
    return defensa;
  }
  public int getVelocidad(){
    return velocidad;
  }
  public void add(Soldado soldado){
    throw new UnsupportedOperationException();
  }
  public void remove(Soldado soldado){
    throw new UnsupportedOperationException();
  }
  public void darOrden(String orden){
    throw new UnsupportedOperationException(); 
  }
  public void recibirOrden(String orden){
    throw new UnsupportedOperationException();
  }
  public String getArmas(){
    return armas;
  }
  public String getRango(){
    return rango;
  }
}
