import java.util.Scanner;

public class Main_5{
  public static void main(String[] args) {
    Scanner num=new Scanner(System.in);
    int w,h;

    //create a rectangle with width and height equal to 1
    Rectangle rect1=new Rectangle();

    System.out.println("The area of rectangle with width "+rect1.width+" and height "+rect1.height+" is: "+rect1.getArea());
    System.out.println("The perimeter of rectangle with width "+rect1.width+" and height "+rect1.height+" is: "+rect1.getPerimeter());
    System.out.println(" ");

    //Enter the second rectangle's data
    System.out.print("Enter a width of rectangle: ");
    w=num.nextInt();
    System.out.print("Enter a height of rectangle: ");
    h=num.nextInt();
    
    Rectangle rect2=new Rectangle(w,h);

    System.out.println("The area of rectangle with width "+rect2.width+" and height "+rect2.height+" is: "+rect2.getArea());
    System.out.println("The perimeter of rectangle with width "+rect2.width+" and height "+rect2.height+" is: "+rect2.getPerimeter());
    System.out.println(" ");

    //Enter the third rectangle's data
    System.out.print("Enter a width of rectangle: ");
    w=num.nextInt();
    System.out.print("Enter a height of rectangle: ");
    h=num.nextInt();
    
    Rectangle rect3=new Rectangle(w,h);

    System.out.println("The area of rectangle with width "+rect3.width+" and height "+rect3.height+" is: "+rect3.getArea());
    System.out.println("The perimeter of rectangle with width "+rect3.width+" and height "+rect3.height+" is: "+rect3.getPerimeter());
    System.out.println(" ");

    //change the data
    System.out.print("Enter a \"1\" if you want to change the width of rectangle,or another if you don't want: ");
    w=num.nextInt();
    if(w==1){
        System.out.print("Enter a width of rectangle: ");
        w=num.nextInt();
        rect3.changeWidth(w);
    }
    System.out.print("Enter a \"1\" if you want to change the height of rectangle,or another if you don't want: ");
    h=num.nextInt();
    if(h==1){
        System.out.print("Enter a height of rectangle: ");
        h=num.nextInt();
        rect3.changeHeight(h);
    }

    System.out.println("The area of rectangle with width "+rect3.width+" and height "+rect3.height+" is: "+rect3.getArea());
    System.out.println("The perimeter of rectangle with width "+rect3.width+" and height "+rect3.height+" is: "+rect3.getPerimeter());
    System.out.println(" ");

    }
}


class Rectangle{
    int width,height;

	Rectangle(){
		width=1;
        height=1;
	}

	Rectangle(int w,int h){
		width=w;
        height=h;
	}

    int getArea(){
        return width*height;
    }

    int getPerimeter(){
        return 2*(width+height);
    }

    void changeWidth(int w){
        width=w;
    }

    void changeHeight(int h){
        height=h;
    }
	
}