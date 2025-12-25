import java.util.Scanner;

class Trafficsignal 
{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.print("Choose your option : ");
			String cha = sc.nextLine();
			
			switch(cha)
			{
				case "r":
				{System.out.println("Red:");}
				break;
				case "y":
				{System.out.println("Yellow:");}
				break;
				case "g":
				{System.out.println("Green:");}
				break;
				default: 
				{System.out.println("Shop is closed");}
			}
		}
	}
}