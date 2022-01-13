import java.util.Scanner;
//Task-1: add at least one more instance data field; +
//Task-2: add at least one more instance method; +
//Task-3: create a method showTotalNumberOfStudents(); +
//Task-4: generate IDs automatically; +

public class lab3_1{
    public static void main(String[] args){
        //create and show the data of student 1
        Student student1=new Student();
        student1.showId();
        student1.showGpa();
        student1.showFaculty();

        //create and show the data of student 2
        Student student2=new Student("KBTU",3.58f,"FIT");
        student2.showId();
        student2.showGpa();
        student2.showFaculty();

        //create and show the data of student 3
        Student student3=new Student("KBTU",3.21f,"BS");
        student3.showId();
        student3.showGpa();
        student3.showFaculty();

        //create and show the data of student 4
        Student student4=new Student("KBTU",2.56f,"FIT");
        student4.showId();
        student4.showGpa();
        student4.showFaculty();

        //show total number of students
        int total=student4.showNumberOfStudents();
        System.out.println("Total number of students: "+total);

    }
}
class Student{
    static String university;
    static int num=0,id_count=0;
    int id;
    float gpa;
    String faculty;

    Student(){
        num++;
        id_count++;
        id=id_count;
    }
    Student(String u, float g,String f){
        gpa=g;
        id_count++;
        id=id_count;
        university=u;
        faculty=f;
        num++;
    }
    void showId(){
        if(id<10){
            System.out.println("ID numer is: 000"+id);
        }else if(id<100){
            System.out.println("ID numer is: 00"+id);
        }else if(id<1000){
            System.out.println("ID numer is: 0"+id);
        }else System.out.println("ID numer is: "+id);
    }
    void showGpa(){
        System.out.println("GPA is: "+gpa);
    }
    void showFaculty(){
        System.out.println("Name of faculty is: "+faculty);
    }
    int showNumberOfStudents(){
        return num;
    }

}