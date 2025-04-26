
package ngan_xep;

import java.util.Scanner;

/**
 *
 * @author duchuy
 */

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;next=null;
    }
    Node(int x,Node t){
        data=x;next=t;
    }    
    public String toString(){
        return String.valueOf(data);
    }
}
public class Ngan_xep_stack {

    Node top;
    Ngan_xep_stack(){
        top=null;
    }
    boolean empty(){
        return top==null;
    }
    void push(int x){
        top=new Node(x,top);
    }
    int Pop(){
        int x=0;
        if(top==null){
            System.out.println("ngan xep rong ");
            return -1;
        }
        else{
            x=top.data;top=top.next;
        }
        return x;
    }
    int peek(){
        if(empty()){
            System.out.println("ngan xep rong");   
            return -1;
        }
        return top.data;
    }
    public static void main(String[] args) {
        // Bài 1 : Đổi hệ thập phân sang hệ nhị 
        Ngan_xep_stack n=new Ngan_xep_stack();
        int a;
        Scanner nhap=new Scanner(System.in);
        a=nhap.nextInt();
        while(a!=0){
            n.push(a%2);
            a=a/2;
        }
        while(!n.empty()){
            System.out.print(n.peek());
            n.Pop();
        }
        
}
}