class Fibo { 
  public static void main(String args[]) 
    {
        System.out.printf("The first 20 Fibonacci numbers are : ");
        int n = 20;
        float fibo_sum = 0;
        // int zero, one = zero = one = 1; works flawlessly but is confusing to most eyes
        int n1 = 0, n2 = 1; // F0 = 0 and F1 = 1 as seed values
        for (int i = 0; i < n; i++) {
        	System.out.printf(n2 + " ");
        	fibo_sum += n2;
        	n2 = n2 + n1;
        	n1 = n2 - n1;
        }
        System.out.println("\nThe average is : " + fibo_sum / n);
    } 
}