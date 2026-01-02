class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int res =0;
        int l = arr[arr.length-1];
        
        for(int i=arr.length-2;i>=0;i--) {
            if(l!=arr[i]){
                res = arr[i];
                break;
            }
        }
        
        return res;
    }
}