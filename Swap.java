package session1;

public class Swap {
	public static void main(String a[])
	{
		//Swaping Without Third Variable
		int x = 10;
		int y = 5;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swaping:" + " x = " + x + ", y = " + y);
	}
}


