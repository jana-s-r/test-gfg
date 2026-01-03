class Solution {
    public int search(int arr[], int x) {
        // code here
        int r=0;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                return r=i;
            }
        }
        return -1;
    }
}
