public class ReverseInteger {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(-10));    
    }
}

class Solution {
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE){
            return 0;
        }

        boolean isNegative = false;
        if(x<0){
            isNegative = true;
            x = -1 * x;
        }
        
        int reverseNumber = 0;
        
        while(x!=0){
            int d = x%10;
            
            if(reverseNumber > (Integer.MAX_VALUE/10)){
                return 0;
            }

            if(reverseNumber == (Integer.MAX_VALUE/10)){
                if(isNegative){
                    if(d>8){
                        return 0;
                    }
                }
                else if(d>7){
                    return 0;
                }
            }

            reverseNumber = reverseNumber*10 + d;
            x = x/10;
        }
        
        if(isNegative){
            reverseNumber = -1 * reverseNumber;
        }
        
        return reverseNumber;
    }
}

//Approach:
// int can store Integer.MAX_VALUE and negative Integer.MAX_VALUE + 1 i.e. Integer.MIN_VALUE
// so if we reverse an integer it's value should be less Integer.MAX_VALUE. or +1
// Simplicity we deal entirely with positive numbers so first step is to convert negative number if any to positive
// In the above all inputs are integer so their both positive and negative storable except the Integer.MIN_VALUE, if that's the case we return 0;
// To reverse an integer we extract the digit d using x%10 then x/10 until x==0.
// Then we add the extracted digit this way reverseNumber = reverse*10 + d
// Since we are going to multiply reverseNumber by 10, for this value to be able to storable in int, it should already be less than (Integer.MAX_VALUE/10) so that when it gets multiplied by 10 it will be less than (Integer.MAX_VALUE)
// If reverseNumber is already  more than (Integer.MAX_VALUE/10) then we return 0
// If reverseNumber is equal to (Integer.MAX_VALUE/10) then for positive number we check whether d>7, if yes then again it won't be storable in int so we return 0;
// For negative number also same just that we have buffer of 1 so we check d>8.
// if the reverse number passes all the ifs then for positive number we return directly the reverse number but for negative number we return -1*reverseNumber

