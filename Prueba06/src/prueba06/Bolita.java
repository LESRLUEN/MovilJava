/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba06;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author ALUMNO46-203
 */
public class Bolita extends Canvas {
    int moverX, moverY;

    public Bolita() {
        this.setSize(400,200);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.fillOval(moverX,moverY, 30,30);
    }

    public int getMoverX() {
        return moverX;
    }

    public void setMoverX(int moverX) {
        this.moverX = moverX;
    }

    public int getMoverY() {
        return moverY;
    }

    public void setMoverY(int moverY) {
        this.moverY = moverY;
    }
    
    
    
}
