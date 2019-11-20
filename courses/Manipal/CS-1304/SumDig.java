class SumDigits { 
  public static void main(String args[]) 
    {
    	int sum = 0;
        int[] nums = new int[args[0].length()];
        System.out.printf("The sum of digits = ");
        for(int i = 0; i < args[0].length(); i++){
            nums[i] = Integer.parseInt(""+args[0].charAt(i));
            sum += nums[i];
            System.out.printf("%d", nums[i]);
            if(i != args[0].length()-1) {
            	System.out.printf("+");
            }
        }
        System.out.println(" = " + sum);
    } 
}