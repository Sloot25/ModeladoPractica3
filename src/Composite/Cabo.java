package Composite;

public class Cabo extends Soldado{
  public Cabo(String nombre){
    this.nombre = nombre; 
    this.rango = "Cabo";
  }
  /*
   * Metodo encargado de ocupar el metodo toString() para obtener 
   * toda la información del soldado 
   * 
   * @return string con toda la información del soldad
   */
  public String reportarse(){
    return this.toString();
  }

  /*
   * Metodo que itera sobre las listas de los tenientes y capitanes para 
   * recuperar la informacion de sus subordinados
   * 
   * @return string vacio ya que el Cabo no tiene subordinados
   */
  public String reporteBatallon(){
    return "";
  }

  /*
   * Metodo encargado de utilizar los getters para recuperar la 
   * informacion del soldado
   * 
   * @return string con toda la informacion del soldado
   */
  public String toString(){
    return "        " + this.rango + ": " + this.nombre + '\n' +
      "        Formacion de combate: " + getFormacion() + '\n' +
      "        Armas: " + getArmas() + '\n' +
      "        Ataque: " + this.getAtaque() + '\n' +
      "        Defensa: " + this.getDefensa() + '\n' +
      "        Velocidad: " + this.getVelocidad() + '\n';
  }
}
