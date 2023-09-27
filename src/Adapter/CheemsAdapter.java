import Composite.Soldado;

public class CheemsAdapter extends Soldado{
  String nombre;
  String rango;
  String formacion;
  int id;
  private CheemsSoldado cheems;
  public CheemsAdapter(String nombre, int id){
    this.nombre = nombre;
    this.id = id;
    cheems = new CheemsSoldado(nombre, id);
  }
  @Override
  public int getAtaque(){
    return (int)cheems.getAtaqueMagico();
  }
  @Override
  public int getDefensa(){
    return (int)cheems.getDefensaMagica(); 
  }
  public int getVelocidad(){
    return (int)cheems.getMovimientoMagico();
  }
  @Override 
  public String getArmas(){
    return cheems.mostrarReliquias();
  }
  @Override
  public String getNombre(){
    return this.nombre;
  }
  @Override
  public String getRango(){
    return this.rango;
  }
  @Override
  public String getFormacion(){
    return this.formacion;
  }
  @Override
  public String reportarse() {
    return cheems.infoCheems();
  }
    
}
