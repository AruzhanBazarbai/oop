import java.util.Scanner;

public class task_4{
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int a,b,c,d;
        a=num.nextInt();
        b=num.nextInt();
        c=num.nextInt();
        d=num.nextInt();
        int res=min(a,b,c,d);
        System.out.println(res);
    }
    static int min(int a,int b,int c,int d){
        return Math.min(Math.min(a,b),Math.min(c,d));


    }
}