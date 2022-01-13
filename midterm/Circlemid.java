public class Circlemid {
 private double radius = 1;
 /** Find the area of this circle */
 public double getArea() {
 return radius * radius * Math.PI;
 }
 public static void main(String[] args) {
 Circlemid myCircle = new Circlemid();
 System.out.println("Radius is " +
myCircle.radius);
 }
}