/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase210224;

/**
 *
 * @author CAE_Alumno-50-203
 */
public class Perro {
    private String nombre;
    private boolean pelo;

public Perro() {
    this.nombre = "Toby";
    this.pelo = true;

    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getPelo() {
        return pelo;
    }

    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", pelo=" + pelo + '}';
    }
    
    
}
