/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
public class Node {
        int data;
        Node next;
        
        //Constructor
        // next is initialized as null automatically
        Node(int d){
            this.data = d;
            next = null;
        }
}
