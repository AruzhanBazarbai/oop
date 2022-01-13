/*
TASK-1: Add at least 2 more data fields with different access modifiers +
TASK-2: Add at least 2 more methods with different access modifiers +
TASK-3: Create a class University that includes Student as a data field (group of students, if possible) +
*/
class Student{
	public String name;
	public String id;
	private double gpa;
	String specialty;
    String faculty;
    public String university;

	Student(String name,String id,double gpa,String specialty,String faculty,String university){
        this.name=name;
        this.id=id;
        this.gpa=gpa;
        this.specialty=specialty;
        this.faculty=faculty;
        this.university=university;

    }

	public double getGPA(){
        return gpa;
    }

	public void setGPA(double g){
        gpa = g;
    }

	static void changeNumber(int a){ // a = x = 5
		a = 10;
	}

	static void changeName(Student s){ // s = s1
		s.name = "Almas";
	}

    void showId(){
        System.out.println(this.id);
    }

    void setId(String id){
        this.id=id;
        System.out.println(this.id);
    }
    public void showUniversity(){
        System.out.println(this.university);
    }
    void showFaculty(){
        System.out.println(this.faculty);
    }

}
class University{
    String university;
    String name;
    String id;
    University(String university,String name,String id){
        this.university=university;
        this.name=name;
        this.id=id;
    }
    void showData(){
        System.out.println(this.name);
        System.out.println(this.university);
        System.out.println(this.id);
    }
}

public class lab4_1{
	public static void main(String[] args) {
		Student s1 = new Student("Aruzhan","1000100",3.75d,"information System","FIT","KBTU");

        s1.showId();
		s1.setId("1000115");
        s1.showFaculty();
        s1.showUniversity();
        University u1=new University(s1.university,s1.name,s1.id);
        u1.showData();
        
	}
}

