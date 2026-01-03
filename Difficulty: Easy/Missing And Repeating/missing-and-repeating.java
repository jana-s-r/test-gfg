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
        
        Arrays.sort(arr);
        
        for(int i=1;i<=arr.length;i++){
            if(!set.contains(i)) {
                res.add(i);
            }
        }
        
        //     for(int k=1;k<=arr.length;k++){
        //         boolean b =false;
        //         for(int i=0;i<arr.length;i++){
        //             if(k==arr[i]) {
        //                 b=true;
        //                 break;
        //             }
        //         }
        
        // if(!b){
        //     res.add(k);
        // }
        // }
        return res;
    }
}
