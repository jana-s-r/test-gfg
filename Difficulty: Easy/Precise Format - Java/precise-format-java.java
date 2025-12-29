class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        
        ArrayList<Float> result = new ArrayList<>();
        
        result.add(a/b);
        result.add(Float.parseFloat(String.format("%.3f",a/b)));
        
        return result;
    }
}