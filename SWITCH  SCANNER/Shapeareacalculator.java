import java.util.Scanner;

class Shapeareacalculator   
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
				{System.out.println("Circle");}
				break;
				case 2:
				{System.out.println("Square");}
				break;
				case 3:
				{System.out.println("Rectangle");}
				break;
				case 4:
				{System.out.println(" Triangle");}
				break;
				default: 
				{System.out.println("TK you");}
			}
		}
	}
}