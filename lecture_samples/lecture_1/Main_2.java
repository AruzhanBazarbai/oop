import java.util.Scanner;

public class Main_2{
    public static void main(String[] args){
        // Scanner str=new Scanner(System.in);
        // System.out.println(str.nextLine());
        Scanner num=new Scanner(System.in);
        int first,second,result;
        System.out.print("Enter first number: ");
        first=num.nextInt();
        System.out.print("Enter second number: ");
        second=num.nextInt();
        result=first+second;
        System.out.println("Sum is: "+ result);
    }
}