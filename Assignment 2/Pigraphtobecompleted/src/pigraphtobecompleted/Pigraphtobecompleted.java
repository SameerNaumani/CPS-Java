/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pigraphtobecompleted;

/**
 *
 * @author Sameer Naumani
 */


/**
 * Here is a draft of graphical demo for PI calculation (assignment1).
 * complete the program and after making it a running program try to make it
 * a well written object oriented program with all required enhancements.
 *
 * Note that this program is written as the hint and is not a working program. It should be
 * completed in the places shown by "?" and then should be tested. You can write your own
 * program from the scratch if it is easier for you.
 */

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import javax.swing.JPanel;
import java.awt.geom.*;
import java.awt.Color;

public class Pigraphtobecompleted // responsible for viewing the component and its drawing call that Pigraphviewer
{
    static final int FRAME_WIDTH = 960; //select proper size for the frame
    static final int FRAME_HEIGHT = 960;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Create the window
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Assignment1 Graphical Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create a componenent so that we can draw shapes
        PiComponent component = new PiComponent();
        
        //Add component to fram
        frame.add(component);
        
        frame.setVisible(true);
    }
    
}


class PiComponent extends JComponent   //Responsible for drawing PI estimation graphically
{   
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Pigraph pil = new Pigraph();
        pil.draw(g2);
    }
    
    class Pigraph{
        private double pointsInCircle = 0;
        private double pointsInSquare = 0;
        private int R = 250;
        private int repeat = 100000; //select proper number of repeat for PI estimation
        
        public void draw(Graphics2D g2){
            double x=0;
            double y=0;
            for(int i=0; i<repeat; i++){
                x = (double) Math.random()*2*R;
                y = (double) Math.random()*2*R;
                
                pointsInSquare = pointsInSquare + 1;
                
                if(Math.sqrt((x-R)*(x-R) + (y-R)*(y-R)) < R){ //If the random point is inside the circle
                    pointsInCircle = pointsInCircle + 1;
                    g2.setColor(Color.RED);
                    // Fill here to show a small red component to show a point inside the circle
                   // ---------------------------------
                   g2.draw(new Line2D.Double(x,y,x,y));
                }
                else{
                    g2.setColor(Color.BLUE);
                    //Fill here to show a small blue componenet to show a point inside the square
                    g2.draw(new Line2D.Double(x,y,x,y));
                }
                
                //Draw the Graph
                //
                g2.setColor(Color.MAGENTA);
                //Fill here to show an approximation of converge to PI by a graph in magenta color
                double estimate = pointsInCircle/pointsInSquare*4;
                //System.out.println(pointsInCircle/pointsInSquare*4);
               
                Point2D.Double from = new Point2D.Double(i,estimate*100 + 400);
                Point2D.Double to = new Point2D.Double(i,estimate*100 + 400);
                Line2D.Double segment = new Line2D.Double(from, to);
                g2.draw(segment);
   
                
              
            }
            
            g2.setColor(Color.BLACK);
            g2.drawString(Double.toString(pointsInCircle/pointsInSquare*4), 0, 850);
            System.out.println("PI estimated to: " + pointsInCircle/pointsInSquare*4);
            
        }
        
        
    }

}
