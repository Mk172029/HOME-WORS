import java.util.Scanner;

class Game
{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player score: ");
        long score = sc.nextLong();
		System.out.print("Enter Time taken: ");
        double time = sc.nextFloat();
		
		int rank = (int)(score / time);
		System.out.println(" Wrong Rank Score = " + rank);
		
		
		double rank1 = (double) score / time;
		System.out.println("Correct Rank Score = " + rank1);
		
	}
}