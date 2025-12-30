
class Solution {
    public String average(int arr[]) {
        // code here
        int sum = 0;
        for(int a : arr) {
            sum+=a;
        }
        double res = (double)sum/arr.length;
        
        return String.format("%.2f",res);
    }
}