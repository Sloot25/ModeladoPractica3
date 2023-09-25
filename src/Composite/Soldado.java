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
  public String getRango(){
    return this.rango;
  }
  public String getNombre(){
    return this.nombre;
  }
  public void add(Soldado soldado){
    throw new UnsupportedOperationException();
  }
  public void remove(Soldado soldado){
    throw new UnsupportedOperationException();
  }
  abstract public String reportarse();
  public String reporteBatallon(){
    throw new UnsupportedOperationException();
  }
  public String getFormacion(){
    return this.formacion;
  }
  public String getArmas(){
    return "";
  }
  /* 
  public String toString(){
    return rango + ": " + nombre + '\n' +
      "Formacion de combate: " + formacion + '\n' +
      "Armas: " + getArmas() + '\n' +
      "Ataque: " + getAtaque() + '\n' +
      "Defensa: " + getDefensa() + '\n' +
      "Velocidad: " + getVelocidad() + '\n';
  }
  */
}
