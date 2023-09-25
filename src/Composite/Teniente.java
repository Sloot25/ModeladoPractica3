package Composite;

import java.util.ArrayList;

public class Teniente extends Soldado{
  ArrayList<Soldado> cabos;
  public Teniente(String nombre){
    cabos = new ArrayList<Soldado>();
    this.nombre = nombre; 
    this.rango = "Teniente";
  }
  public void remove(Soldado soldado){
    cabos.remove(soldado);
  }
  public void add(Soldado soldado){
    if(!soldado.getRango().equals("Cabo"))
      throw new UnsupportedOperationException();
    soldado.setFormacion(this.getFormacion());
    cabos.add(soldado);
  }
  public String getRango(){
    return this.rango;
  }
  public String reportarse(){
    return this.toString() + reporteBatallon();
  }
  public String reporteBatallon(){
    String reporte = "";
    for(Soldado soldado : cabos)
      reporte +=  soldado.reportarse() + '\n';
    return reporte;
  }
  public String toString(){
      return "    " + this.rango + ": " + this.nombre + '\n' +
      "    Formacion de combate: " + getFormacion() + '\n' +
      "    Armas: " + getArmas() + '\n' +
      "    Ataque: " + this.getAtaque() + '\n' +
      "    Defensa: " + this.getDefensa() + '\n' +
      "    Velocidad: " + this.getVelocidad() + '\n';
  }
}
