package Composite;

public class Cabo extends Soldado{
  String ordenRecibida; 
  public Cabo(String nombre, String formacion){
    this.nombre = nombre; 
    this.formacion = formacion; 
    this.rango = "Cabo";
    ataque = 1;
    velocidad = 1;
    defensa = 1;
  }
  public void recibirOrden(String orden){
    this.ordenRecibida = orden; 
  }
  public String reportarse(){
    return this.toString();
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
