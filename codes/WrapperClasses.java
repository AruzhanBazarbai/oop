import java.util.*;
class WrapperClasses{
    public static void main(String[] args){
        //initialize
        int a=5;
        Integer int1=Integer.valueOf("25"); //String->Integer
        Integer int2=a;//int->Integer(1)
        Integer int3=Integer.valueOf(a); //int->Integer(2)
        int b=int1;//Integer->int (1)
        int c=int1.intValue();//Integer->int (2)
        long l=int1.longValue(); //Integer->long
        String s=int1.toString(); //Integer->String
        int p=Integer.parseInt("3"); //String->int
        System.out.println(int1+" "+int2+" "+b+" "+c+" "+l+" "+s+" "+int3+" "+p);
        Integer[] arr=new Integer[5];
        for(int i=0;i<5;i++){
            arr[i]=i+1;//int->Integer
            System.out.print(arr[i]+" ");
        }
    }
}