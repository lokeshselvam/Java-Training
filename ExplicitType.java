package session1;

public class ExplicitType{
	double d = 100.04;
	long l;
	int i;
	void conversion()
	{
		l=(long)d;
		i=(int)d;
		System.out.println("Double value " + d);
		System.out.println("Long value " + l);
		System.out.println("Int value " + i);
	} 
	public static void main(String[] args) 
	{ 
		ExplicitType E = new ExplicitType();
		E.conversion();
	} 
}
