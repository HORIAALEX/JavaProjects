import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Lab2_3 {
    public static void main(String[] args) {
        char[] chars = {'[', '(', ')', ']','{','}'};
        if(BalancedBracket(chars))
        {
            System.out.println("Balanced");
        } else
        {
            System.out.println("Not Balanced");
        }
    }
    public static boolean BalancedBracket(char[] characters) {
        Stack<Character> stack = new Stack<>();

        for(char c : characters) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if(c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !MatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    private static boolean MatchingPair(char open, char close)
    {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }


}