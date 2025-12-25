import java.util.Scanner;

class Railwayticket  
{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Choose your option : ");
			int num = sc.nextInt();
			
			switch(num)
			{
				case 1:
				{System.out.println("General");}
				break;
				case 2:
				{System.out.println("Sleeper");}
				break;
				case 3:
				{System.out.println("AC 3 Tier");}
				break;
				case 4:
				{System.out.println(" AC 2 Tier");}
				break;
				case 5:
				{System.out.println("First Class");}
				break;
				default: 
				{System.out.println("Shop is closed");}
			}
		}
	}
}