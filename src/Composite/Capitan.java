package Composite;

import java.util.ArrayList;

public class Capitan extends Soldado {
  ArrayList<Soldado> tenientes; 

  public Capitan(String nombre, String formacion){
    this.nombre = nombre; 
    this.formacion = formacion; 
    this.rango = "Capitan";
  }

  public void add(Soldado soldado){
    if(!soldado.getRango().equals("Teniente"))
      throw new UnsupportedOperationException();
    soldado.setFormacion(this.formacion);
    tenientes.add(soldado);
  }
  public void remove(Soldado soldado){
    tenientes.remove(soldado);
  }
  public String reportarse(){
    String reporte = this.toString();
    for(Soldado soldado : tenientes)
      reporte += "    " + soldado.toString();
    return reporte;
  }
  public String toString(){
    return this.rango + ": " + this.nombre + '\n'+
      "Formacion de combate: " + this.formacion + '\n' +
      "Armas: " + this.getArmas() + '\n' +
      "Ataque: " + this.getAtaque() + '\n' +
      "Defensa: " + this.getDefensa() + '\n' +
      "Velocidad: " + this.getVelocidad() + '\n';
  }
}
