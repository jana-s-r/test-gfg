// User function Template for Java
class Solution {
    public static int gcd(int a, int b) {

        // code here to calculate and return gcd of a and b
        int gcd=0;
        for(int i=1;i<=100;i++) {
            if(a%i==0 && b%i==0) {
                gcd= i;
            }
        }
        return gcd;
    }
}