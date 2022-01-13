class A{
    public String a;
    private int x=111;
    public void p(){
        System.out.println(x);
    }
    // A(String a){
    //     this.a=a;
    // }
    public void f1(String a){
        System.out.println(a);
    }
    public void f3(){
        System.out.println("Hellooo");
    } 
}
class B extends A{
    public void f2(String b){
        System.out.println(b);
    }
}
class Week3c{
    public static void main(String[] args){
        A a=new A();
        a.p();
        a.f1("dddd");
        a.f3();
        B b=new B();
        b.f2("ccc");
        b.f1("hhhh");
        b.f3();
    }
}