import java.io.*;
import java.util.NoSuchElementException;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */

public class SimpleDatabase extends LinkedList<Shape> {

	/*
	 * ArrayList for Part A. for Part B, they should be LinkedList
	 */
	LinkedList<Shape> shapes = new LinkedList<Shape>();
	LinkedList<Shape> storedShapes = new LinkedList<Shape>();
	
	/*
	 * Constructor to initialize the two ArrayList's for Part A. For Part B, they should be LinkedList
	 */
	public SimpleDatabase(){
		this.shapes = new LinkedList();
		this.storedShapes = new LinkedList();
	}
	
	/*
	 * Get the list of shapes from the simple database
	 * Part A: You should get an ArrayList
	 * Part B: You should get a LinkedList
	 */
	public Shape getShapes(){
            Iterator<Shape> iterator = shapes.iterator();
            
            while(iterator.hasNext()){
                return iterator.next();
            }
        
            return null;
       
	}
	
	

	/*
	 * Add a shape to the simple database
	 * Part A: Add to an ArrayList
	 * Part B: Add to a LinkedList
	 */
	public void addShape(Shape s){
            insert(shapes, s);
		
	}

	
	/*
	 * Get the latest shape added to the simple database
	 * Part A: Get latest shape from ArrayList
	 * Part B: Get latest shape from LinkedList
	 */
	public Shape getLatestShape(){
            return shapes.getLast();
		
	}


	
	/*
	 * Get a shape from an index
	 * Part A: Get from an index in ArrayList
	 * Part B: Get from a LinkedList appropriately with the given index
	 */
	public Shape getShapesFrom(int i){
		return shapes.get(i);
	}


	
	/*
	 * Store the shapes in the simple database
	 * Part A: Store in ArrayList
	 * Part B: Store in LinkedList
	 */
	public void storeShapes(){
		storedShapes.clear();
		for(Shape element : shapes){
			insert(storedShapes,element);
		}

	}

	/*
	 * Get the stored shapes from the simple database
	 * Part A: restore from ArrayList
	 * Part B: restore from LinkedList
	 */
	public void restoreShapes(){
		LinkedList<Shape> temp = shapes;
		shapes = storedShapes;
		storedShapes = temp;

	} 
	
	/*
	 * Remove a shape from an index
	 * Part A: Remove from an index in ArrayList
	 * Part B: Remove from the LinkedList appropriately with the given index
	 */
	public void remove(int i){
                remove(shapes,i);
	}
	
	
}
