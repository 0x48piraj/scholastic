import java.util.*; // bad practice
class Fibo {
	public static void main(String[] args)
	{
		int a,i=0,s=1,t,u=0; // bad variable naming
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		System.out.print(i+" ");
		while(u<a){ // ._."
			t=s+i;
			System.out.print(s+" ");
			i=s;
			s=t;
			u++;
		}
	}
}
// author - @manav1999