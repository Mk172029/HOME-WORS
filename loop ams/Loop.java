class Loop

{
	public static void main(String[] args)
	{
		int A = 153;
		int b = 153;
		int c = 0;
		int sum = 0;
		
		while(b>0)
		{
			c = b%10;
			sum = sum +(c*c*c);
			b = b/10; 
		}
       if (A==sum)
	   {   
	   System.out.println("tha ams numper");
	   }
	   else {
		   System.out.println("tha not ams numper");
	   }
	   
	}
	
	
	
}