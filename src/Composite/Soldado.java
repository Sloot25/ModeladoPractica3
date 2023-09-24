package Composite;

public abstract class Soldado {
  String nombre; 
  String formacion; 
  String rango;

  public int getAtaque(){
    throw new UnsupportedOperationException();
  }
  public int getDefensa(){
    throw new UnsupportedOperationException();
  }
  public int getVelocidad(){
    throw new UnsupportedOperationException();
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
    throw new UnsupportedOperationException();
  }
}
