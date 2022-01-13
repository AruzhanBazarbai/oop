import java.util.Scanner;
class Task2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        char map[][]=new char[x][x];
        // try{
        //     for(int i=0;i<x;i++){
        //         int ind=0;
        //         String s=input.nextLine();
        //         for(int j=0;j<x;j++){
        //             map[i][j]=s.charAt(ind);
        //             ind+=2;
        //         }
        //     }
        // }catch(Exception e){
        //     System.out.println("Not enough map elements");
        // }
        for(int i=0;i<x;i++){
            int ind=0;
            // char arr[]=s.toCharArray();
            // System.out.println(s);
            for(int j=0;j<x;j++){
                // map[i][j]=s.charAt(ind);
                // ind+=2;
                String s=input.next();
                char val=s.charAt(0);
                if(val=='R' || val=='L' || val=='D' || val=='U'){
                    System.out.println("Not enough map elements");
                }
                map[i][j]=val;
            }
        }
        char[][] m=map;
        System.out.println(m.length);
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    } 
}