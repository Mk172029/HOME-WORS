import java.util.Scanner;

class ATM
{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double balance = 10000.75;
		
		System.out.print("Enter withdraw amount: ");
        float withdraw = sc.nextFloat();
		
		int w = (int) withdraw;
		
	double wrongBalance = balance - (double) w;
		
		System.out.println("Final Balance r = " + wrongBalance);

    int w1 =  (int) (withdraw);
		
	double correctBalance = balance - (double) w;
		
		System.out.println("Final Balance w = " + correctBalance); 


		
}

	}