import java.util.Scanner;  // Import the Scanner class
import java.util.Arrays;
import java.util.ArrayList; 

class RemoveDups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number of elements : ");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n]; // int arr[] = new int[n];
        System.out.println("Enter elements ...");
        for(int i=0;i<n;i++){ // for reading array
            System.out.printf("[%d] : ", i+1);
            arr[i] = sc.nextInt();
        }
        /*
        for(int i: arr){ // for printing array
            System.out.println(i);
        }
        */
        System.out.println("Original Array : " + Arrays.toString(arr));
        Integer[] tempArray = removeDuplicates(arr);
        long count = Arrays.stream(tempArray).filter(e -> e != null).count();
        System.out.println("New length of the Array = " + count);
    }
    private static Integer[] removeDuplicates(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] == arr[i + 1]) {
                arr[i] = null;
            }
        }
        return arr;
    }
}