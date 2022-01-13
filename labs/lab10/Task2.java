abstract class Operator{
    public int initialValue=0; 
    
    public Operator(){
    }
    public abstract void execute(int anotherValue);

}

class Add extends Operator{
    @Override
    public void execute(int anotherValue){
        initialValue+=anotherValue;
    }
}
class Substract extends Operator{
    @Override
    public void execute(int anotherValue){
        initialValue-=anotherValue;
    }
}
class Multiply extends Operator{
    @Override
    public void execute(int anotherValue){
        initialValue*=anotherValue;
    }
}
class Divide extends Operator{
    @Override
    public void execute(int anotherValue){
        initialValue/=anotherValue;
    }
}
class Clear extends Operator{
    @Override
    public void execute(int anotherValue){
        initialValue=0;
    }
}

class Task2{
    public static void main(String[] args){
        Add a=new Add();
        a.execute(4);
        System.out.println(a.initialValue); //4
        Substract s=new Substract();
        s.execute(2);
        System.out.println(s.initialValue); //-2
        Clear c=new Clear();
        c.execute(0);
        System.out.println(c.initialValue); //0
    }
}