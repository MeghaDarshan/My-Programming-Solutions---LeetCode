/* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.*/

class Solution {
    public boolean isValid(String s) {
        if(s.length()==1)return false;
        char[] res = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(res[i]=='(' || res[i]=='{' || res[i]=='['){
                stack.push(res[i]);
            }
            else if(res[i]==')'){
                if(stack.isEmpty())return false;
                if(stack.peek()=='('){stack.pop();}
                else{
                    return false;
                }
                
            }
            else if(res[i]=='}'){
               if(stack.isEmpty())return false;
                if(stack.peek()=='{'){stack.pop();}
                else{
                    return false;
                } 
            }
             else if(res[i]==']'){
               if(stack.isEmpty())return false;
                if(stack.peek()=='['){stack.pop();}
                else{
                    return false;
                } 
            }
            
        }
        if(stack.isEmpty()){
             return true;
        }
        else{
            return false;
        }
       
    }
}