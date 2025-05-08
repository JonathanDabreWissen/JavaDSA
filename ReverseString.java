import java.util.ArrayList;

public class ReverseString {
    public static void main(String[] args) {
        Solution s = new Solution();
        // char charArray[] = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        char charArray[] = {'A',' ','m','a','n',',',' ','a',' ','p','l'};
        s.reverseString(charArray);
    }
}

class Solution {
    public void reverseString(char[] s) {
        int m = s.length/2;
        int j = s.length -1;

        for( int i = 0; i<m; i++){
            System.out.println("Swapping positions " + i +" & " +j);
            char t = s[j];
            s[j] = s[i];
            s[i] = t;
            j--;
        }
    }    
}

//Approach
// Two pointer appraoch, just swap one one elements from  both ends till the center.
