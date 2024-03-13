package dsa;

import java.util.Stack;

public class StackDs {

    public String reverse(String str) {
        if (str == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray())
            stack.push(c);

        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public boolean regularExpression(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (isLeftt(c))
                stack.push(c);

            if (isRight(c)) {
                if (stack.isEmpty())
                    return false;
                var top = stack.pop();
                if (bracketMatch(top, c))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isRight(char c) {
        return (c == '}' || c == ')' || c == ']' || c == '>');
    }

    private boolean isLeftt(char c) {
        return (c == '{' || c == '(' || c == '[' || c == '<');
    }

    private boolean bracketMatch(char left, char right) {
        return (right == ')' && left != '(') || (right == ']' && left != '[') || (right == '>' && left != '<')
                || (right == '}' && left != '{');
    }
}