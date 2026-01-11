import java.util.Scanner;
class  Result
{
	static int total = 0;
    static float percentage;

static void displayResult()
{
	if(percentage >= 40)
	System.out.println("Result: PASS");
else
	System.out.println("Result: FAIL");
}
static void displayGrade() {
        if (percentage >= 75)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }

	 public static void main(String[] args) 
	 {
		Scanner sc = new Scanner(System.in);
        int choice;
       


do {
	System.out.println("...Main menu... ");
	System.out.println("1. Display Total ");
	System.out.println("2. Display Percentage");
	System.out.println("3. Display Result");
	System.out.println("4. Display Grade");
	System.out.println("5. Exit");	
	System.out.println("Enter marks  ");
	
	choice = sc.nextInt();
	
	switch(choice)
	{
		case 1 :
		{  
		System.out.println("Total Marks: " + total);
		break;
		}
	case 2 :
	{
		System.out.println("Percentage: " + percentage + "%");
		break;
	}
	case 3 :
	{ 
       displayResult();
	break;
	}
	case 4 :
	{ 
       displayGrade();
	 break;
	}
	case 5 :
	{ 
       System.out.println("Program exited.");
	 break;
	}
	
	default:
	{
		System.out.println("Thank you welcome...");
	}
	}
}while(choice != 5 );

}

}

