import java.util.*;
import java.io.*;
import java.lang.*;
class Bonus1{
    public static void main(String[] args){
        try{
            HashMap<String,Integer> h=new HashMap<>();

            File file=new File("input.txt");
            Scanner input=new Scanner(file);

            while(input.hasNext()){
                String line=input.nextLine();
                String[] arr=line.split(" ");
                for(String x: arr){
                    if(h.containsKey(x)){
                        Integer i=h.get(x);
                        h.put(x,i+1);
                    }else{
                        h.put(x,1);
                    }   
                }
            }
            File file2=new File("output.txt");
            PrintWriter output=new PrintWriter(file2);
            ArrayList<Integer> values = new ArrayList<>(h.values());
            Set<String> keys = h.keySet();
            ArrayList<String> k=new ArrayList<>();
            for(String s: keys){
                k.add(s);
            }
            for(int i=0;i<values.size();i++){
                output.println(k.get(i)+"="+values.get(i));
            }
            output.close();

        }catch(FileNotFoundException e){
            System.out.println("please, give the existing file");
        }
    }
}