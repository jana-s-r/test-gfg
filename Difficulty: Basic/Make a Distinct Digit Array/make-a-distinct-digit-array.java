// User function Template for Java

class Solution {
    public int[] common_digits(int[] nums) {
        // code here
        Set<Integer> set = new HashSet<>();
        
        for(int x:nums){
            while(x>0){
                int d=x%10;
                set.add(d);
                x/=10;
            }
        }
        int[] res = new int[set.size()];
        int i=0;
        for(int x:set){
            res[i++]=x;
        }
        return res;
    }
}