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
public class Clase210224 { //PruebaPeluqueria

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro01 = new Perro();
        
        System.out.println(perro01);
        
        perro01.setNombre("Snoopy");
        
        Peluqueria p = new Peluqueria();
        p.cortarPelo(perro01); //nombra el booleano a false
        
        System.out.println(perro01);
        System.out.println("Tiene pelo: " + perro01.getPelo());
    }
    
}
