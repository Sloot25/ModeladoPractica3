package Composite;

import java.util.ArrayList;

public class Teniente extends Soldado{
  ArrayList<Soldado> cabos;
  public Teniente(String nombre){
    this.nombre = nombre; 
    this.rango = "Teniente";
  }
  public void remove(Soldado soldado){
    cabos.remove(soldado);
  }
  public void add(Soldado soldado){
    if(!soldado.getRango().equals("Cabo"))
      throw new UnsupportedOperationException();
    soldado.setFormacion(this.formacion);
    cabos.add(soldado);
  }

  public String reportarse(){
    String reporte = this.toString();
    for(Soldado soldado : cabos)
      reporte += "    " + soldado.reportarse();
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
