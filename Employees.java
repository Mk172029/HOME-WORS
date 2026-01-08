import java.util.Scanner;
class Employees
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("tatal Employee numper:");
		int emp_nu = sc.nextInt();
		String Employee_name []= new String[emp_nu];
		
		int index = 0;
		   int choice;
		do
		 {
			System.out.println("enter Employee names:"); 
			System.out.println("1.add Employee name:");
			System.out.println("2.See the Employee List:");
			System.out.println("3.Exit:");
			 
	      choice = sc.nextInt();
		 
		 switch(choice)
		 {
			 case 1:
			        System.out.print("enter Employee name:");
			        Employee_name [index]=sc1.nextLine();
					index++;
					break;
			
			 case 2:
					for(int i=0;i<index;i++)
				    System.out.println(Employee_name[i]+" ");
			        
					break;
					
			 case 3:		
			 
			 default:
			 System.out.print("enter correct choice:");
		 }
		 
		 
		 
		 
		 
		 } while(choice!=3);
		
	}
}