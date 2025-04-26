/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngan_xep;

import java.util.Stack;

/**
 *
 * @author duchuy
 */
public class chuyenSangHauTo {
    
    static int DoUuTien(char a){
        if(a=='-'||a=='+')return 1;
        if(a=='*'||a=='/')return 2;
        else return 3;       
    }
    static boolean kiemtra(char a){
        if(Character.isDigit(a)||Character.isLetter(a))return true;
        else return false;
    }
    public static void main(String[] args){
        String bt="5*(7-4)+4*(5-3)";
        Stack<Character> s=new Stack<>();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<bt.length();i++){
            char c=bt.charAt(i);
            if(kiemtra(c)){
                b.append(c+" ");
            }
            else if(c=='('){
                s.push(c);
            }
            else if(c==')'){
                while(!s.isEmpty()&&s.peek()!='('){
                    b.append(s.pop());
                }
                if(s.peek()=='(')s.pop();
            }
            else if(c=='*'||c=='/'||c=='+'||c=='-'||c=='^'){
                while(!s.isEmpty()&&s.peek()!='('&&DoUuTien(s.peek())>=DoUuTien(c)){
                    b.append(s.pop()+" ");
                }
                s.push(c);
            }           
        }
        while(!s.empty()){
            b.append(s.pop());
        }
        System.out.println("Bieu thuc hau to la "+b.toString());
        
}
}
