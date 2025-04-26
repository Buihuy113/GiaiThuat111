
package RadixSort;

import java.util.Stack;


public class bt_hau_to {
   
//    public static int doUuTien(char o){
//        if(o=='+'||o=='-')return 1;
//        if(o=='*'||o=='/') return 2;
//        if(o=='*')return 3;
//        return 0;
//    } 
//    public static boolean laToanHang(char a){
//        return Character.isLetterOrDigit(a);
//    }
//    public static String chuyenTTsangHauto(String hauTo){
//        Stack<Character> st=new Stack<>();
//        StringBuilder kq=new StringBuilder();
//        for(int i=0;i<hauTo.length();i++){
//            char c=hauTo.charAt(i);
//            if(c==' ')continue;
//            if(laToanHang(c)) kq.append(c);
//            else if(c=='(')st.push(c);
//            else if(c==')'){
//                while(!st.empty()&&st.peek()!='('){
//                    kq.append(' ').append(st.pop());
//                }
//                if(!st.empty())st.pop();
//            }
//            else{
//                kq.append(' ');
//                while(!st.empty()&&doUuTien(st.peek())>=doUuTien(c)){
//                    kq.append(st.pop()).append(' ');
//                }
//                st.push(c);
//            }
//        }
//        while(!st.empty()){
//            kq.append(st.pop()).append(' ');
//        }
//        return kq.toString();
//    }
    
    public static int DoUuTien(char c){
        if(c=='+'||c=='-')return 1;
        if(c=='*'||c=='/')return 2;
        if(c=='^')return 3;
        return 0;
    }
    public static boolean kiemTra(char c){
        return Character.isLetterOrDigit(c);
    }
    public static String chuyenTTsangHauto(String a){
        Stack<Character> st=new Stack<>();
        StringBuilder kq=new StringBuilder();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c==' ')continue;
            if(kiemTra(c))kq.append(c);
            else if(c=='(')st.push(c);
            else if(c==')'){
                while(!st.empty()&&st.peek()!='('){
                    kq.append(' ').append(st.pop());
                }
                if(!st.empty())st.pop();
            }
            else{
                kq.append(' ');
                while(!st.empty()&&DoUuTien(st.peek())>=DoUuTien(c)){
                    kq.append(st.pop()).append(' ');
                }
                st.push(c);
            }
        }
        while(!st.empty()){
            kq.append(st.pop()).append(' ');
        }
        return kq.toString();
    }
    public static void main(String[] args) {
        String infix = "5 + 6 * ( 2 - 3 )";
        System.out.println("Bieu thuc hau to: " + chuyenTTsangHauto(infix));
    }
}
