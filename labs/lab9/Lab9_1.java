import java.util.Scanner;
import java.io.*;

public class Lab9_1{
    public static void main(String[] args){    
        try{
            File file=new File("input.txt");
            checkFile(file);
            Scanner input=new Scanner(file);
            // checking file empty or not
            try{
                if(file.length()==0){
                    throw new MyIllegalStateException();
                }
                
            }catch(MyIllegalStateException e){
                System.out.println("File must contain data!!!");
            }
            // if file not empty, printing his data
            while(input.hasNext()){
                String line=input.nextLine();
                System.out.println(line);
            }
            input.close();
        }catch(FileNotFoundException e){
            System.out.println("please,try to give the existing file");
        }
        
    }
    private static void checkFile(File file) throws FileNotFoundException{
        if(!file.exists()){
            throw new FileNotFoundException("this file doesn't exist");
        }

    }
    
}