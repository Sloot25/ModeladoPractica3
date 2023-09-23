import java.util.ArrayList;
package Composite;
public class Teniente extends Soldado{
  ArrayList<Soldado> cabos;
  String ordenRecibida;
  public Teniente(String nombre, String formacion){
    this.nombre = nombre; 
    this.formacion = formacion; 
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
  public void remove(Soldado soldado){
    cabos.remove(soldado);
  }
  public void add(Soldado soldado){
    cabos.add(soldado);
  }
  public void darOrden(String orden){
    for(Soldado soldado : cabos)
      soldado.recibirOrden(orden);
  }
  public void recibirOrden(String orden){
    this.ordenRecibida = orden; 
    this.darOrden(orden);
  }
  public String reportarse(){
    String reporte = this.toString();
    for(Soldado soldado : tenientes)
      reporte += "    " + soldado.toString();
    return reporte;
  }
  public String toString(){
    return this.rango + ": " + this.nombre + '\n'
      "Formacion de combate: " + this.formacion + '\n' 
      "Armas: " + this.getArmas() + '\n'
      "Ataque: " + this.getAtaque() + '\n'
      "Defensa: " + this.getDefensa() + '\n' 
      "Velocidad: " + this.getVelocidad() + '\n';
  }
}
