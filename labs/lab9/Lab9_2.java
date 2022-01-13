import java.util.Scanner;
import java.io.*;

public class Lab9_2{
    public static void main(String[] args){
        boolean ok1=false,ok2=false;    
        try{
            File file1=new File("input1.txt");
            checkFile(file1);
            Scanner input=new Scanner(file1);
            ok1=true;
            while(input.hasNext()){
                String line=input.nextLine();
                System.out.println(line);
            }
            input.close();
        }catch(FileNotFoundException ex1){
            System.out.println("File with name:\"input1.txt\" doesn't exist, trying to open the file with name:\"input2.txt\"...");
            try{
                File file2=new File("input2.txt");
                checkFile(file2);
                Scanner input=new Scanner(file2);
                ok2=true;
                while(input.hasNext()){
                    String line=input.nextLine();
                    System.out.println(line);
                }
                input.close();
            }catch(FileNotFoundException ex2){
                System.out.println("Cannot find the file...please try again");
            }
        }finally{
            if(ok1) 
                System.out.println("File with name \"input1.txt\" successfully processed!!!");
            if(ok2) 
                System.out.println("File with name \"input2.txt\" successfully processed!!!");
        }
        
    }
    private static void checkFile(File file) throws FileNotFoundException{
        if(!file.exists()){
            throw new FileNotFoundException("this file doesn't exist");
        }

    }
    
}