/*  
 * Assignment ((((10+2)+2)-2)*2)/2)
 * 
 */
package Pkg1;

public class Pgm3 {
	
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
	public int Mul(int a1,int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("Mul result is "+a3);
		return a3;
		
	}
	public void Div(int a4,int a5)
	{
		int a6;
		a6=a4/a5;
		System.out.println("Final result is "+a6);
	}
	public static void main(String[] args) {
		Pgm3 Prgm=new Pgm3();
		int result1=Prgm.Sum(10,2);
		int result2=Prgm.Sum(result1,2);
		int result3=Prgm.Sub(result2,2);
		int result4=Prgm.Mul(result3,2);
	    Prgm.Div(result4, 2);
	}
}


