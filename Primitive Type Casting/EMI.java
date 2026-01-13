import java.util.Scanner;

class EMI
{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		long principal;          
        float Rate;
        int year;
		
		System.out.print("Enter Principal Amount: ");
        principal = sc.nextLong();

        System.out.print("Enter Rate of Interest: ");
        Rate = sc.nextFloat();

        System.out.print("Enter Time (in years): ");
        year = sc.nextInt();
		
		float Interest = principal * Rate * year;  
        float totalAmount = (float) principal + Interest;
		float emi = totalAmount / (float)(year * 12);
     
		{
		System.out.println("Correct EMI = " + emi);	
		}
		
		int emiWrong = (int)(principal +(principal * Rate * year)) / (year * 12); 
		
		{
		System.out.println("Wrong EMI = " + emiWrong);	
		}
		
		
		
		
		
}
	}