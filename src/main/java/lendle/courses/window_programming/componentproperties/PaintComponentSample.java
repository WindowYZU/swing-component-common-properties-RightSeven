/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.window_programming.componentproperties;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle HI
 */
public class PaintComponentSample extends JPanel{
    //利用 paintComponent 讓 JPanel 畫出一個橢圓
    
    @Override
    protected void paintComponent(Graphics g) {
        int width = this.getWidth();
        int height = this.getHeight();
        g.setColor(Color.red);
        g.drawOval(0, 0, width, height);
        g.setColor(Color.blue);
        g.drawLine(0, 0, width, height);
        g.draw3DRect(0, 0, width, height, false);
    }

    //////////////////////////////////////////
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        PaintComponentSample c=new PaintComponentSample();
        frame.add(c);
        frame.setVisible(true);
    }
    
}
