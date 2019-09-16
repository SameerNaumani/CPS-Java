/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
public class WalkinTicket extends Ticket {
    public int tickNum;
    public final int price = 40;
    
    public WalkinTicket(int num){
        super(num);
        this.tickNum = num;
    }
    
    @Override
    public int getPrice(){
        return price;
    }
    
}
