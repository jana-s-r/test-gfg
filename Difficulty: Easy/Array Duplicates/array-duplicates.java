class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
     Arrays.sort(arr);

        ArrayList<Integer> ans = new ArrayList<>();

        // traverse the sorted array and check 
        // for consecutive duplicates
        for (int i = 1; i < arr.length; i++) {
            
            // if current element is same as previous
            if (arr[i] == arr[i - 1])
            {
                
                // avoid adding the same duplicate 
                // multiple times
                if (ans.isEmpty() || 
                        ans.get(ans.size() - 1) != arr[i]) {
                    ans.add(arr[i]);
                }
            }
        }

        return ans;
    }}