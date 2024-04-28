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
public class Peluqueria {
    
    public void cortarPelo(Perro perro01){
        if(perro01.getPelo()){
   
        perro01.setPelo(false);
        
        }else{
            System.out.println("Nada que cortar");
        }
        
}
    
    
}
