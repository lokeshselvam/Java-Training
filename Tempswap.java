package session1;

public class Tempswap {
	public static void main(String[] args) {
		//Initializing the values
		int x=10, y=5, t;   
	    System.out.println("before swapping numbers: "+x +"  "+ y); 
	    //using temp to store the value
	    t = x;  
	    x = y;  
	    y = t;  
	    System.out.println("After swapping: "+x +"   " + y);  
	    System.out.println( );  
	}    
}
