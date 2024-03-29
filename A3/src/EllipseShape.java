import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.geom.Ellipse2D;

import com.sun.prism.Graphics;

//import StudentVersion.Shape;


/*
* Component that draws an ellipse based on mouse position
* 
* Note that this program is written as the hint and is not a working program. It should be
* completed and then should be tested. You can write your own program from the scratch if 
* it is easier for you.
*/
public class EllipseShape extends Shape
{  

    private int xCoord, yCoord;
    private final int RADIUS = 20;

    
    /**
        Constructor to create an ellipse based on the mouse coordinates given from the drawPanel
     */
    public EllipseShape(int x, int y, String colourName){
        super(colourName);
        this.xCoord = x;
        this.yCoord = y;
    }

    /**
     * Returns the shape's name
     */
    @Override
    public String getShapeName()
    {
    	return "Ellipse";
    }

    /**
     * Return the x-coordinate of the mouse position for the ellipse
     */
    public int getX(){
        return xCoord;
    }


    
    /**
     * Return the y-coordinate of the mouse position for the ellipse
     */
    public int getY(){
        return yCoord;
    }
   

    /**
     * 	Draw an ellipse
     */   
    public void draw(Graphics2D g2){
        Ellipse2D.Double ellipse = new Ellipse2D.Double(xCoord,yCoord, RADIUS,RADIUS);
        if(getColour().equalsIgnoreCase("blue"))
            g2.setColor(Color.BLUE);
        else if (getColour().equalsIgnoreCase("orange"))
            g2.setColor(Color.ORANGE);
        
        g2.fill(ellipse);

    }

    
}
