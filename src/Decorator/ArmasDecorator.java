package Decorator;

import Composite.Soldado;

public abstract class ArmasDecorator extends Soldado {
  Soldado soldado; 
  String nombre;
  public String toString(){
    return nombre;
  }
}
