import java.util.Scanner;

class CountPositive
 {
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("1. Enter Numbers");
            System.out.println("2. Display Numbers");
            System.out.println("3. Count Positive Numbers");
            System.out.println("4. Count Negative Numbers");
            System.out.println("5. Count Zeros");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
			{

                case 1:
                    System.out.println("Enter 10 integers:");
                    for (int i = 0; i < 10; i++) {
                        a[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Display Numbers:");
                    for (int i = 0; i < 10; i++)
						
					{
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int pos = 0;
                    for (int i = 0; i < 10; i++) 
					{
                        if (a[i] > 0)
                            pos++;
                    }
                    System.out.println("Positive Count = " + pos);
                    break;

                case 4:
                    int neg = 0;
                    for (int i = 0; i < 10; i++) 
					{
                        if (a[i] < 0)
                            neg++;
                    }
                    System.out.println("Negative Count = " + neg);
                    break;

                case 5:
                    int zero = 0;
                    for (int i = 0; i < 10; i++) 
					{
                        if (a[i] == 0)
                            zero++;
                    }
                    System.out.println("Zero Count = " + zero);
                    break;

                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
