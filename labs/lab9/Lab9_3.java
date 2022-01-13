import java.util.Scanner;
import java.io.*;

public class Lab9_3{
    public static void main(String[] args){
        int lines=0,words=0;
        try{
            // reading from input.txt
            File file=new File("input.txt");
            checkFile(file);
            Scanner input=new Scanner(file);
            try{
                if(file.length()==0){
                    throw new MyIllegalStateException();
                }
                
            }catch(MyIllegalStateException e){
                System.out.println("File must contain data!!!");
            }
            while(input.hasNext()){
                String line=input.nextLine();
                lines++;
                String arr[]=line.split(" ");
                for(String x:arr){
                    if(x!="") words++;
                }
            }
            input.close();

            // writing to output.txt
            
            File file2=new File("output.txt");
            PrintWriter output=new PrintWriter(file2);
            output.println("Lines "+lines);
            output.println("Words "+words);
            output.close();
        }catch(FileNotFoundException ex){
            System.out.println("File doesn't exist,please try again");
        }
    }

    private static void checkFile(File file) throws FileNotFoundException{
        if(!file.exists()){
            throw new FileNotFoundException("this file doesn't exist");
        }

    }
    
}