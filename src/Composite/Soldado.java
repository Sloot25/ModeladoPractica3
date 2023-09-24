package Composite;

import java.util.ArrayList;

import Decorator.ArmasDecorator;

public abstract class Soldado {
  String nombre; 
  String formacion; 
  String rango;
  int ataque;
  int defensa;
  int velocidad;
  ArrayList<ArmasDecorator> armas;

  public int getAtaque(){
    return ataque;
  }
  public int getDefensa(){
    return defensa;
  }
  public int getVelocidad(){
    return velocidad;
  }
  public void equipar(ArmasDecorator arma){
    armas.add(arma);
    ataque += arma.getAtaque();
    defensa += arma.getDefensa();
    velocidad += arma.getVelocidad();
  }
  public void add(Soldado soldado){
    throw new UnsupportedOperationException();
  }
  public void remove(Soldado soldado){
    throw new UnsupportedOperationException();
  }
  public void darOrden(String orden){
    throw new UnsupportedOperationException(); 
  }
  public void recibirOrden(String orden){
    throw new UnsupportedOperationException();
  }
  public String getArmas(){
    String s = "";
    for(ArmasDecorator arma: armas){
      s += arma + ", ";
    }
    return s;
  }
}
