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
class Node{
    int id;
    Node next;
}
class Stack {
    Node top=null;
    
    void push(int i) {
        Node temp = new Node();
        temp.id=i;
        temp.next=top;
        top=temp;
    }
    void pop() {
        
        if(top==null){
            System.out.println("Stack underflow");
        }
        else{
        top=top.next; 
        }
    }

    int peek() {
        if(top==null){
            System.out.println("Stack underflow");
            return 0;
        }
        return top.id;
    }

    void display() {
        Node top2=top;
        while(top2!=null){
            System.out.println(top2.id);
            top2=top2.next;
        }
    }

}
