import java.util.HashSet; 
  
class LongestSubSeq { 
    // Returns length of the longest consecutive subsequence 
    public static void main(String args[]) { 
        int arr[] =  {1, 9, 3, 10, 4, 20, 2}; 
        int n = arr.length;
        HashSet<Integer> S = new HashSet<Integer>(); 
        int ans = 0; 
        for (int i=0; i<n; ++i) // Hash all the array elements 
            S.add(arr[i]); 
        // check each possible sequence from the start, then update optimal length 
        for (int i=0; i<n; ++i) { // if current element is the starting, it's of a sequence 
            if (!S.contains(arr[i]-1)) 
            { 
                // Then check for next elements in the sequence 
                int j = arr[i]; 
                while (S.contains(j)) 
                    j++; 
                // update optimal length if this length is more 
                if (ans<j-arr[i]) 
                    ans = j-arr[i]; 
            } 
        } 
        System.out.println("Length of the longest consecutive sequence : " + ans); 
    } 
} 