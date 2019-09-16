/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
import java.util.*;

public class SalesReport {
    public ArrayList<String> type = new ArrayList();
    public ArrayList<Integer> days = new ArrayList(); 
    public ArrayList<Integer> tickNum = new ArrayList();
    public String[] tokens;
    public int sales = 0;
    public int total = 0;
    public int walkin = 0;
    public int regular = 0;
    public int student = 0;
    public int average;
    public int largest;
    
    
    public SalesReport(){
        
    }
    
    public void getData(InStringFile file){ 
        
        while(!file.endOfFile()){
            total ++;
            String[] tokens = file.read().split(" ");
            tickNum.add(Integer.parseInt(tokens[0]));
            type.add(tokens[2]);
            days.add(Integer.parseInt(tokens[4]));
            
            //System.out.println(tokens[2]);
            
            for (String token : tokens)
            {
                //System.out.println(token);
            }
        }
        
        for(int i = 0; i<type.size(); i++){
            if(type.get(i).contains("walkin")){
                Ticket walk = new WalkinTicket(tickNum.get(i));
                sales += walk.getPrice();
                walkin ++;
               System.out.println(walk.toString());
            }
            else if(type.get(i).contains("regular")){
                Ticket reg = new RegularTicket(tickNum.get(i), days.get(i));
                sales += reg.getPrice();
                regular ++;
            }
                
            else if(type.get(i).contains("student")){
                Ticket stud = new StudentTicket(tickNum.get(i), days.get(i));
                sales += stud.getPrice();
                System.out.println(stud.toString());
                student++;
            }
          
        }
 
        
    }
    
    public void computeStats(){
        average = sales/total;
        largest = Integer.max(walkin, Integer.max(regular, student));
    }
    
    public void displayResults(){
        System.out.println("Sales Status");
        System.out.println("Walkin Tickets' Sales: " + walkin);
        System.out.println("Regular Tickets' Sales: " + regular);
        System.out.println("Student Tickets' Sales: " + student);
        System.out.println();
        System.out.println();
        System.out.println("Sales Analytics");
        System.out.println("Total number of tickets sold: " + total + " Tickets");
        System.out.println("Sales volume: $" + sales);
        System.out.println("Average sales is $" + average);
        System.out.println("largest sale(Regular): " + largest + " Tickets");
        
    }

}
