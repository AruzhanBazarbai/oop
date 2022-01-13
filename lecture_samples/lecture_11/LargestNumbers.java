import java.util.ArrayList;
import java.math.*;

public class LargestNumbers {
  public static void main(String[] args) {
    ArrayList<Number> list = new ArrayList<Number>();
    list.add(3445); // Add an integer
    list.add(3445.53); // Add a double
    // Add a BigInteger
    list.add(new BigInteger("343")); 
    // Add a BigDecimal
    list.add(new BigDecimal("3445.531")); 
    
    System.out.println("The largest number is " + 
      getLargestNumber(list));
  }
  
  public static Number getLargestNumber(ArrayList<Number> list) {
    if (list == null || list.size() == 0) 
      return null;
    
    Number number = list.get(0);
    for (int i = 1; i < list.size(); i++)
      if (number.doubleValue() < list.get(i).doubleValue()) 
        number = list.get(i);
        //number1 < number2
    
    return number;
  }
}
