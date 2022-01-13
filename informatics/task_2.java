import java.util.Scanner;
//done
public class task_2{
    public static void main(String[] args){
        int s,h,m;
        Scanner num=new Scanner(System.in);
        s=num.nextInt();
        if(s<86400){
            h=s/3600;
            s%=3600;
            m=s/60;
            s%=60;
            if(m<10 && s<10){
                System.out.println(h + ":0" + m + ":0" + s);
            }else if(m<10 && s>=10){
                System.out.println(h + ":0" + m + ":" + s);
            }else if(m>=10 && s<10){
                System.out.println(h + ":" + m + ":0" + s);
            }else{
                System.out.println(h + ":" + m + ":" + s);
                
            }
        }
        else{
            s=s%86400;
            h=s/3600;
            s%=3600;
            m=s/60;
            s%=60;
            if(m<10 && s<10){
                System.out.println(h + ":0" + m + ":0" + s);
            }else if(m<10 && s>=10){
                System.out.println(h + ":0" + m + ":" + s);
            }else if(m>=10 && s<10){
                System.out.println(h + ":" + m + ":0" + s);
            }else{ 
                System.out.println(h + ":" + m + ":" + s);
            }
        }
        
    }
}