/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args){
		//Declare and initialize variable
		String itemName="";
		int quantity = 0 ;
		double pricePerItem = 0;
		StringTokenizer tokenizer;
		int itemsNum = 0;

		//Create object for GroceryList
		GroceryList list = new GroceryList();
		
		//Load grocery list 
		InStringFile GroceryListReader=new InStringFile("GroceryList.txt");

		// Read country.txt line by line and create a country object for each line
		// Use do-while statement to setup country object
		while (!GroceryListReader.endOfFile()){
		   String GroceryListLine = GroceryListReader.read();
		   tokenizer=new StringTokenizer(GroceryListLine);
		   itemName=tokenizer.nextToken();
		   pricePerItem = Double.parseDouble(tokenizer.nextToken());
		   quantity = Integer.parseInt(tokenizer.nextToken());
		   
		   //Create an object for GroceryItemOrder
		   GroceryItemOrder itemOrder = new GroceryItemOrder(itemName, quantity, pricePerItem);   
		   
		   //Add the new grocery item into the list
    		   list.add(itemOrder);
			
		   itemsNum++;
		   } //while (!GroceryListReader.endOfFile());
		
		System.out.format("%d grocery list data read %n",itemsNum);
		
		//Close file
		GroceryListReader.close();
		
		//System.out.format("Query 1: %s\n",list.GroceryListQuery("Tuna"));
				
		//Calling getTotalCost of items added to the list
		System.out.printf(list.getTotalCost());
		
		//Print out the grocery list
		System.out.println("Detailed gorcery list: ");
		System.out.println(list.toString());
                
                System.out.println(list.GroceryListQuery("Pastas"));

	}

}
