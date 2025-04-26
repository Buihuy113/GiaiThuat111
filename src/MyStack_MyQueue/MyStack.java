
package MyStack_MyQueue;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int x ,Node t){
        data=x;
        next=t;
    }
    public String toString(){
        return String.valueOf(data);
    }
}
public class MyStack {
    Node top;
    MyStack(){
        top=null;
    }
    boolean empty(){
        return top==null;
    }
    void Push(int x){
        top=new Node(x,top);
    }
    int Pop(){
        int temp=0;
        if(empty()){
            System.out.println("Ngan xep rong");
            return -1;
        }
        else{
        temp=top.data;
        top=top.next;
        }
        return temp;
    }
    int peek(){
        if(empty()){
            System.out.println("Ngan xep rong");
            return -1;
        }
        return top.data;
    }
    void Nhap(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("------Nhap so luong bien :");
        int n=nhap.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap bien thu  "+(i+1)+":");
            int temp=nhap.nextInt();
            Push(temp);
           
        }
    }
    void Xuat(){
        while(!empty()){
            System.out.print(peek()+"->");
            Pop();
        }
        System.out.println("null");
    }
    void LayPhanTu(int vtri){
        if(vtri<0){
            System.out.println("vi tri khong hop le");
            return;
        }
        MyStack temp=new MyStack();
        int dem=0;
        int luu=-1;
        boolean t=false;
        while(!empty()){
            dem++;
            int a=Pop();
            
            if(dem==vtri){
                luu=a;
                t=true;
                continue;
            }
            temp.Push(a);
        }
        while(!temp.empty()){
            Push(temp.Pop());
        }
        if(!t){
            System.out.println("vi tri vuot qua gioi han");
        }
        else{
            System.out.println("Gia tri o vi tri "+vtri+" la : "+luu);
        }
    }
    public static void main(String[] args){
        MyStack m=new MyStack();
        m.Nhap();
        
        m.LayPhanTu(2);
        m.Xuat();
                  
    }
}
