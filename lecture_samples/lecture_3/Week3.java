class A{
	int x;
	void f(){
		int x;
		System.out.println(this.x);
	}

	A(){
		this.x = 0;
	}
}

public class Week3{
	public static void main(String[] args) {
		A a = new A();
		int x = 2;
		// System.out.println(a.x);
		// System.out.println(x);
		// a.f();

		int y = x;
		x++;
		// System.out.println(x);
		// System.out.println(y);

		A b = new A();
		System.out.println(b.x);

		A c = b;
		System.out.println(c.x);

		b.x = 10;
		System.out.println(b.x);
		System.out.println(c.x);

		java.util.Date d = new java.util.Date();
		System.out.println(d.getTime());

		d.setTime(1000000000);
		System.out.println(d);
	}
}