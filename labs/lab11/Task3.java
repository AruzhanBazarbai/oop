import java.util.*;

class Task3{
    static <E extends Comparable<E>>  void selectionSort(E[] list){
        for(int i=0;i<list.length;i++){
            int x= i;
            for(int j=i+1;j<list.length;j++){
                if(list[j].compareTo(list[x])<0) x=j;

            }
            if(x!=i){
                E a=list[x];
                list[x]=list[i];
                list[i]=a;
            }
        }
    }
    public static void main(String[] args){
        Integer[] a;
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        a=new Integer[n];
        for(int i=0;i<n;i++){
            int x=input.nextInt();
            a[i]=Integer.valueOf(x);
        }
        selectionSort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}