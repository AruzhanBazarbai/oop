import java.util.*;
import java.lang.*;
class Person{
    private int ID;
    public String name,surname;
    public int workhour;
    
    public int getID(){
        return this.ID;
    }
    public String sleep(){
        return "yes";
    }
    public String work(int wh){
        return "yes";
    }
}
class Footballer extends Person{
    private int Salary;
    
    public String earnPerHour(int s,int h){
        return "Footballer earns "+(double)s/30/h+" tenges per hour.";
    }
    public int getSalary(){
        return this.Salary;
    }
    public void setSalary(int s){
        this.Salary=s;
    } 
    @Override
    public String work(int n){
        return super.name+" "+super.surname+" plays football "+n+" hours per day.";
    }

}
class MainFootballer{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            Footballer f=new Footballer();
            String name=input.next();
            String surname=input.next();
            int h=input.nextInt();
            int s=input.nextInt();
            f.name=name;
            f.surname=surname;
            System.out.println(f.earnPerHour(s,h));
            System.out.println(f.work(h));
        }
    }
}