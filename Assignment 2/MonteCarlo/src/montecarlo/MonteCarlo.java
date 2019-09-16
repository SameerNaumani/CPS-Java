/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlo;

/**
 *
 * @author Sameer Naumani
 * This program computes an estimate of pi by simulating dart throws onto a square
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.io.*;
import java.util.Scanner;
import javax.swing.JFrame;



public class MonteCarlo extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException, NullPointerException {
        int TRIES = 10000;
        Random generator = new Random();
        String filename = "output.csv";
        PrintWriter outputStream = new PrintWriter(filename);
        
     
        int hits = 0;
        for(int j=1; j<1000; j++){
            hits=0;
            TRIES += 100;
            for(int i = 1; i <= TRIES; i++)
            {
                //Generate two random numbers between -1 and 1
            
                double r = generator.nextDouble();
                double x = -1 + 2*r;
                r = generator.nextDouble();
                double y = -1 + 2*r;
       
              //Check wether the point lies in the unit circle
                if (x*x + y*y <= 1){
                    hits ++;
                }
            }
            double piEstimate = 4.0 * hits/TRIES;
            System.out.println("Estimate for pi: " + piEstimate);
            outputStream.println(piEstimate); //stores in RAM first
        }
       
            /* 
                The ratio hits/tries is approximately the same as the ratio
                circle area/square area = pi/4
            */
            
            //double piEstimate = 4.0 * hits/TRIES;
            //System.out.println("Estimate for pi: " + piEstimate);
  
           // outputStream.println(piEstimate); //stores in RAM first
            outputStream.close(); //flushes data to file
    }
    
}




