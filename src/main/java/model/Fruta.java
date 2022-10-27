/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fernando
 */
public class Fruta {
    private String nombre;
    private int cantidadCalorias;

    public Fruta(String nombre, int cantidadCalorias) {
        this.nombre = nombre;
        this.cantidadCalorias = cantidadCalorias;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public int getCantidadCalorias() {
        return cantidadCalorias;
    }

    @Override
    public String toString() {
        return "Fruta{" + "nombre=" + nombre + ", cantidadCalorias=" + cantidadCalorias + '}';
    }
    
    

    
    
}
