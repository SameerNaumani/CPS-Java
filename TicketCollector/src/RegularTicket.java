/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
public class RegularTicket extends Ticket {
    public int tickNum, days, price;
    
    public RegularTicket(int num, int days){
        super(num);
        this.tickNum = num;
        this.days = days;
    }
    
    public int getPrice(){
        if(days >=10){
            price = 20;
        }
        else
            price = 30;
        
        return price;
    }
    
}
