/*
TASK-1: Create two groups of students (2 arrays), and initialize them;
TASK-2: Create a static method that compares two student arrays, 
		and returns how many students from 2 have the same name;
TASK-3: Modify the Student to make it an immutable class;
TASK-4: Create the Classes Course and Faculty, 
		and demonstrate their relationships to the Student class like in the lecture slides.
*/

class Student{
	private String name;
	public String id;
	private double gpa = 4;
	String specialty;

	Student(String n){
		name = n;
	}

	public double getGPA(){return gpa;}

	public void setGPA(double gpa){
		this.gpa = gpa;	// local gpa = own value = 2
		System.out.println("GPA: " + gpa); 
	}

	static void changeNumber(int s){ // a = x = 5
		s = 10;
	}

	static void changeName(Student s){ // s = s1
		s.name = "Almas";
	}

	public String getName(){
		return "Student: " + this.name;
	}

	public void printStudent(){
		System.out.println("Student: " + name);
	}
}

public class W5a{
	public static void main(String[] args) {
		Student s1 = new Student("A");
		System.out.println(s1.getGPA());	// 4
		s1.setGPA(2);	// 2
		System.out.println(s1.getGPA());	// 4

		Student s2 = new Student("A");

		int[] numbers = new int[10];
		Student[] students = new Student[10];

		// System.out.println(numbers[0]);
		// System.out.println(students[0]);

		students[0] = new Student("Abay");
		students[1] = new Student("Marzhan");
		students[9] = new Student("Zere");

		int i = 1;

		for(i=0; i<students.length; i++){ // 0,1,2,...9, i=10
			//if(students[i] != null)
				//System.out.println(students[i].getName());
		}

		//System.out.println(i);
		
	}
}
