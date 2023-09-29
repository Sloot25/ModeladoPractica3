import Composite.Soldado;
import java.util.ArrayList;

public class CheemsAdapter extends Soldado{
  String rango;
  String formacion;
  ArrayList<Soldado> soldados;
  private CheemsSoldado cheems;
  String espaciado;
  public CheemsAdapter(CheemsSoldado cheems, String rango){
    this.cheems = cheems;
    this.rango = rango; 
    this.soldados = new ArrayList<Soldado>();
    espaciado = "";
    this.formacion = "";    
    switch(this.rango){
      case "Cabo":
        espaciado += "    ";
      case "Teniente":
        espaciado += "    ";
        break;
    }
  }
  public void setFormacion(String formacion){
    this.formacion = formacion;
  }
  public void add(Soldado soldado){
    if(rango.equals("Cabo") || (rango.equals("Teniente") && !soldado.getRango().equals("Cabo")) || (rango.equals("Capitan") && !soldado.getRango().equals("Teniente")) )
      throw new UnsupportedOperationException("El proceso de agregar soldado a Cheems ha fallado");
    soldados.add(soldado);
  }
  public void remove(Soldado soldado){
    if(rango.equals(soldado))
      throw new UnsupportedOperationException("El rango de cheems es cabo");
    soldados.remove(soldado);
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
    return '\n'+ espaciado + cheems.mostrarReliquias().replace("\n", '\n' + espaciado);
  }
  @Override
  public String getNombre(){
    return "Cheems";
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

    return  espaciado + this.getRango() + ": " + this.getNombre() + '\n'+
    espaciado + "Formacion de combate: " + this.getFormacion() + '\n' +
    espaciado + "Armas: " + this.getArmas() + '\n' +
    espaciado + "Ataque: " + this.getAtaque() + '\n' +
    espaciado + "Defensa: " + this.getDefensa() + '\n' +
    espaciado + "Velocidad: " + this.getVelocidad() + '\n' + reporteBatallon();
  }
  @Override 
  public String reporteBatallon(){
    if(rango.equals("Cabo"))
      return "";
    String reporte = "";
    for(Soldado soldado : soldados)
      reporte += soldado.reportarse() + '\n';
    return reporte; 
  }
    
}
