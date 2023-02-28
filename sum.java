//this is for jenkins
import java.util.*;
public class sum
{ 
   public static void main(String args[]) 
   { 
      int x, y, z; 
      System.out.println("Enter two integers to calculate their sum "); 
      Scanner in = new Scanner(System.in); 
      x = Integer.parseInt(args[0]); 
      y = Integer.parseInt(args[1]);  
      z = x + y; 
      System.out.println("Sum of entered integers = "+z); 
   } 
} 