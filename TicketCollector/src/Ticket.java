/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
;
/**
 *
 * @author Sameer Naumani
 */
public class Ticket {
    public int tickNum, price;
    
    public Ticket(int num){
        this.tickNum = num;
    }
    
    //getter
    public int getPrice(){
        return price;
    }
    
    public String toString(){
        return "Number: " + tickNum + ", Price: $" + price ;
    }
}
