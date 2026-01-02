class Looppelin

{
	public static void main(String[] args)
	{
		int A = 1331;
		int b = 1331;
		int c = 0;
		int sum = 0;
		
		while(b>0)
		{
			c = b%10;
			sum = c+(sum*10);
			b = b/10; 
		}
       if (A==sum)
	   {   
	   System.out.println("tha palindrome numper");
	   }
	   else {
		   System.out.println("tha not palindrome numper");
	   }
	   
	}
	
	
	
}