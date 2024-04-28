/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba06;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author ALUMNO46-203
 */
public class Control extends JPanel implements ActionListener{
    JButton btnIzquierdo, btnDerecho, btnArriba, btnAbajo;
    Bolita bolita;

    public Control() {
    }

    public Control(Bolita b) {
        this.setLayout(new BorderLayout());
        btnIzquierdo = new JButton("izquierda");
        btnDerecho = new JButton("derecha");
        btnArriba = new JButton("arriba");
        btnAbajo = new JButton("abajo");
        
        btnIzquierdo.addActionListener(this);
        btnDerecho.addActionListener(this);
        btnArriba.addActionListener(this);
        btnAbajo.addActionListener(this);
        
        bolita = new Bolita();
        bolita = b;
        add(btnIzquierdo, BorderLayout.WEST);
        add(btnDerecho, BorderLayout.EAST);
        add(btnArriba, BorderLayout.NORTH);
        add(btnAbajo, BorderLayout.SOUTH);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnIzquierdo)){
            bolita.setMoverX(bolita.getMoverX()-5);    
        }
        
        if(e.getSource().equals(btnDerecho)){
            bolita.setMoverX(bolita.getMoverX()+5);
        }
        if(e.getSource().equals(btnArriba)){
            bolita.setMoverY(bolita.getMoverY()-5);    
        }
        
        if(e.getSource().equals(btnAbajo)){
            bolita.setMoverY(bolita.getMoverY()+5);
        }
        bolita.repaint();
    }//fin de metodo
}//fin de clase
