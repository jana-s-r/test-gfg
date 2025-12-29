class Solution {
    public int[] computeOperations(int x, int y) {
        // code here
     
    int p = x + y;
    int q = x - y;
    int r = x * y;
    int s = x / y;
    int t = x % y;
    
    int[] result = new int[]{p,q,r,s,t};
    
    return result;
        
    }
}
