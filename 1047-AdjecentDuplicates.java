// Using StringBuilder
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int index = 1; index < sb.length(); ){
            if(sb.charAt(index) == sb.charAt(index - 1)){
                sb.deleteCharAt(index);
                sb.deleteCharAt(index - 1);
                index = (index - 2 <= 0) ? 1 : (index - 2);
            }
            else
                index++;
        }
        return sb.toString();
    }
}

// Using Stack
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> result = new Stack<>();
        result.push(s.charAt(0));
        for(int index = 1; index < s.length(); index++){
            if(result.size() != 0 && (result.lastElement() == s.charAt(index)))
                result.pop();
            else
                result.push(s.charAt(index));
        }
        StringBuilder sb = new StringBuilder();
        for(Character c: result)
            sb.append(c);
        return sb.toString();
    }
}
