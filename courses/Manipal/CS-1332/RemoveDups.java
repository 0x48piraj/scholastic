import java.util.Scanner;  // Import the Scanner class
import java.util.Arrays;
import java.util.LinkedHashSet;

// no pre-cond. was given, used best way to tackle the prob.
class RemoveDups
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number of elements : ");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        System.out.println("Enter elements ...");
        for(int i=0;i<n;i++){ // for reading array
            System.out.printf("[%d] : ", i+1);
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : " + Arrays.toString(arr));
        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(arr));
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
        //Verify the array content
        System.out.println("Uniq Array : " + Arrays.toString(numbersWithoutDuplicates));
        System.out.println("New length of the Array : " + numbersWithoutDuplicates.length);
    }
}