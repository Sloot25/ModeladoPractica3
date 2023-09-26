/*
* Clase encargada de solicitar los datos al usuario para crear
* mandar a pantalla el reporte de los batallones
*/
import Composite.*; 
import Decorator.*;
import java.util.Scanner;
import java.util.ArrayList;
public class ReportarBatallones {
  ArrayList<Soldado> capitanes; 
  Soldado soldadoReporte;
  public ReportarBatallones(){
    capitanes = new ArrayList<Soldado>();
    generarBatallones();
  }

  /*
   * Metodo que le brinda las opciones al usuario para imprimir 
   * los batallones
   */
  public void reportar(){
    String menu = "Elige alguna de las siguientes opciones \n1. Reporte Completo \n2. Reporte de Batallon 2 \n3. Reporte de Cabo \n4. Reporte de Soldado Cheems";
    System.out.println(menu);
    Scanner in = new Scanner(System.in);
    int op = 0;
    while(true){
      try{
        op = in.nextInt();
        switch (op) {
          case 1:
            System.out.println(reportarse());
            return; 
          case 2: 
            System.out.println(reporteBatallon(1));
            return;
          case 3:
            System.out.println(reporteSoldadoEspecifico());
            return;
          case 4: 
            System.out.println("Aun no ha llegado el soldado cheems");
            return; 
          default:
            System.err.println("Por favor, elige alguna de las opciones");
            System.out.println(menu);
            break;
        }
      } catch(Exception e){
        System.err.println(e);
        System.err.println("Por favor, ingresa un numero");
        System.out.println(menu);
      }

    }
  }
  
