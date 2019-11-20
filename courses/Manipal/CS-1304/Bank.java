import java.util.Scanner;
class banking
{
	private int acc_no;
	private String cus_name, branch;
	public int cust_bal=20000;
	
	public banking()
	{
	
	}
	
	public banking( int a, String cn, String b)
	{
		
		acc_no=a;
		cus_name=cn;
		branch=b;
	}
	
	public void withdraw(int amt)
	{
		if(amt>cust_bal)
			System.out.println("Insufficient funds");
		else
		{
			System.out.println("Processing");
			cust_bal=cust_bal-amt;
			System.out.println("Request processed");
			System.out.println("Remaining in account="+cust_bal);
		}
	}
	
	public void deposit(int amt)
	{

		System.out.println("Processing");
		cust_bal=cust_bal=amt;
		System.out.println("Request processed");
		System.out.println("Remaining in account="+cust_bal);
	}
	
}

class bank
{
	public static void main(String args[])
	
	{
		int amt, option;
		banking customer=new banking(1211,"Twisha","Jaipur");
		Scanner sc= new Scanner(System.in);
		do
		{
		System.out.println("1. Withdraw \n2.deposit \n 3.No pending work");
		System.out.println("Enter what is your option:");
		option=sc.nextInt();
		switch(option)
		{
		
					case 1:
                        System.out.println("Enter amount to withdraw");
                        amt=sc.nextInt();
                        customer.withdraw(amt);
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit");
                        amt=sc.nextInt();
                        customer.deposit(amt);
                        break;
                    case 3:
                        System.out.println("Sayonara");
                        break;
                    default:
                        System.out.println("Invalid choice");
		}
	}
	while(option!=3);
	}
}