package Composite;

public class Cabo extends Soldado{
  public Cabo(String nombre){
    this.nombre = nombre; 
    this.rango = "Cabo";
  }

  public String reportarse(){
    return this.toString();
  }
  public String getNombre(){
    return this.nombre; 
  }
  public String toString(){
    return "        " + this.rango + ": " + this.nombre + '\n' +
      "        Formacion de combate: " + this.formacion + '\n' +
      "        Armas: " + this.getArmas() + '\n' +
      "        Ataque: " + this.getAtaque() + '\n' +
      "        Defensa: " + this.getDefensa() + '\n' +
      "        Velocidad: " + this.getVelocidad() + '\n';
  }
}
