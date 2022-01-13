import java.util.*;
class BonusTask{
    static <E extends Comparable<E>> int binarySearch(E[] list,E key){
        int l=0,r=list.length-1,index=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(list[mid].compareTo(key)<0) l=mid+1;
            else if(list[mid].compareTo(key)>0) r=mid-1;
            else if(list[mid].compareTo(key)==0){
                index=mid;
                break;
            }
        }
        return index;

    }
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
        int key=input.nextInt(); 
        selectionSort(a); //чтобы сортировать если массив дан в неотсортированном порядке
        int ind=binarySearch(a,Integer.valueOf(key));
        if(ind==-1) System.out.println("Not Found!");
        else System.out.println("Found at index: "+ind);
    }
}