class Arms
{
	public static void main(String[] args)
	{
	int z = 1634;
	
	
	int a = z%10;
//        = 4;
    int b = z/10;
    	
//        = 163;	
    int c = b&10;
//        = 6;	   
	
    int d = b/10;
    int e = d%10;	
	int f = d/10;
	int g = (a*a*a*a)+(c*c*c*c)+(e*e*e*e)+(f*f*f*f);
	
	boolean i = (z == g);
	
	
	
	
	
	
	
	System.out.println("Arms"+i);
	

	}
}