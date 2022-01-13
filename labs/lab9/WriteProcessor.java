import java.io.*;
import java.util.Scanner;
public class WriteProcessor extends MyFileProcessor{
    public WriteProcessor(){

    }
    @Override
    public void execute() throws Exception{
        try{
            if(super.text==null) super.execute();
            File file=new File("output.txt");
            PrintWriter output=new PrintWriter(file);
            output.println(super.text);
            output.close();

        }catch(MyIllegalStateException ex){
            System.out.println("\"input.txt\" is empty!!!");
        }
    }
}