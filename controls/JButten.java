/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javafx.scene.Cursor;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author HP Probook
 */
public class JButten extends JButton {
    
    public JButten(){
   
        setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.white);
        
        
            
            }
        
    
    @Override
    public void paintComponent(Graphics g){
    g.setColor(Color.lightGray);
    g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
            super.paintComponent(g);

    }

    @Override
    public void paintBorder(Graphics g){
    g.setColor(Color.lightGray);
    g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
    }

}