package com.openbootcamp.demospring.models;

public class Bootcamper {
    private String nombre;
    public Bootcamper() {}
    public Bootcamper(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    @Override
    public String toString() {return "Bootcamper{" + "nombre='" + nombre + '\'' + '}';}
}
