package Pkg1;

public class Pgm2 {
	public int Sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum result is"+c);
		return c;
	}
	public int Sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("Sum result is"+z);
		return z;
	}
	public void Mul(int a1,int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("Final result is "+a3);
	}
	public static void main(String[] args) {
		Pgm2 Prgm=new Pgm2();
		int result1=Prgm.Sum(10,2);
		int result2=Prgm.Sub(5, 2);
		Prgm.Mul(result1, result2);
		
	}
}
