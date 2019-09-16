
import java.util.Iterator;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
public class Testt {
    
    public static void main(String[] args) {
    
    SimpleDatabase simpleDb = new SimpleDatabase();
    
    LinkedList<Shape> list = new LinkedList<Shape>();
    
    Shape rect = new Shape("red");
    RectangleShape rect2 = new RectangleShape(10,10,"RED");
    RectangleShape rect3 = new RectangleShape(10,10,"RED");
    list.insert(list, rect);
    list.insert(list, rect2);
    list.insert(list, rect3);
    
    
    simpleDb.addShape(rect);
    simpleDb.storeShapes();
    
    LinkedList<Shape> list2 = simpleDb.getShapes();
    
    Iterator iterator = list2.iterator();
    while(iterator.hasNext()){
        Shape s = (Shape)iterator.next();
        
        System.out.println(s.getColour());
    }
   
    
 
   
        



    }

}

