/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackusinglinkedlist;

/**
 *
 * @author AMIT
 */
public class StackUsingLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack stack = new Stack();
        stack.pop();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.pop();
        int peek = stack.peek();
        System.out.println("peek = "+peek);
        stack.display();
    }
    
}
