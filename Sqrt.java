package session1;
import java.util.Scanner;  

public class Sqrt{  
  public static void main(String[] args)    
  {
	  //Getting Inputs
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter a number: ");  
      int n = sc.nextInt(); 
      System.out.println("The square of "+ n+" is: "+(n*n));
      System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
  }  
  //User defined function for squareroot
  public static double squareRoot(int num)   
  {
      double temp;  
      double sqrtroot=num/2;  
      do   
      {  
          temp=sqrtroot;  
          sqrtroot=(temp+(num/temp))/2;  
      }   
      while((temp-sqrtroot)!= 0);  
      return sqrtroot;  
 }  
}  