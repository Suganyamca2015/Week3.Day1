package week3.day1;

public class Calculator {

	public void add(int n1,int n2)
	{	
		System.out.println( n1+n2);	
	}
	public void add(int n1,int n2,int n3) {

		System.out.println(n1+n2+n3);	
	}
	public void sub(int n1,int n2) {

		System.out.println(n1-n2);
	}
	public void sub(double n1,double n2) {

		System.out.println( n1-n2);
	}
	public void Mult(int n1,int n2) {
		 
		System.out.println(n1*n2); 
	}
	public void Mult(int n1,int n2,double n3) {
	
		System.out.println(n1*n2*n3);
	}
	
	public static void main(String[] args) {

		Calculator cal =new Calculator();
		cal.add(10,10);
		cal.add(10,10,10);
		cal.sub(10.2,5.2);
		cal.sub(10, 5);
		cal.Mult(5, 5);
		cal.Mult(5, 5, 2.2);
	}

}
