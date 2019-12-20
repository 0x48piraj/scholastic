import java.util.*;
class Prime 
{
	public static void main(String[] args){
		int n;
		boolean f= false;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==1)
			{
			System.out.println("not Prime"+n);
			}
		else
			{
				for(int i=2;i<=n/2;i++)
					{
						if(n%i==0){
							f=true;
							break;
						}
					}
		if(!f)		
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" not a prime");
		}	
		
		}

		
	
}