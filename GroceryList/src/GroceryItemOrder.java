/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
public class GroceryItemOrder {
    public final String name;
    public int quantity;
    public final double pricePerItem;
   
    public GroceryItemOrder(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.pricePerItem = price;
    }
    
    
    //Setter and getter methods
    
    public double getCost(){
        return quantity * pricePerItem;
    }
    
    public void setQuantity(int newQuantity){
        quantity = newQuantity;
    }
}
