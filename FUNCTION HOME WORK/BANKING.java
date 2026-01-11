import java.util.Scanner;
class Banking
{
	double ACBalance = 0.0;
		
	 	
public static void main(String[] args)
{
	 Banking bank = new Banking();
	bank.MAIN ();
}

void MAIN()
{
	int option = 0;
	Scanner sc = new Scanner(System.in);
do {
	System.out.println("...Main menu... ");
	System.out.println("1. Deposit ");
	System.out.println("2. Withdraw");
	System.out.println("3. Check Balance");
	System.out.println("4. Exit");
	System.out.println("Enter option ");
	
	option = sc.nextInt();
	
	switch(option)
	{
		case 1 :
		{  
		System.out.println("Enter deposit amt : ");
		double Depositamd = sc.nextDouble();
		Deposit(Depositamd);
		break;
		}
	case 2 :
	{
		System.out.println("Enter withdrawal amt : ");
		double Withdrawamd = sc.nextDouble();
		Withdraw(Withdrawamd);
		break;
	}
	case 3 :
	{ 
        checkBalance();
	break;
	}
		
	
	default:
	{
		System.out.println("Thank you welcome...");
	}
	}
}while(option != 4 );

}
void Deposit(double Depositamd)
	{
		ACBalance += Depositamd; 
	} 
void Withdraw(double Withdrawamd)
	{
 if (ACBalance >= Withdrawamd)
		{
			ACBalance -= Withdrawamd;
		}
 else
	{
	System.out.println("no amd");	
	}
	
	}
void checkBalance()
{
	System.out.println(ACBalance);
}

}

