import java.util.Scanner;
class Students
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("tatal student numper:");
		int stu_nu = sc.nextInt();
		String Student_name []= new String[stu_nu];
		
		int index = 0;
		   int choice;
		do
		 {
			System.out.println("enter student name:"); 
			System.out.println("1.add student name:");
			System.out.println("2.See the Student List:");
			System.out.println("3.Exit:");
			 
	      choice = sc.nextInt();
		 
		 switch(choice)
		 {
			 case 1:
			        System.out.print("enter student name:");
			        Student_name [index]=sc1.nextLine();
					index++;
					break;
			
			 case 2:
					for(int i=0;i<index;i++)
				    System.out.println(Student_name[i]+" ");
			        
					break;
					
			 case 3:		
			 
			 default:
			 System.out.print("enter correct choce:");
		 }
		 
		 
		 
		 
		 
		 } while(choice!=3);
		
	}
}