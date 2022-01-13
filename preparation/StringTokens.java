import java.io.*;
import java.util.*;

public class StringTokens{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine().trim();//удаляет пробелы с начала и конца
        if(str.length()>0){
            String[] s=str.split("[?,._'@!\\s]+");//в массиве из стрингов сохраняет результат-разделят стринг по делиметру(по заданному регексу)
            System.out.println(s.length);
            for(String x:s) System.out.println(x);
        }else System.out.println(0);
        scan.close();
    }
}