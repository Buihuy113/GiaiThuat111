/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RadixSort;

import java.util.Random;
import java.util.Stack;

/**
 *
 * @author duchuy
 */
public class Stock_Span_Stack {
    int []price;
    int []S;
    int n=1000000;
    void Sinh(int n){
        Random r=new Random();
        price=new int [n];
        for(int i=0;i<n;i++) price[i]=r.nextInt(100);S = new int[n];
    }
    void in(){
        System.out.println("bang gia : ");
//        for(int i=0;i<price.length;i++){
//            System.out.println(price[i]+" ");
//        }
        System.out.println();
        System.out.println("bang ngay :");
        for(int i=0;i<S.length;i++){
            System.out.println(S[i]+" ");
        }
    }
    void calculateSpan1(){
        S[0]=1;
        for(int i=1;i<n;i++){
            S[i]=1;
            for(int j=i-1;(j>=0)&&(price[i]>=price[j]);j--){
                S[i]++;
            }
        }
    }
    void calculateSpan2(){
        Stack<Integer> st=new Stack<>();
        st.push(0);
        S[0]=1;
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&price[st.peek()]<=price[i]) st.pop();
            S[i]=(st.isEmpty())?(i+1):(i-st.peek());
            st.push(i);
        }
        
    }
    public static void main(String[] args){
        Stock_Span_Stack s=new Stock_Span_Stack();
//        s.Sinh(s.n);
//        s.calculateSpan1();
//        s.in();
        s.calculateSpan2();
        s.in();
//        for(int i=0;i<10000000;i++){
//            System.out.println(i);
//        }
    }
}
