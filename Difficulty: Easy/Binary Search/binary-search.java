class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int r = 0;
        boolean b = false;
        for(int i=0;i<arr.length;i++) {
            if(k==arr[i]){
                r = i;
                b = true;
                break;
            }
        }
        if(!b){
            return -1;
        }
        return r;
    }
}