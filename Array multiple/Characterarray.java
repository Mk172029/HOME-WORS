class Characterarray
{
	public static void main(String[] args)
	{
		char ar[][] = {{'v','i','j','a','y'},{'a','j','i','t','h'},{'k','a','m','a','l'},{'s','i','m','b','u'}};
		
		for(int i =0;i<ar.length;i++)
		{
			for(int j = 0; j<ar[i].length;j++)
			{
				System.out.print(ar[i][j] + "  ");
			}
			
				System.out.println("");
			
		}
	}
}