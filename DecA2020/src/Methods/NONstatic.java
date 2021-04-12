package Methods;


public class NONstatic
{
	
	 public void m4()
	 {
		 System.out.println("M4 started");
	 }
	 
	 public void mul(int a, int b)
	 {
		 int c = a*b;
		 
		 System.out.println("multiplication: " +c);
		 
	 }
	
	public static void main(String[] args)
	{
		
		System.out.println("main started");
		NONstatic s1 = new NONstatic();
		s1.m4();
		System.out.println("Main ended");
		
		s1.mul(4, 6);
	}
	    

}
