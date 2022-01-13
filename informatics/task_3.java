import java.util.Scanner;

public class task_3{
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int n,b,c;
        // int min=100000,num_2=1;
        int[][] a;
        n=num.nextInt();
        a=new int[n][n];
        // b=num.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1) a[i][j]=1;
                else if(i+j<n-1) a[i][j]=0;
                else a[i][j]=2;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}