import java.util.*;

 class Task {
     static class FavoriteClasses<E> {
        private E favorite1,favorite2,favorite3;
        FavoriteClasses(E fav1, E fav2, E fav3){
            this.favorite1=fav1;
            this.favorite2=fav2;
            this.favorite3=fav3;
        }

        public E getFav1(){
            return(this.favorite1);
        }

        public E getFav2(){
            return(this.favorite2);
        }

        public E getFav3(){
            return(this.favorite3);
        }
    }

    public static void main(String[] args){
        ArrayList <Double> r=new ArrayList<>();
        r.add(6.3);
        r.add(5.9);
        FavoriteClasses a=new FavoriteClasses("Hello",67,r.get(0));
        System.out.println("My favorites are " + a.getFav1() + ", "+ a.getFav2() + ", and " + a.getFav3() + ".");
    }
}