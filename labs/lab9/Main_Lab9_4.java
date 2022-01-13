public class Main_Lab9_4{
    public static void main(String[] args){
        ReadProcessor r=new ReadProcessor();
        r.execute();
        WriteProcessor w=new WriteProcessor();
        try{
            w.execute();
        }catch(Exception ex){
            System.out.println("something get wrong");
        }
    }
}