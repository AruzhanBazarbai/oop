public class TestGeometricObject {
  /** Main method */
  public static void main(String[] args) {
    // Declare and initialize two geometric objects
    GeometricObject geoObject1 = new Circle("black",true,7);
    GeometricObject geoObject2 = new Rectangle(5, 3);
    Circle circle1=new Circle("red",false,8);
    System.out.println(geoObject1.getColor());
    System.out.println(circle1.getColor());


    //GeometricObject geoObject3 = new GeometricObject();
    GeometricObject[] geoObjects = new GeometricObject[10];
    System.out.println(geoObjects[0]);
    geoObjects[0] = geoObject1;
    geoObjects[1] = geoObject2;
    geoObjects[2] = new Circle(5);
    for(GeometricObject obj: geoObjects)
      if(obj != null)
        displayGeometricObject(obj);

    System.out.println("The two objects have the same area? " +
      equalArea(geoObject1, geoObject2));

    // Display circle
    displayGeometricObject(geoObject1);

    // Display rectangle
    displayGeometricObject(geoObject2);
  }

  /** A method for comparing the areas of two geometric objects */
  public static boolean equalArea(GeometricObject object1,
      GeometricObject object2) {
    return object1.getArea() == object2.getArea();
  }

  /** A method for displaying a geometric object */
  public static void displayGeometricObject(GeometricObject object) {
    System.out.println();
    System.out.println("The area is " + object.getArea());
    System.out.println("The perimeter is " + object.getPerimeter());
  }
}