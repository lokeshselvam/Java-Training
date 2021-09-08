package session1;

public class AutoTypeConversion 
{ 
    int x = 20; 
    double y = 40.5; 
    long p = 30; 
    float q = 10.60f; 
	void sum() 
	{
		//We need to convert int into double we can't do vice versa 
		double sum=x+y;
		System.out.println("Sum of two numbers is : " + sum);
	} 
	void sub() 
	{ 
		//We need to convert long into float we can't do vice versa
		float sub=p-q;
		System.out.println("Subtraction of two numbers: " + sub);
	} 
	public static void main(String[] args) 
	{ 
	   AutoTypeConversion obj = new AutoTypeConversion(); 
	   obj.sum();
	   obj.sub();
	} 
}
