package prueba;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author arman
 */
public class Edad extends JFrame implements ActionListener {
    JTextField txtEdad;
    JPanel panel01;
    JButton b1 = null;

    public Edad(){
        this.setSize(30,90);
        this.setTitle("Edad");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtEdad = new JTextField(20);
        panel01 = new JPanel(new GridLayout(2,1));
        b1 = new JButton("Dame tu edad");
        b1.addActionListener(this);
        panel01.add(txtEdad);
        panel01.add(b1);
        add(panel01);
        
    }

    public Edad(JTextField txtEdad, JPanel panel01) throws HeadlessException {
        this.txtEdad = txtEdad;
        this.panel01 = panel01;
    }
    
    public void actionPerformed(ActionEvent e){
        int edad = Integer.parseInt(txtEdad.getText());
        String res = null;
        if(edad >= 18){
            res = "Eres Mayor de edad";
        }
        else{
                res = "Eres menor de edad";
        }
        JOptionPane.showMessageDialog(null, res);
        
      
        
    }

  
    
    
    
}
