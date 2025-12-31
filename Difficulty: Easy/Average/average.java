class Solution {
    public static double posAverage(int[] arr) {
        // Code here
        double sum = 0;
        double count = 0;
        for(double n : arr) {
            if(n>=0) {
                sum+=n;
                count++;
            }
        }
        
        double avg = sum/count;
        
        return avg;
    }
}
