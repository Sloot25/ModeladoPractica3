import Composite.Soldado;

public class CheemsAdapter extends Soldado{
  String nombre;
  int id;
  private CheemsSoldado cheems;
  public CheemsAdapter(String nombre, int id){
    this.nombre = nombre;
    this.id = id;
    cheems = new CheemsSoldado(nombre, id);
  }
  @Override
  public int getAtaque(){
    return 5;
  }
  @Override
  public int getDefensa(){
    return 5; 
  }
  public int getVelocidad(){
    return 5;
  }
  @Override 
  public String getArmas(){
    return cheems.mostrarReliquias();
  }
  @Override
  public String reportarse() {
    return cheems.infoCheems();
  }
    
}
