import java.io.*;
import java.util.NoSuchElementException;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
public class LinkedList<AnyType> implements Iterable<AnyType>{
    public Node<AnyType> head; //Head of list
    public Node<AnyType> last = null;
    
    //public LinkedList(){
      //  head = null;
    //}
    
 /*******************************************************
 *
 *  The Node class
 *
 ********************************************************/
    public class Node<AnyType> {
        private AnyType data;
        private Node<AnyType> next;
        
        //Constructor
        // next is initialized as null automatically
        public Node(AnyType d){
            this.data = d;
            next = null;
        }
    }
 
 /*******************************************************
 *
 *  The Iterator class
 *
 ********************************************************/

 public Iterator<AnyType> iterator()
   {
      return new LinkedListIterator();
   }

   private class LinkedListIterator  implements Iterator<AnyType>
   {
      private Node<AnyType> nextNode;

      public LinkedListIterator()
      {
         nextNode = head;
      }

      public boolean hasNext()
      {
         return nextNode != null;
      }

      public AnyType next()
      {
         if (!hasNext()) throw new NoSuchElementException();
         AnyType res = nextNode.data;
         nextNode = nextNode.next;
         return res;
      }

      public void remove() { throw new UnsupportedOperationException(); }
   }

    
    
 /*******************************************************
 *
 *  The Insertion, deletion classes
 *
 ********************************************************/
 
    // Method for insertion  
    // static so that it can be used by main method
    public LinkedList<AnyType> insert(LinkedList<AnyType> list, AnyType data){
        // Create new node with data
        Node new_node = new Node(data);
        new_node.next = null;
        
        
        // If the Linked list is empty then the new node is the head
        if(list.head == null)
            list.head = new_node;
        // else traverse the entire list and add to the end of the list
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            
            //Insert new node at the last node
            last.next = new_node;    
        }
 
        return list;
        
    }    
        
    //Method to print the LinkedList
    public void printList(LinkedList<AnyType> list){
        Node currNode = list.head;
        
        System.out.println("LinkedList: ");
        
        //Traverse through the linkedlist to print the elements
        while(currNode != null){
            // Print the data in the current node
            System.out.println(currNode.data + " ");
            
            // Go to the next node
            currNode = currNode.next;
        }
    }
    
    public AnyType getLast(){
      if(head == null) throw new NoSuchElementException();

      Node<AnyType> tmp = head;
      while(tmp.next != null) tmp = tmp.next;

      return tmp.data;
   }
    
    public AnyType get(int pos)
   {
      if (head == null) throw new IndexOutOfBoundsException();

      Node<AnyType> tmp = head;
      for (int k = 0; k < pos; k++) tmp = tmp.next;

      if( tmp == null) throw new IndexOutOfBoundsException();

      return tmp.data;
   }

    public void clear()
   {
      head = null;
   }
    
   
   public LinkedList<AnyType> remove(LinkedList<AnyType> list, int index) 
    { 
        // Store head node 
        Node currNode = list.head, prev = null; 
  
        // 
        // CASE 1: 
        // If index is 0, then head node itself is to be deleted 
  
        if (index == 0 && currNode != null) { 
            list.head = currNode.next; // Changed head 
  
            // Display the message 
            System.out.println(index + " position element deleted"); 
  
            // Return the updated List 
            return list; 
        } 
  
        // 
        // CASE 2: 
        // If the index is greater than 0 but less than the size of LinkedList 
        // 
        // The counter 
        int counter = 0; 
  
        // Count for the index to be deleted, 
        // keep track of the previous node 
        // as it is needed to change currNode.next 
        while (currNode != null) { 
  
            if (counter == index) { 
                // Since the currNode is the required position 
                // Unlink currNode from linked list 
                prev.next = currNode.next; 
  
                // Display the message 
                System.out.println(index + " position element deleted"); 
                break; 
            } 
            else { 
                // If current position is not the index 
                // continue to next node 
                prev = currNode; 
                currNode = currNode.next; 
                counter++; 
            } 
        } 
  
        // If the position element was found, it should be at currNode 
        // Therefore the currNode shall not be null 
        // 
        // CASE 3: The index is greater than the size of the LinkedList 
        // 
        // In this case, the currNode should be null 
        if (currNode == null) { 
            // Display the message 
            System.out.println(index + " position element not found"); 
        } 
  
        // return the List 
        return list; 
    } 
   
}

  

