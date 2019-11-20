import java.util.Scanner;
class customer
{
	int cus_ID, cus_bal;
	String cus_name, branch_name, IFSC;
	
	public customer()
	{
	
	}
	public customer(int CID, int Cbal, String Cname, String Bname, String I)
	{
		cus_ID=CID;
		cus_balance=Cbal;
		cus_name=Cname;
		branch_name=Bname;
		IFSC=I;
	}
	
	public void show()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Please enter your customer id:");
		String cus_ID=s1.nextInt();
		System.out.println("Please enter your name:");
		String cus_name=s1.nextLine();
		
		for(i=1;i<100;i++)
		{
			if(c(i).Cname==cus_name && c(i).CID==cus_id)
				{
					System.out.println("Customer id:"+c(i).CID);
					System.out.println("Customer balance:"+c(i).Cbal);
					System.out.println("Customer name:"+c(i).Cname);
					System.out.println("Customer name:"+c(i).Bname);
					System.out.println("Customer name:"+c(i).I);
				}
			else
				System.out.println("Please Enter correct ID and name");
		}
	}
	void get()
	{
			customer c(1)= new customer(189303009,10000,"Twisha","Kolkata","IWK1311");
			customer c(2)= new customer(189301009,100,"Krishna","Mumbai","IMM1311");
			customer c(3)= new customer(189303065,3000,"Sagarika","Pune","IMPS1311");
			customer c(4)= new customer(189302011,90000,"Aditi","Hyderabad","IKH1311");
	}
				
		public static void main(String args[])
		{
			get();
			show();
		}
	}