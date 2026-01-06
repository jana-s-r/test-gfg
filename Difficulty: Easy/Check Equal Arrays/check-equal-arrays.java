class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        boolean bl= true;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            
            for(int j=0;j<b.length;j++){
                if(a[i]!=b[i]) {
                    bl = false;
                    break;
                }
            }
        }
        return bl;
    }
}