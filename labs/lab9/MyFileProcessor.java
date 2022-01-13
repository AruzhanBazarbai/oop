public class MyFileProcessor{
    static String text;
    public MyFileProcessor(){

    }
    public void execute()throws Exception{
        throw new MyIllegalStateException();
    }
}