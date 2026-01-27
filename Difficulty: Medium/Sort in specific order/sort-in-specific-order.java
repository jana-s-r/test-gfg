class Solution {
    public void sortIt(int[] arr) {
        // code here
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for(int x:arr) {
            if(x%2==0){
                even.add(x);
            }else {
                odd.add(x);
            }
        }
        
        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);
        int i=0;
        for(int a:odd){
            arr[i++]=a;
        }
        
        for(int a:even){
            arr[i++]=a;
        }
    
    }
}
