/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
public class StudentTicket extends Ticket{
    public int tickNum, days, price;
    
    public StudentTicket(int num, int days){
        super(num);
        this.tickNum = num;
        this.days = days;
    }
    
    public int getPrice(){
        if(days >=10){
            price = 15;
        }
        else
            price = 30;
        
        return price;
    }
    
    @Override
    public String toString(){
         return "Number: " + tickNum + ", Price: $" + price + " (ID Required)";
    }
    
}
