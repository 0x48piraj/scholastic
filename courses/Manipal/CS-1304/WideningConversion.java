abstract class holiday
{
	public void display()
	{
		System.out.println("I am holiday");
	}
	
}

class christmas extends holiday
{
	public void show()
	{
		System.out.println("I am christmas");
	}
}
class td
{
	public static void main(String args[])
	{
		holiday h1=new christmas();
		christmas c1=new christmas();
		c1.display();
		c1.show();
	}
}