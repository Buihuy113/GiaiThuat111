/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarySeachTree;

import java.util.Scanner;

class TNode{
    int data;
    TNode left,right;
    TNode(int x){
        data=x;
        left=right=null;       
    }
    TNode(int x,TNode l,TNode r){
        data=x;
        left=l;
        right=r;       
    }
    
}
public class MySeachTree {
   TNode root;
    void inSert(int x){
       TNode newNode=new TNode(x);
       if(root==null){
           root=newNode;
           return;
       }
       TNode temp=root;
       while(true){
           if(x<temp.data){
               if(temp.left==null){
                   temp.left=newNode;
                   break;
               }
               temp=temp.left;
           }
           else if(x>temp.data){
               if(temp.right==null){
                   temp.right=newNode;
                   break;
               }
               temp=temp.right;
           }
           else {
               break;
           }
       }
   }
   public void duyetTienTu(TNode T){
       if(T!=null){
           System.out.print(T.data+" ");
           duyetTienTu(T.left);
           duyetTienTu(T.right);
       }
   }
   void taoTree(){
       Scanner nhap=new Scanner(System.in);
       System.out.print("Nhap gia tri not :");
       int n;
       while(true){
           n=nhap.nextInt();
           if(n==0){
               break;
           }
           inSert(n);
       }
       System.out.println("Duyet tien tu :");
       duyetTienTu(root);
   }
   boolean TimX(TNode T,int x){
       if(T==null)return false;
       if(T.data==x)return true;
       else if(T.data>x)return TimX(T.left,x);
       else return TimX(T.right,x);
   }
   int TimMin(TNode T){
       if(T==null)return 0;
       else{
           if(T.left==null)return T.data;
           else{
               return TimMin(T.left);
           }
       }
       
   }
   int TimMax(TNode T){
       if(T==null)return 0;
       else {
           if(T.right==null)return T.data;
           else {
               return TimMax(T.right);
           }
       }
   }
   TNode xoaNot(TNode T,int x){
       if(T==null)return null;
       if(x<T.data){
           xoaNot(T.left,x);
       }
       else if(x>T.data){
           xoaNot(T.right,x);
       }
       else{
           if(T.left==null&&T.right==null)return null;
           if(T.left==null)return T.right;
           if(T.right==null)return T.left;
           int min=TimMin(T.right);          
           T.data=min;
           T.right=xoaNot(T.right,min);
       }
       return T;
   }
   int dem(TNode T){
       if(T==null)return 0;
       return 1+dem(T.left)+dem(T.right);
   }
   int chieuCao(TNode T){
       if(T==null)return 0;
       return 1+Math.max(chieuCao(T.left),chieuCao(T.right));
   }
   boolean isBST(TNode T,int min,int max){
       if(T==null)return true;
       if(T.data<=min||T.data>=max)return false;
       return isBST(T.left,min,T.data)&&isBST(T.right,T.data,max);
   }
   public static void main(String[] args){
       MySeachTree tree=new MySeachTree();
       tree.taoTree();
       if(tree.TimX(tree.root,10)){
           System.out.println("co ton tai gia tri ");
       }
       else {
           System.out.println("ko ton tai gia tri ");
       }
       System.out.println("gia tri nho nhat trong cay la : "+tree.TimMin(tree.root));
       System.out.println("gia tri lon nhat trong cay la : "+tree.TimMax(tree.root));
       tree.xoaNot(tree.root, 5);
       tree.duyetTienTu(tree.root);
       
       
   }
}
