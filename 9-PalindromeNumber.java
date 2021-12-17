// Method 1:
// Convert to a string --> char array --> reverse check

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;    // Two edge cases checked - 1. Negative numbers 2. Multiples of 10.
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        for(int startIndex = 0, endIndex = chars.length - 1; startIndex < chars.length / 2;                     startIndex++, endIndex--){
            if(chars[startIndex] != chars[endIndex])
                return false;
        }
        return true;
}
  
// Method 2:
// Check from start and end without converting to a string

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        int oldNumber = x;
        int newNumber = 0;
        while(oldNumber > newNumber){                         // As and when oldNumber < newNumber, we have reached half the integer value.
            int temp = oldNumber % 10;
            newNumber = newNumber * 10 + temp;
            oldNumber = oldNumber / 10;
        }
        if(oldNumber == newNumber || ((newNumber / 10) == oldNumber))   // To check for palindromes with odd length, central value should be discarded to check equality.
            return true;
        
        else
            return false;
    }
}
