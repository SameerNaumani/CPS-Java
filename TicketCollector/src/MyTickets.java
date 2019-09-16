/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
public class MyTickets {
    
   public static void main (String [] args)
    {   
        //Load sales data
        InStringFile salesReader = new InStringFile("sales.txt");
        // create sales report
        SalesReport ticketsSales = new SalesReport();
        ticketsSales.getData(salesReader);
        // sales analytics computations
        ticketsSales.computeStats();
        //Display the results
        ticketsSales.displayResults(); }
}
