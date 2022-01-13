import java.util.ArrayList;
import java.util.Scanner;
class ApplicationCapitalCities{
    static ArrayList<CapitalCities> a=new ArrayList<>();
    public static void main(String[] args){
        CapitalCities c1=new CapitalCities("Kazakhstan","Nur-Sultan");
        CapitalCities c2=new CapitalCities("Russian","Moskva");
        CapitalCities c3=new CapitalCities("Britain","London");
        a.add(c1);
        a.add(c2);
        a.add(c3);
        Scanner input=new Scanner(System.in);
        String c=input.next();
        for (int i = 0; i < a.size(); i++){
            if(a.get(i).country.compareTo(c)==0){
                System.out.println(a.get(i).getCapital());
            }
        }
    }
}