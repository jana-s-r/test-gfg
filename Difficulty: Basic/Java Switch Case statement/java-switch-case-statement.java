// User function Template for Java

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // code here
        if(choice==1) {
            Double r = arr.get(0);
            return Math.PI*r*r;
        }else{
            Double l = arr.get(0);
            Double b = arr.get(1);
            return l*b;
        }
    }
}