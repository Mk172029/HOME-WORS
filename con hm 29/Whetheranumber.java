import java.util.Scanner;

class Whetheranumber 
{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Enter your numper: ");
			int x = sc.nextInt();
		
//              
            
if (x%21 == 0)
	
	{
	System.out.println(" Multiple of 3 and 7");
	}
	else if (x%9 == 0)
	
	{
	System.out.println(" Mutiple of 3 ");
	}
	else if (x%14 == 0)
	
	{
	System.out.println("Mutiple of 7");
	}
	else if (x%8 == 0)
	
	{
	System.out.println("Not a multiple of 3 or 7 ");
	}
	
	else
	   {
		System.out.println("no");
	   }	
}
   }   
     }