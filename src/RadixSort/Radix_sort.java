
package RadixSort;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class Radix_sort {
    int []a;
    void Sinh(int n){
        Random r=new Random();
        a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=r.nextInt(1000);
        }
    }
    void in(){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    void Radix_sort(){
        Queue Q=new LinkedList();
        Queue []QQ;
        QQ=new LinkedList[10];
        for(int i=0;i<=9;i++){
            QQ[i]=new LinkedList();           
        }
        int x,vt,d=1,max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];               
            }
            Q.add(a[i]);
        }
        int k=(""+max).length();
        for(int i=1;i<=k;i++){
            while(!Q.isEmpty()){
                x=(int) Q.remove();
                vt=(x / d) % 10;
                QQ[vt].add(x);
            }
            for(int j=0;j<=9;j++){
                while(!QQ[j].isEmpty()){
                    Q.add(QQ[j].remove());
                }
            }
            d=d*10;
        }
        for(int i=0;i<a.length;i++){
            a[i]=(int) Q.remove();
        }
        
    }
    public static void main(String[] args){
        Radix_sort r=new Radix_sort();
        r.Sinh(1000000);
//        r.in();
        r.Radix_sort();
        r.in();
        System.out.println("Xong!!!");
    }
}
