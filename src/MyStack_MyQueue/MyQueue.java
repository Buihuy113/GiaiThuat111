/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyStack_MyQueue;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
    public String toString(){
        return String.valueOf(data);
    }
}
public class MyQueue {
    Node dau;
    Node cuoi;
    MyQueue(){
        dau=cuoi=null;
    }
    boolean empty(){
        return dau==null;
    }
    void Add(int x){
        Node newNode= new Node(x);
        if(empty()){
            dau=cuoi=newNode;
        }
        else{
            cuoi.next=newNode;
            dau=dau.next;
        }
    }
  
}
