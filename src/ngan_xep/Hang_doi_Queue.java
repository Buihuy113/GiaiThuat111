/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngan_xep;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class Hang_doi_Queue {
    Node dau;
    Node cuoi;

    public Hang_doi_Queue() {
        dau=cuoi=null;
    }
    boolean isEmpty(){
        return dau==null;
    }
    void AddEndQueue(int x){
        Node newNode=new Node(x);
        if(isEmpty()){
            dau=cuoi=newNode;
        }
        else{
            cuoi.next=newNode;
            cuoi=newNode;
        }
    }
    int deQueue(){
        if(isEmpty()){
            System.out.println("hang doi rong");
            return -1;
        }
        int temp=dau.data;
        dau=dau.next;
        if(dau==null)cuoi=null;
        return temp;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("hang doi rong");   
            return -1;
        }
        return dau.data;
        
    }
    void printQueue(){
        
        Node temp=dau;
        System.out.print("Queue: ");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Hang_doi_Queue q=new Hang_doi_Queue();
        
}
}
