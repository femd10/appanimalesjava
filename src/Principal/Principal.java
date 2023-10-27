/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import logica.*;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    public static void main(String[] args){
        Animal animales[]= new Animal[3];
        
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Gato();
        
        animales[0].setEdad(24);
        animales[0].setNombre("Garfield");
        animales[0].setPeso(12);
        
        animales[1].setEdad(21);
        animales[1].setNombre("firu");
        animales[1].setPeso(22);
        
        animales[2].setEdad(34);
        animales[2].setNombre("field");
        animales[2].setPeso(16);
        
        for (int i=0; i<3; i++) {

            System.out.println( animales[i].toString());
    }
    
    }
}
