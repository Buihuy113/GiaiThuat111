/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/**
 *
 * @author duchuy
 */
class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
        left=right=null;        
    }
    Node(int x,Node ll,Node rr){
        data=x;
        left=ll;
        right=rr;
    }
    
}
public class MyTree{
    Node root;
    void TaoTree(){
        Node n30=new Node(30);
        Node n200=new Node(200);
        Node n28=new Node(28);
        Node n29=new Node(29);
        Node n23=new Node(23);
        Node n18=new Node(18,n200,null);
        Node n27=new Node(27);
        Node n100=new Node(100);
        Node n16=new Node(16);
        Node n19=new Node(19);
        Node n24=new Node(24);
        Node n20=new Node(20);
        Node n21=new Node(21);
        Node n17=new Node(17,n18,null);
        Node n22=new Node(22,null,n23);
        Node n25=new Node(25,n30,null);
        Node n26=new Node(26,n28,n29);
        Node n8=new Node(8,n100,null);
        Node n9=new Node(9,n16,n17);
        Node n10=new Node(10,n19,null);
        Node n11=new Node(11,null,n20);
        Node n12=new Node(12,n21,n22);
        Node n13=new Node(13,null,n24);
        Node n14=new Node(14,n25,n26);
        Node n15=new Node(15,null,n27);
        Node n4=new Node(4,n8,n9);
        Node n5=new Node(5,n10,n11);
        Node n6=new Node(6,n12,n13);
        Node n7=new Node(7,n14,n15);
        Node n2=new Node(2,n4,n5);
        Node n3=new Node(3,n6,n7);
        
        
        root=new Node(1,n2,n3);              
    }
    void duyet1(Node T){
        if(T!=null){
            System.out.print(T.data+" ");
            duyet1(T.left);
            duyet1(T.right);
        }        
    }
    void DuyetTienTu(){
        duyet1(root);
    }
    int TongNot(Node T){
        if(T==null)return 0;
        return 1+TongNot(T.left)+TongNot(T.right);
    }
    int TongNotLa(Node T){
        if(T==null)return 0;
        if(T.left==null&&T.right==null)return 1+TongNotLa(T.left)+TongNotLa(T.right);
        else return TongNotLa(T.left)+TongNotLa(T.right);
    }
    int TongNot1Con(Node T){
        if(T==null)return 0;
        if((T.left==null&&T.right!=null)||(T.left!=null&&T.right==null)){
            return 1+TongNot1Con(T.left)+TongNot1Con(T.right);
        }
        else return TongNot1Con(T.left)+TongNot1Con(T.right);
    }
    int TongNot2Con(Node T){
        return TongNot(T)-(TongNot1Con(T)+TongNotLa(T));
    }
    int chieuCao(Node T){
        if(T==null)return 0;
        else return 1+Math.max(chieuCao(T.left),chieuCao(T.right));
    }
    int NodeMax(Node T){
        if(T==null)return 0;
        return Math.max(Math.max(NodeMax(T.left),NodeMax(T.right)),T.data);
    }
    int NodeMin(Node T){
        if(T==null)return 0;
        return Math.min(Math.min(NodeMax(T.left),NodeMax(T.right)),T.data);
    }
    boolean TimX(Node T,int x){
        if(T==null)return false;
        if(T.data==x)return true;
        else return TimX(T.left,x)||TimX(T.right,x);
    }
    void lietKeMucK(Node T,int k){
        if(T==null)return ;
        if(k==0){
            System.out.print(T.data+" ");
        }
        else {
            lietKeMucK(T.left,k-1);
            lietKeMucK(T.right,k-1);
        }
    }
    int TongNotK(Node T,int k){
        if(T==null)return 0;
        if(k==0)return T.data;
        else return TongNotK(T.left,k-1)+TongNotK(T.right,k-1);      
    }
    boolean kiemtra(Node T){
        if(T==null)return true;
        if((T.left==null&&T.right==null)||(T.left!=null&&T.right!=null))return kiemtra(T.left)&&kiemtra(T.right);
        else return false;
    }
    
    public static void main(String[] args){
        MyTree tree=new MyTree();
        tree.TaoTree();
        
        System.out.println(tree.NodeMin(tree.root));
        tree.lietKeMucK(tree.root, 2);
    }
}