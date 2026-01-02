class Loopneyan

{
	public static void main(String[] args)
	{
		int A = 9;
		int b = 81;
		int c = 0;
		int sum = 0;
		
		while(b>0)
		{
			c = b%10;
			sum = sum+c;
			b = b/10; 
		}
       if (A==sum)
	   {   
	   System.out.println("tha neyan numper");
	   }
	   else {
		   System.out.println("tha not neyan numper");
	   }
	   
	}
	
	
	
}