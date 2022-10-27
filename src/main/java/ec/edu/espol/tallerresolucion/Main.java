/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.tallerresolucion;

import java.util.Scanner;
import model.Fruta;
import model.Personaje;

/**
 *
 * @author Fernando
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese el nombre del Personaje Principal: ");
        String nombrePJ1 = sc.nextLine();
        System.out.println("Por favor, ingrese el nombre del Personaje: ");
        String nombrePJ2 = sc.nextLine();
        
        Personaje personajeP = new Personaje(nombrePJ1, true);
        Personaje personajeS = new Personaje(nombrePJ2, false);
        
        System.out.println("Ingrese el nombre de la Fruta 1: ");
        String nombreF1 = sc.nextLine();
        System.out.println("Ingrese las calorias de la Fruta 1: ");
        int caloriasF1 = sc.nextInt();
        Fruta f1 = new Fruta(nombreF1, caloriasF1);
        System.out.println("Ingrese el nombre de la Fruta 2: ");
        String nombreF2 = sc.next();
        System.out.println("Ingrese las calorias de la Fruta 2: ");
        int caloriasF2 = sc.nextInt();
        Fruta f2 = new Fruta(nombreF2, caloriasF2);
        
        personajeP.recolectar(f1);
        personajeS.recolectar(f2);
        
        System.out.println("Peronaje Principal: " + personajeP.mostrarInformacion());
        System.out.println("Personaje Secundario: " + personajeS.mostrarInformacion());
    }
    
}
