package session1;

public class Interest {
	public static void main(String args[]) {
		float p,r,t,si;
		p=13000;
		r=12;
		t=2;
		//Simple Interest is (Principle * Rate * Time) /100
		si=(p*r*t)/100;
		System.out.println("Simple Interest is : Rs " + si);
	}
}
