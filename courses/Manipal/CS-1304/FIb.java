import java.util.*;
class Fibo {
	public static void main(String[] args)
	{
		int a,i=0,s=1,t,u=0;
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		System.out.print(i+" ");
		while(u<=a){
			t=s+i;
			System.out.print(s+" ");
			i=s;
			s=t;
			u++;
		}
	}
}