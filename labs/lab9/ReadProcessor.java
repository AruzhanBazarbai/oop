import java.io.*;
import java.util.Scanner;
public class ReadProcessor extends MyFileProcessor{
    public ReadProcessor(){

    }
    @Override
    public void execute(){
        try{
            File file=new File("input.txt");
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            Scanner input=new Scanner(file);
            String temp="";
            while(input.hasNext()){
                temp+=input.next()+" ";
            }
            if(temp!="") super.text=temp;
        }catch(FileNotFoundException ex){
            System.out.println("\"input.txt\" doesn't exist,please try again");
        }
    }
}