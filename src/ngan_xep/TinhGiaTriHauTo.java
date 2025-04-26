/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngan_xep;

import java.util.Scanner;
import java.util.Stack;


public class TinhGiaTriHauTo {
    static boolean kiemtraSo(char a){
        if(Character.isDigit(a))return true;
        else return false;
    }
    static boolean KiemtraChu(char a){
        return Character.isLetter(a);
    }
    static int chuyen(char a){
        return Character.getNumericValue(a);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        System.out.println("nhap bieu thuc hau to : ");
        Scanner nhap=new Scanner(System.in);
        String bt=nhap.nextLine();
        String[] token=bt.split(" ");
        for(int i=0;i<token.length;i++){
            char c=bt.charAt(i);
            if(kiemtraSo(c)){
                s.push(chuyen(c));
            }
            else if (c=='+'){
                
                int a1=Character.getNumericValue(s.pop());
                int a2=Character.getNumericValue(s.pop());
                int ss=a1+a2;
                s.push(ss);
            }
            else if (c=='-'){
                
                int a1=Character.getNumericValue(s.pop());
                int a2=Character.getNumericValue(s.pop());
                int ss=a1-a2;
                s.push(ss);
            }
            else if (c=='*'){ 
                
                int a1=Character.getNumericValue(s.pop());
                int a2=Character.getNumericValue(s.pop());
                int ss=a1*a2;
                s.push(ss);
            }
            else if (c=='/'){ 
                
                int a1=Character.getNumericValue(s.pop());
                int a2=Character.getNumericValue(s.pop());
                int ss=a1/a2;
                s.push(ss);
            }
            if (s.size() != 1) {
            System.out.println("Lỗi: Biểu thức sai.");
        } else {
            System.out.println("Kết quả của biểu thức hậu tố là: " + s.pop());
        }
        }
        
    }
}
