package dsa;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String str){
        if(str == null || str.isEmpty())
            return false;
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='['|| c=='{' || c=='<' ||c =='(')
                stack.push(c);
            else {
                if(c==']'|| c=='}' || c=='>' ||c ==')') {
                    if (stack.isEmpty())
                        return false;
                    char current = stack.peek();
                    if(c==']' && current !='[' || c==')' && current != '(' || c=='>' && current != '<' || c=='}' && current != '{')
                        return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
