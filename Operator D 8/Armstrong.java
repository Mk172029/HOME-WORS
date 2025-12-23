class Armstrong
{
	public static void main(String[] args)
	{
	int A = 1634;
//	int b = A%10;
    int b = 4;
//        = 163;
//  int c = 163%10;
    int c = 3;
//        = 3;	
//        = 16;	
//  int d = 16&10;
    int d = 6;	   
	
//  int e = 16/10;
    int e   = 1;	
	int h = (e*e*e*e)+(d*d*d*d)+(c*c*c*c)+(b*b*b*b);
	
	boolean i = A==h;
	
	
	
	
	
	
	
	System.out.println(i);
	

	}
}