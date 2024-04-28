/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba04;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ALUMNO46-203
 */
public class Contador extends JFrame implements Runnable, ActionListener{
    JLabel num; int i = 0; 
    boolean contar;
    JButton btnIniciar, btnDetener;
    Thread hilo;

    public Contador(){
        this.setTitle("contador");
        this.setSize(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,1));
        num = new JLabel(i+"");       
        add(num);
        hilo = new Thread(this);
        btnIniciar= new JButton("Iniciar");
        btnDetener= new JButton("Detener");
        btnIniciar.addActionListener(this);
        btnDetener.addActionListener(this);
        add(btnIniciar);
        add(btnDetener);
    }
    
    

    @Override
    public void run() {
        while(contar){ 
        try{
            i = i+1;
            num.setText(i+"");
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("no funciono");
        }
        }
    }

    
    public static void main(String[] args) {
        Contador c = new Contador();
        c.setVisible(true);
        Thread hilo = new Thread();
        hilo.start();
       
    }
    
    @Override
    public void actionPerformed(ActionEvent ex) {
        if(ex.getSource().equals(btnIniciar)){
            contar = true;
            System.out.println("Funcionando");
            hilo.start();
        }
        if(ex.getSource().equals(btnDetener)){
            contar = false;
            System.out.println("");        }
    }
    
}
