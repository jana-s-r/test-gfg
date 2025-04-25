//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1;
        int secondLargest = -1;
        
        for (int num : arr) {
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num < largest && num > secondLargest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}