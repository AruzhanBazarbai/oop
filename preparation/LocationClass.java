import java.util.Scanner;

class Location{
    public String locateLargest(double[][] a,int row,int col){
        double MaxValue=Double.MAX_VALUE;
        int x=0,y=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(a[i][j]>MaxValue){
                    MaxValue=a[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        String res="("+x+", "+y+")";
        return res;
    }
}

public class LocationClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        double[][] a=new double[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextDouble();
            }
        }
        Location l=new Location();
        String res=l.locateLargest(a,row,col);
        System.out.println(res);
        
    }
}