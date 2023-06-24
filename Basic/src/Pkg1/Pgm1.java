package Pkg1;

public class Pgm1 {
	int rollno=10;
	public void Message()
	{ 
		System.out.println("Automation is easy");
	}
public static void main(String[] args) 
{
	Pgm1 M= new Pgm1();
	System.out.println("Roll no is" + M.rollno);
	M.Message();
	
}
}