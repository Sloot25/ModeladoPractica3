package Composite;

public abstract class Soldado {
  String nombre; 
  String formacion; 
  String rango;

  public int getAtaque(){
    return 1;
  }
  public int getDefensa(){
    return 1;
  }
  public int getVelocidad(){
    return 1;
  }
  public void setFormacion(String formacion){
    this.formacion = formacion;
  }
  public void add(Soldado soldado){
    throw new UnsupportedOperationException();
  }
  public void remove(Soldado soldado){
    throw new UnsupportedOperationException();
  }
  public String getArmas(){
    return "";
  }
  public String getRango(){
    return this.rango;
  }
}
