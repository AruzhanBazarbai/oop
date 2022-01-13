import java.util.Scanner;

public class Main_3{
    public static void main(String[] args){
        int[] a;
        int n;
        Scanner num=new Scanner(System.in);
        System.out.print("Enter a number of array: ");
        n=num.nextInt();
        a=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter a["+i+"]= ");
            a[i]=num.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}