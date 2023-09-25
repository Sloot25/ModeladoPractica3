package Composite;

import java.util.ArrayList;

public class Teniente extends Soldado{
  ArrayList<Soldado> cabos;
  public Teniente(String nombre){
    this.nombre = nombre; 
    this.rango = "Teniente";
  }

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

  public void remove(Soldado soldado){
    cabos.remove(soldado);
  }
  public void add(Soldado soldado){
    soldado.setFormacion(this.formacion);
    cabos.add(soldado);
  }

  public String reportarse(){
    String reporte = this.toString();
    for(Soldado soldado : cabos)
      reporte += "    " + soldado.toString();
    return reporte;
  }
  public String getNombre(){
    return this.nombre;
  }
  public String toString(){
    return this.rango + ": " + this.nombre + '\n' +
      "Formacion de combate: " + this.formacion + '\n' +
      "Armas: " + this.getArmas() + '\n' +
      "Ataque: " + this.getAtaque() + '\n' +
      "Defensa: " + this.getDefensa() + '\n' +
      "Velocidad: " + this.getVelocidad() + '\n';
  }
}
