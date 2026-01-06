import java.util.Scanner;
class Employee
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	Scanner sc1= new Scanner(System.in);
	System.out.println("enter your lenth");
	int len = sc.nextInt();
	
	String mk[]= new String[len];
	
	for(int i=0;i<mk.length;i++)
	{
		System.out.println("enter your"+i+"index value");
		mk[i] = sc1.nextLine();
	}
	for(int i=0;i<mk.length;i++)
	{
		System.out.println(mk[i]);
	}
   }

}