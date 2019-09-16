/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author Sameer Naumani
 */
//This class represents a bank account object such that each
// bank account maintains an account number, the owner's name
// and its current balance.       
public class BankAccount {
          // These are the instance variables
          private int     accountNumber;
          private String  ownerName;
          private float   balance;

            // This is the default constructor.  It initializes the bank account
            // to have a default number, name and balance.
            public BankAccount() {
                accountNumber = 999999;
                ownerName = "";
                balance = 0.0f;
            } 


            // This is another constructor.  It initializes the bank account
            // to have the number and name as specified by the given parameters.
            // Note that we did not pass in the balance upon initialization.
            // We can assume that all new accounts have zero balance.
            public BankAccount(int num, String name) {
                accountNumber = num;
                ownerName = name;
                balance = 0.0f;
            }

	// These are the get (accessing) methods.  They allow other
	// classes and methods to access the internal components of
	// the bank account.
	public int getAccountNumber(){ 
            return(accountNumber); }
	public String getOwnerName(){ 
            return(ownerName); }
	public float getBalance(){ 
            return(balance); }

	// These are the set (modifying) methods.  They allow other
	// classes and methods to alter the internal components of
	// the bank account.
	public void setAccountNumber(int aNumber){ 
            accountNumber = aNumber; }
	public void setOwnerName(String aName){ 
            ownerName = aName; }
	public void setBalance(float aNumber){ 
            balance = aNumber; } 
     
	// Generate a string representing the BankAccount's information.
      	// Note that only the account number and balance is shown.
      	public String toString() {
          return("Account #" + accountNumber + " with balance $" + balance);
      	}

                  // Deposit some money into the account and return the new balance
            public float deposit(float anAmount) {
                balance += anAmount ;
                return(balance);
            }
            
            public float addInterest(float rate)
            {
               balance = balance + balance*(rate/100);
               return balance;
            }
            // Withdraw some money from the account and return the amount withdrawn
            public float withdraw(float anAmount) {
                balance -= anAmount;
                return(anAmount);
            }
            

               //Testing


            public static void main(String args[]) {
                BankAccount marksAccount;

                marksAccount = new BankAccount(432883,"Mark Smith");
                System.out.println(marksAccount);
                //test 1
                marksAccount.deposit(1100f);
                  marksAccount.addInterest(10f);
                System.out.println(marksAccount);
  
                //test 2
                marksAccount.addInterest(5f);
                System.out.println(marksAccount);
               
                //test 3
                marksAccount.addInterest(20f);
                System.out.println(marksAccount);
               
                //test 4
               marksAccount.addInterest(30f);
                System.out.println(marksAccount);
               
                //test 5
                marksAccount.addInterest(15f);
                System.out.println(marksAccount);
               
                //test 6
                marksAccount.addInterest(2f);
                System.out.println(marksAccount);
               
                
            }
}