class Student{
	private String name;
	public String id;
	private double gpa = 4;
	String specialty;
	private static int x;

	Student(String n){
		name = n;
	}

	public double getGPA(){return gpa;}
	public void setGPA(double gpa){
		this.gpa = gpa;	// gpa = 2;
	}

	static void changeNumber(int s){ // a = x = 5
		s = 10;
		Student.x = 10;
	}

	static void changeName(Student s){ // s = s1
		s.name = "Almas";
	}

	public String getName(){
		return "Student: " + this.name;
	}

	public void printStudent(){
		System.out.println("Student: " + name);
		double gpa = 1;
		System.out.println(gpa);
	}
}

public class Week5a{
	public static void main(String[] args) {
		Student s1 = new Student("A");
		System.out.println(s1.getGPA());	// 4
		//s1.printStudent();	// 1
		s1.setGPA(2);
		System.out.println(s1.getGPA());

		//System.out.println(s1.name);
		//System.out.println(s1.specialty);
		//System.out.println(s1.gpa);
		//System.out.println(s1.getGPA());

		//double d = s1.getGPA();

		//s1.gpa = 4.0;
		s1.setGPA(3.5);
		//System.out.println(s1.gpa);
		//System.out.println(s1.getGPA());

		int x = 5;
		// System.out.println(x);
		// Student.changeNumber(x);
		// System.out.println(x);

		// System.out.println(s1.name);
		// Student.changeName(s1);
		// System.out.println(s1.name);

		int[] arr = new int[10];
		Student[] students = new Student[10];

		//System.out.println(arr[2]);
		//System.out.println(students[10]);

		students[0] = new Student("Abay");
		students[1] = new Student("Zere");
		// System.out.println(students[0].getName());
		// System.out.println(students[1].getName());
		//System.out.println(students[2].printStudent()); // error
		//System.out.println(students[2].getName());

		for(int i=2; i<students.length; i++){
			students[i] = new Student("XXX");
		}

		int i = 0;

		for(i=0; i<students.length; i++){ // i=0,1,2,..,9 i=10
			System.out.println(students[i].getName());
		}

		System.out.println(i);
	}
}
