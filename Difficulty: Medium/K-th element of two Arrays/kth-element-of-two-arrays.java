class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int res=0;
        int n=a.length+b.length;
     
        int ind=0;
        
        int[] ra=new int[n];
        
        for(int i=0;i<a.length;i++){
            ra[ind++]=a[i];
        }
        
        for(int j=0;j<b.length;j++){
            ra[ind++]=b[j];
        }
        
        Arrays.sort(ra);    
        
        res = ra[k-1];
        
        return res; 
    }
}