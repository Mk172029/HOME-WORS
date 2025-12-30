import java.util.Scanner;

class ElectricityBill 
{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Choose your option: ");
			int A = sc.nextInt();
		
//              100*5/100*75
            
    if ((A>=200)&&(A<=500))
	
	{
	System.out.println("Electricity Bill:"+1500);
	}
    else if((A>=101)&&(A<=200))
		{
	System.out.println("Electricity Bill:"+520);
		}
	else if((A>=50)&&(A<=100))
		{
	System.out.println("Electricity Bill:"+375);
		}		
	else
	   {
		System.out.println("no");
	   }	
}
   }   
     }