  /*
   * Aqui instanciamos los batallones utilizados en los reportes
   */
  public void generarBatallones(){
    Soldado princesaDulce = new Capitan("Bonnie", "Formacion del dulce Reino");
    princesaDulce = new ArmaduraGrafeno(princesaDulce);
    princesaDulce = new RashoLaser(princesaDulce);
    princesaDulce = new Turbinas(princesaDulce);
    princesaDulce = new ArmaduraGrafeno(princesaDulce);
    Soldado gohan = new Capitan("Gohan", "Todos detras de Goku y Vegeta");
    gohan = new ArmaduraKevlar(gohan);
    gohan = new PistolaPapas(gohan);
    gohan = new EspadaGiganteAnime(gohan);
    Soldado darwin = new Capitan("Darwin", "Es por su propio bien");
    darwin = new PiernasRanaGigante(darwin);
    darwin = new PiernasRanaGigante(darwin);
    darwin = new RashoLaser(darwin);
    darwin = new ArmaduraTanque(darwin);
    Soldado marceline = new Teniente("Marceline"); 
    marceline = new Turbinas(marceline);
    marceline = new Turbinas(marceline);
    marceline = new PistolaPapas(marceline);
    princesaDulce.add(marceline);
    Soldado mentita = new Teniente("Mentita");
    mentita = new RashoLaser(mentita);
    mentita = new ArmaduraKevlar(mentita);
    mentita = new RashoLaser(mentita);
    princesaDulce.add(mentita);
    Soldado finn = new Cabo("Finn");
    finn = new EspadaGiganteAnime(finn);
    finn = new PiernasRanaGigante(finn);
    finn = new EspadaGiganteAnime(finn);
    finn = new EspadaGiganteAnime(finn);
    Soldado jake = new Cabo("Jake");
    jake = new PiernasRanaGigante(jake);
    jake = new EspadaGiganteAnime(jake);
    jake = new PiernasRanaGigante(jake);
    jake = new ArmaduraTanque(jake);
    Soldado reyHelado = new Cabo("Simon");
    reyHelado = new PistolaPapas(reyHelado);
    reyHelado = new ArmaduraGrafeno(reyHelado);
    marceline.add(finn);
    marceline.add(jake);
    marceline.add(reyHelado);
    Soldado cervezaDeRaiz = new Cabo("cerveza de raiz");
    cervezaDeRaiz = new EspadaGiganteAnime(cervezaDeRaiz);
    mentita.add(cervezaDeRaiz);
    Soldado gunter = new Cabo("gunter");
    gunter = new EspadaGiganteAnime(gunter);
    gunter = new Turbinas(gunter);
    mentita.add(gunter);
    Soldado vegeta = new Teniente("Vegeta");
    vegeta = new EspadaGiganteAnime(vegeta);
    vegeta = new ArmaduraGrafeno(vegeta);
    vegeta = new ArmaduraKevlar(vegeta);
    Soldado picoro = new Teniente("Picoro");
    picoro = new PiernasRanaGigante(picoro);
    picoro = new RashoLaser(picoro);
    picoro = new ArmaduraTanque(picoro);
    gohan.add(vegeta);
    gohan.add(picoro);
    Soldado goku = new Cabo("Goku");
    Soldado trunks = new Cabo("Trunks");
    Soldado gotenks = new Cabo("Gotenks");
    Soldado krilin = new Cabo("krilin"); 
    Soldado roshi = new Cabo("Maestro Roshi");
    goku = new Turbinas(goku);
    goku = new RashoLaser(goku);
    trunks = new EspadaGiganteAnime(trunks);
    gotenks = new ArmaduraTanque(gotenks);
    gotenks = new RashoLaser(gotenks);
    krilin = new PistolaPapas(krilin);
    roshi = new Turbinas(roshi);
    roshi = new PistolaPapas(roshi);
    vegeta.add(trunks);
    vegeta.add(gotenks);
    picoro.add(goku);
    picoro.add(krilin);
    picoro.add(roshi);
    Soldado gumball = new Teniente("Gumball");
    Soldado anais = new Teniente("Anais");
    gumball = new EspadaGiganteAnime(gumball);
    gumball = new PistolaPapas(gumball);
    anais = new ArmaduraGrafeno(anais);
    anais = new Turbinas(anais);
    anais = new EspadaGiganteAnime(anais);
    darwin.add(gumball);
    darwin.add(anais);
    Soldado nicole = new Cabo("Nicole");
    Soldado richard = new Cabo("Richard");
    Soldado penny = new Cabo("Penny");
    Soldado bobert = new Cabo("Bobert");
    Soldado zack = new Cabo("Zack");

    nicole = new ArmaduraTanque(nicole);
    nicole = new ArmaduraKevlar(nicole);
    nicole = new EspadaGiganteAnime(nicole);
    richard = new RashoLaser(richard);
    richard = new ArmaduraTanque(richard);
    penny = new PistolaPapas(penny);
    zack = new ArmaduraTanque(zack);
    zack = new EspadaGiganteAnime(zack);
    bobert = new RashoLaser(bobert);
    gumball.add(penny);
    gumball.add(zack);
    gumball.add(bobert);
    anais.add(nicole);
    anais.add(richard);
    this.soldadoReporte = gunter;
    capitanes.add(princesaDulce);
    capitanes.add(gohan);
    capitanes.add(darwin);
  }

   /*
   * Metodos encargados de actualizar la lista capitanes
   * 
   * @param soldado: recibe un objeto de tipo soldado y los agrega o elimina 
   *                 de la lista dependiendo el metodo
   */
  public void add(Soldado soldado){
    if(!soldado.getRango().equals("Capitan"))
      throw new UnsupportedOperationException();
    capitanes.add(soldado);
  }
  public void remove(Soldado soldado){
    capitanes.remove(soldado);
  }

  /*
   * Metodo utilizado para el reporte del batallon 2
   * 
   * @param int: entero que sera la posicion de la lista capitanes
   * 
   * @return string: reporte del capitan y su batallon  
   */
  public String reporteBatallon(int i){
    if(i < 0 || i > capitanes.size()-1)
      throw new UnsupportedOperationException();
    return capitanes.get(i).reportarse();
  }

  /*
   * Metodo para lanzar el reporte del soldado Gunter, instanceado
   * en el metodo generarBatallones()
   * 
   * @return string: reporte del soldado
   */
  public String reporteSoldadoEspecifico(){
    return this.soldadoReporte.reportarse();
  }

  /*
   * Metodo que itera sobre la lista capitanes para imprimir el
   * reporte de todos tenientes y subordinados
   * 
   * @return string: reporte de todos los batallones
   */
  public String reportarse(){
    String reporte = ""; 
    for(Soldado soldado : capitanes)
      reporte += soldado.reportarse() + '\n' + '\n';
    return reporte;
  }
}
