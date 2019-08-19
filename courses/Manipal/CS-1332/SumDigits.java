class SumDigits { 
  public static void main(String args[]) 
    {
        int sum = 0;
        int len = args[0].length(); // how big the num is ?
        int num = Integer.parseInt(args[0]);
        System.out.printf("The sum of digits = ");
        for (int i = 0; i < len; i++) {
            sum += num % 10;
            System.out.printf("%d", num % 10);
            if(i != len-1) {
                System.out.printf("+");
            }
            num = num / 10;
        }
        System.out.println(" = " + sum);
    } 
}