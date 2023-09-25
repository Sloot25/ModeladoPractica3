package Composite;

import java.util.ArrayList;

import Decorator.ArmasDecorator;

public abstract class Soldado {
  String nombre; 
  String formacion; 
  String rango;
  String armas;
  int ataque;
  int defensa;
  int velocidad;

  public int getAtaque(){
    return ataque;
  }
  public int getDefensa(){
    return defensa;
  }
  public int getVelocidad(){
    return velocidad;
  }
  public String getRango(){
    return rango;
  }
  public String getNombre(){
    return nombre;
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
    throw new UnsupportedOperationException();
  }
  /* 
  public String toString(){
    return rango + ": " + nombre + '\n' +
      "Formacion de combate: " + formacion + '\n' +
      "Armas: " + getArmas() + '\n' +
      "Ataque: " + getAtaque() + '\n' +
      "Defensa: " + getDefensa() + '\n' +
      "Velocidad: " + getVelocidad() + '\n';
  }
  */
}
