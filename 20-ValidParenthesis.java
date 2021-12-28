class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<>();
        for(int index = 0; index < s.length(); index++){
            char type = s.charAt(index);
            switch(type){
                case '(': bracketStack.push(type);
                    break;
                case '{': bracketStack.push(type);
                    break;
                case '[': bracketStack.push(type);
                    break;
                case ')': 
                    if(bracketStack.size() != 0 && bracketStack.lastElement() == '(')
                        bracketStack.pop();
                    else
                        bracketStack.push(type);
                    break;
                case '}':
                    if(bracketStack.size() != 0 && bracketStack.lastElement() == '{')
                        bracketStack.pop();
                    else
                        bracketStack.push(type);
                    break;
                case ']':
                    if(bracketStack.size() != 0 && bracketStack.lastElement() == '[')
                        bracketStack.pop();
                    else
                        bracketStack.push(type);
                    break;
            }
        }
        if(bracketStack.size() == 0)
            return true;
        return false;
    }
}
