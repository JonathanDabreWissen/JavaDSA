public class SubtractProductAndSum {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.subtractProductAndSum(105));
    }
}

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while(n!=0){
            int d = n%10;
            sum = sum + d;
            product = product*d;

            n = n/10;
        }

        return (product - sum);

    }
}

//Approach:
// Extract digits from the number, the increment it to the sum and multiple it to the product
// To extract digits do n%10. Then for next digit first do n/10.
// Keep repeating the digit and doing the process until n==0;