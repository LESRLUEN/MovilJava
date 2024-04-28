/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba06;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ALUMNO46-203
 */
public class Contrrolador extends JFrame{
    JPanel pBolita, pControl;

    public Contrrolador(){
        this.setTitle("mover");
        this.setSize(400,408);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,1));
        this.setResizable(false);
        
        Bolita b = new Bolita();
        pBolita = new JPanel();
        pControl = new Control();//falta clase
        pBolita.add(b);
        Control control = new Control(b);
        pControl.add(control);
        add(pBolita);
        add(pControl);
        
      
    }
    
     public static void main(String[] args) {
        Contrrolador c = new Contrrolador();
        c.setVisible(true);
        
    }
    
    
    
    
    
}
