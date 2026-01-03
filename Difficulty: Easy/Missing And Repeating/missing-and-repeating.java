class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
      
        
        for(int n:arr){
            if(!set.add(n)){
                res.add(n);
            }
        }
        
        
        for(int i=1;i<=arr.length;i++){
            if(!set.contains(i)) {
                res.add(i);
            }
        }
        
        return res;
    }
}
