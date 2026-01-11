import java.util.Scanner;
class  Bankingfloat


{
	
	static float balance;
     static Scanner sc = new Scanner(System.in);

	 void inputBalance()
	{	
		System.out.println("Enter initial balance:");
        balance = sc.nextFloat();
	}
	
     void deposit()
	{
			System.out.println("Enter amount to deposit:");
			float amount = sc.nextFloat();
			balance = amount + balance;
			System.out.println(" Balance: " + balance);
	}
	
	static void withdraw()
	{
			System.out.println("Enter amount to withdraw:");
			float amount = sc.nextFloat();
	if(amount <= balance)
	{
		balance = balance - amount;
		System.out.println(" Balance: " + balance);
	} 
	
	else 
	{
		 System.out.println("Error: Insufficient balance!");
	} 
	}
	static void displayBalance()
	{
		 System.out.println("Current Balance:" + balance);
	}
	
	 public static void main(String[] args)
	 {
       inputBalance();

       deposit();
       withdraw();
       displayBalance();
	}

}
