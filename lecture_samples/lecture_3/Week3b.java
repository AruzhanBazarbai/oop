public class Week3b{
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.university);
		System.out.println(s1.id);
		System.out.println(s1.gpa);

		Student s2 = new Student("KazBritTU", "20B030101", 3.78f);
		System.out.println(s2.university);
		System.out.println(s2.id);
		System.out.println(s2.gpa);

		s1.showGPA();
		s2.showGPA();

		s1.showUniversity();
	}
}

class Student{
	static String university = "KBTU";
	String id;
	float gpa;

	Student(){}
	Student(String u, String i, float g){
		university = u;
		id = i;
		gpa = g;
	}

	void showGPA(){
		System.out.println(gpa);
	}

	void showUniversity(){
		System.out.println(university);
	}

	// TASK-1: Add at least one more instance data field;

	// TASK-2: Add at least one more instance method;	

	// TASK-3: Create a method showTotalNumberOfStudents();

	// TASK-4: Generate IDs automatically.
}
