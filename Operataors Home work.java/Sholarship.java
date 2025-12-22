class Sholarship
{
	public static void main(String[]args)
	
	{
	int mark = 85;
	boolean attendance = true;
	boolean discipline = true;
	boolean sholarship = attendance && discipline;
	boolean pass = attendance || discipline;
	
	
	System.out.println("sholarship:"+sholarship);
	System.out.println("pass:"+pass);
	
	
	}
	
}