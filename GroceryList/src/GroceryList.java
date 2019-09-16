/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.Iterator;
/**
 *
 * @author Sameer Naumani
 */
public class GroceryList{
    private GroceryItemOrder[] items = new GroceryItemOrder[10];
    public int numItems = 0;
    
    public GroceryList(){
      
    }
    
    // Accessor - getter method
    public void add(GroceryItemOrder itemOrder){
        if(itemOrder == null) {
            throw new NullPointerException();
        }
        else if(numItems <= 10){
           items[numItems] = itemOrder;
           //System.out.println(items[numItems].name);
        }
        numItems ++;
        
    }
    
    public String getTotalCost(){
        double sum = 0.0;
        for(GroceryItemOrder element : items){
            sum += element.getCost();
        }
        return String.format("Total cost of items added to grocery list %7.2f\n", sum);
        
    }
    
    public String toString() {
        for(int i = 0; i<10; i++){
            String s = items[i].name;
            System.out.println("Item no. " + (i+1) + " " + s);
        }
        return " ";
    }
    
    public boolean GroceryListQuery(String itemName){
        for(int i = 0 ; i<10; i++){
            if(items[i].name.equals(itemName))
                return true;
        }
        return false;
    }
    
}
 