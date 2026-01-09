import java.util.Scanner;
class  SimpleResult


{
	
	static int subject1, subject2, subject3;
    static int total;
    static double percentage;

	static void inputMarks()
	{	
		Scanner sc = new Scanner(System.in);
	
	
		System.out.print("Enter Subject mark 1: ");
		subject1 = sc.nextInt();
	
		System.out.print("Enter Subject mark 2: ");
		subject2 = sc.nextInt();
	
		System.out.print("Enter Subject mark 3: ");
		subject3 = sc.nextInt();
	
	}
	
		static void calculateTotal()
	{
			total = subject1+subject2+subject3;
			System.out.println("Total Marks = " + total);
	}
	
		static void calculatePercentage()
	{
			percentage = (total / 3) * 100;
			System.out.println("percentage = " +percentage+"%");
	}
	
	
	 public static void main(String[] args)
	 {
        inputMarks();
        calculateTotal();
        calculatePercentage();

	}

}
