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
public class Personaje {
    private String nombre;
    private int puntosGanados;
    private boolean esPrincipal;
    
    
   public Personaje(String nombre, boolean esPrincipal){
       this.nombre = nombre;
       this.esPrincipal = esPrincipal;
   }
   
   public Personaje(String nombre){
       this.nombre = nombre;
   }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosGanados() {
        return puntosGanados;
    }

    public boolean isEsPrincipal() {
        return esPrincipal;
    }
    
    public void recolectar(Fruta fruta){
        if(esPrincipal){
            this.puntosGanados = 2 * fruta.getCantidadCalorias();
        } else {
            this.puntosGanados = fruta.getCantidadCalorias();
        }
    }
    
    public String mostrarInformacion(){
        return "Personaje{ nombre="+this.nombre+", puntosGanados="+this.puntosGanados+", esPrincipal=" + this.esPrincipal+"}";
    }
    
    
}
