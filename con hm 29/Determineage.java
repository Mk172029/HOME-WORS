class  Determineage
{
	public static void main(String[] args)
	{
	int A = 17;

    if ((A>=50)&&(A<=60))
	
	{
	System.out.println(" Senior");
	}
    else if((A>=20)&&(A<=59))
		{
	System.out.println("Adult");
		}
	else if((A>=13)&&(A<=19))
		{
	System.out.println("Teenager");
		}
	else if((A>=10)&&(A<=13))
		{
	System.out.println(" Child ");
		}
	else
	   {
		System.out.println("no");
	}	
	
	
	}
}