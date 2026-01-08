import java.util.Scanner;
class Library
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("total books :");
		int book_nu = sc.nextInt();
		String Library []= new String[book_nu];
		
		int index = 0;

		   int choice;
		do
		 {
			System.out.println("enter book name:"); 
			System.out.println("1.add student name:");
			System.out.println("2.Search Book by ID:");
			System.out.println("3.Display All Books:");
			System.out.println("4.Exit:");
			 
	      choice = sc.nextInt();
		 
		 switch(choice)
		 {
			 case 1:
			        System.out.print("enter book name:");
			        Library [index]=sc1.nextLine();
					index++;
					
			case 2:
                    System.out.print("enter ID name:");
			        Library [index]=sc1.nextLine();
					index++;			
			
					break;
			
			 case 3:
					for(int i=0;i<index;i++)
				    System.out.println(Library[i]+" ");
			        
					break;
					
					
			 case 4:		
			 
			 default:
			 System.out.print("enter correct choce:");
		 }
		 
		 
		 
		 
		 
		 } while(choice!=4);
		
	}
}