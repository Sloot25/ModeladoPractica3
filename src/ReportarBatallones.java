import Composite.*; 

public class ReportarBatallones {
  ArrayList<Soldado> capitanes; 
  Soldado soldadoReporte;
  public ReportarBatallones(){}
  
  public void generarBatallones(){
    Soldado princesaDulce = new Capitan("Bonnie", "Formacion del dulce Reino");
    Soldado gohan = new Capitan("Gohan", "Todos detras de Goku y Vegeta");
    Soldado darwin = new Capitan("Darwin", "Es por su propio bien");
    Soldado marceline = new Teniente("Marceline"); 
    princesaDulce.add(marceline);
    Soldado mentita = new Teniente("Mentita");
    princesaDulce.add(mentita);
    Soldado finn = new Cabo("Finn");
    Soldado jake = new Cabo("Jake");
    Soldado reyHelado = new Cabo("Simon");
    marceline.add(finn);
    marceline.add(jake);
    marceline.add(reyHelado);
    Soldado cervezaDeRaiz = new Cabo("cerveza de raiz");
    mentita.add(cervezaDeRaiz);
    Soldado gunter = new Cabo("gunter");
    mentita.add(gunter);
    Soldado vegeta = new Teniente("Vegeta");
    Soldado picoro = new Teniente("Picoro");
    gohan.add(vegeta);
    gohan.add(picoro);
    Soldado goku = new Cabo("Goku");
    Soldado trunks = new Cabo("Trunks");
    Soldado gotenks = new Cabo("Gotenks");
    Soldado krilin = new Cabo("krilin"); 
    Soldado roshi = new Cabo("Maestro Roshi");
    vegeta.add(trunks);
    vegeta.add(gotenks);
    picoro.add(goku);
    picoro.add(krilin);
    picoro.add(roshi);
    Soldado gumball = new Teniente("Gumball");
    Soldado anais = new Teniente("Anais");
    darwin.add(gumball);
    darwin.add(anais);
    gumball.add(penny);
    gumball.add(zack);
    gumball.add(bobert);
    anais.add(nicole);
    anais.add(richard);
    Soldado nicole = new Cabo("Nicole");
    Soldado richard = new Cabo("Richard");
    Soldado penny = new Cabo("Penny");
    Soldado bobert = new Cabo("Bobert");
    Soldado zack = new Cabo("Zack");

    this.soldadoReporte = gunter;


    
    
    
  }
  public void add(Soldado soldado){
    if(!soldado.getRango().equals("Capitan"))
      throw new UnSupportedOperationException();
    capitanes.add(soldado);
  }
  public void remove(Soldado soldado){
    capitanes.remove(soldado);
  }
  public String reporteBatallon(int i){
    if(i < 0 || i > capitanes.size()-1)
      throw UnSupportedOperationException();
    return capitanes[i].reportarse();
  }
  public String reporteSoldadoEspecifico(){
    return gunter.reportarse();
  }
  public String reportarse(){
    String reporte = ""; 
    for(Soldado soldado : capitanes)
      reporte += soldado.reportarse() + '\n\n';
    return reportarse;
  }
}
