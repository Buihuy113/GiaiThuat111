/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lam_lai;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;


public class hang_doi {
    static void chuyenPhanNguyen(int a){
        Stack<String> chuoi=new Stack();
        if(a>0){
            while(a>0){
            chuoi.push((a%2)+"");
            a=a/2;
           }
            while(!chuoi.empty()){
                System.out.print(chuoi.pop());
            }
        }
        else if(a==0){
            System.out.println(0);
        }
        else{
            a=-a;
            while(a>0){
            chuoi.push((a%2)+"");
            a=a/2;
           }
            System.out.print("-");
            while(!chuoi.empty()){
                System.out.print(chuoi.pop());
            }
        }
        
       
}
    static void chuyenPhanThapPhan(double b){
        if(b < 0){
            System.out.print("-");
            b = -b;
        }
        int phanNguyen=(int)b;
        double phanThapPhan= b-phanNguyen;
        chuyenPhanNguyen(phanNguyen);
        System.out.print(".");
        int chuSo=6;
        for(int i=0;i<chuSo;i++){
            phanThapPhan*=2;
            int temp=(int) phanThapPhan;
            phanThapPhan-=temp;
            System.out.print(temp);
            if(phanThapPhan==0)break;
        }
    }
    public static void main(String[] args){
        Scanner nhap =new Scanner(System.in);
        chuyenPhanThapPhan(25.05);
        
    }
}
