package Composite;

public abstract class Soldado {
  String nombre; 
  String formacion; 
  String rango;

  /*
   * Metodos getters y setters empleados, donde los getAtaque, defensa, velocidad 
   * y armas seran empleados por el patron decorator para actualizar sus valores
   * sin necesidad de instanciar variables
   */
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
  public String getFormacion(){
    return this.formacion;
  }
  public String getArmas(){
    return "";
  }

  /*
   * Metodos encargados de actualizar las listas de las clases teniente y 
   * capitan.
   * 
   * @param soldado: recibe un objeto de tipo soldado y los agrega o elimina 
   *                 de la lista dependiendo el metodo
   */
  public void add(Soldado soldado){
    throw new UnsupportedOperationException();
  }
  public void remove(Soldado soldado){
    throw new UnsupportedOperationException();
  }

  /*
   * Metodo encargado de ocupar los metodos toString() y 
   * reporteBatallon() para obtener la informacion de el y sus 
   * subordinados
   * 
   * @return string con toda la información del soldado y su batallon
   */
  abstract public String reportarse();
  
  /*
   * Metodo que itera sobre las listas de los tenientes y capitanes para 
   * recuperar la informacion de sus subordinados
   * 
   * @return string con toda la informacion de sus subordinados
   */
  public String reporteBatallon(){
    throw new UnsupportedOperationException();
  }

  /*
   *  Si quieren que poder elegir a nuestro soldado venga desde el composite: 
   *
   *  public ArrayLidt<Soldado> getSoldados();
   *
   * */


}
