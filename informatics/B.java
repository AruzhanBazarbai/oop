import java.util.Scanner;

public class B{
    public static void main(String[] args){
        int[] a;
        int n,x,res=1;
        Scanner num=new Scanner(System.in);
        n=num.nextInt();
        a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=num.nextInt();
        }
        x=a[0];
        for(int i=1;i<n;i++){
            if(x<a[i]) res++;
            x=a[i];
        }
        System.out.println(res);
    }
}