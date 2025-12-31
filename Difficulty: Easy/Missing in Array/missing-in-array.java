class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1){
                n = i+1;
        }
        }
       return n+1; 
    }
}