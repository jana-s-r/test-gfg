// User function Template for Java

class Solution {
    public static ArrayList<Integer> bitonicGenerator(int arr[]) {
        // Your code goes here
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        
        for(int i=0;i<arr.length;i++) {
            if(i%2==0){
                even.add(arr[i]);
            }else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
    
        Collections.sort(odd, Collections.reverseOrder());
        
        even.addAll(odd);
        
        return even;
    }
}
