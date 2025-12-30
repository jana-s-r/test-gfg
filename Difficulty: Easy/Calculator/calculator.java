class Solution {
    public void calculate(int a, int b, int operator) {
        // code here
        int res = 0;
        switch(operator) {
            case 1:
                res = a+b;
                break;
            case 2:
                res = a-b;
                break;
            case 3:
                res = a*b;
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println(res);
    }
}
