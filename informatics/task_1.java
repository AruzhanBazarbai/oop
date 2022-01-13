import java.util.Scanner;

public class task_1{
    public static void main(String[] args){
        int a,b;
        Scanner num=new Scanner(System.in);
        a=num.nextInt();
        b=num.nextInt();
        System.out.println(Math.sqrt(a*a+b*b));
    }
}