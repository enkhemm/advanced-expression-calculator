import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//This class is responsible for converting an infix expression to a postfix expression.
public class ShuntingYard {

    public static Queue<Token> createPostFix(Queue<Token> inFix) {
        Queue<Token> postFix = new LinkedList<>();
        Stack<Token> stack = new Stack<>();
        Token token = new Token();

        while (!inFix.isEmpty()) {
            token = inFix.remove();
            if (token.isNumber()) {
                postFix.add(token);
            } else if (token.isOpenParen()){
                stack.push(token);
            } else if (token.isCloseParen()) {
                while (!stack.peek().isOpenParen()) {
                    Token oper = stack.pop();
                    postFix.add(oper);
                }
                stack.pop();
            } else if (token.isFunction()) {
                stack.push(token);
            } 
            else {
                if(!stack.isEmpty()) {
                    Token previous = stack.peek();
                    while(!canGoOnStack(token, previous)) { 
                        Token toOutput = stack.pop();
                        postFix.add(toOutput);
                        if(stack.isEmpty()) {
                            break;
                        }
                        previous = stack.peek();
                    }
                }
                stack.add(token);
            }
        } 
        while(!stack.isEmpty()) {
            postFix.add(stack.pop());
        }
        return postFix;
    }

    private static boolean canGoOnStack(Token current, Token previous) {
        return (getPrecedence(current) > getPrecedence(previous) || getPrecedence(current) == 3);
    }
    
    private static int getPrecedence(Token t) {
        char operator = t.getOperator().charAt(0);
        switch (operator) {
            case '^': 
                return 3;
            case '%':
                return 2;
            case '*':
                return 2;
            case 'x':
                return 2;
            case '/':
                return 2;
            case '÷':
                return 2;
            case '+':
                return 1;
            case '-':
                return 1;
            //The bracket
            default:
                return 0;
        }
    }
}