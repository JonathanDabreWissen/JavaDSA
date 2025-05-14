public class IsPallindrome {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.isPalindrome("Marge, let's \"[went].\" I await {news} telegram.")); //m =8
    }
}


class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
    
        int i = 0; 
        int j = s.length()-1;
        while(i<j){

            if(!((s.charAt(i)>= 'a' && s.charAt(i) <= 'z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))){
                i++;
                continue;
            }

            if(!((s.charAt(j)>= 'a' && s.charAt(j) <= 'z') || (s.charAt(j)>='0' && s.charAt(j)<='9'))){
                j--;
                continue;
            }

            if(s.charAt(i) != s.charAt(j) ){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}

//Approach
//First initially convert all uppercase to lowercase
//Iterate over the string
//Skip the character if its not alphabhet or number
//First check character pointed by i, if its alphabhet or number check for match, if not do i++ & move to next iteration, same with character pointed by j.
//if match continue with next iteration
//if not return false
//If reached the end of loop i.e when i>j, then return true.
