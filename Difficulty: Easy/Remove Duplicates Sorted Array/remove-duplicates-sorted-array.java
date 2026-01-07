class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int a:arr){
            
                set.add(a);
            
        }
        ArrayList<Integer> res = new ArrayList<>(set);
        Collections.sort(res);
        return res;
    }
}
