package Composite;

public abstract class Soldado {
  String nombre; 
  String formacion; 
  String rango;

  public int getAtaque(){
    throw new UnSupportedOperationException();
  }
  public int getDefensa(){
    throw new UnSupportedOperationException();
  }
  public int getVelocidad(){
    throw new UnSupportedOperationException();
  }
  public void add(Soldado soldado){
    throw new UnSupportedOperationException();
  }
  public void remove(Soldado soldado){
    throw new UnSupportedOperationException();
  }
  public void darOrden(Soldado soldado){
    throw new UnSupportedOperationException(); 
  }
  public void recibirOrden(Soldado soldado){
    throw new UnSupportedOperationException();
  }
  public String getArmas(){
    throw new UnSupportedOperationException();
  }
}
