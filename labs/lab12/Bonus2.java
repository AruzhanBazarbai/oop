import java.util.*;
class Person{
    public String name;
    public int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class AgeComparator implements Comparator<Person>{
    public int compare(Person p1, Person p2){
        return p2.age-p1.age; 
    }
}
class Bonus2{
    public static void main(String[] args){
        Person p1=new Person("A",18);
        Person p2=new Person("B",78);
        Person p3=new Person("C",98);
        Person p4=new Person("D",48);
        Person p5=new Person("E",28); 
        PriorityQueue<Person> pq=new PriorityQueue<>(new AgeComparator());
        pq.add(p1);
        pq.add(p2);
        pq.add(p3);
        pq.add(p4);
        pq.add(p5);
        while(!pq.isEmpty()){
            Person p=pq.poll();
            System.out.println(p.name+" "+p.age);
        }

    }
}