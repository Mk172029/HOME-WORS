import java.util.Scanner;
class ARRAYREVERSE

{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int choice;
   

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter Numbers");
            System.out.println("2. Display Numbers");
            System.out.println("3. Display Numbers in Reverse Order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter 10 numbers:");
                    for (int i = 0; i < 10; i++)
					{
                        arr[i] = sc.nextInt();
                    }
                   
                    break;

                case 2:
                    System.out.println("Array elements:");
                    for (int i = 0; i < 10; i++)
					System.out.println(arr[i]+"");
					{
                      System.out.println();  
                    }
                   
                    break;

                case 3:
                    System.out.println("Reverse order:");
                    for (int i = 9; i >= 0; i--)
					{
                    System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

} 	
}
