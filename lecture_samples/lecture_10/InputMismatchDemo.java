import java.util.*;

public class InputMismatchDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    // Display the result
    System.out.println("The number entered is " + number);
  }
}
