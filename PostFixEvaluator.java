import java.util.Queue;
import java.util.Stack;

//This class is responsible for calculating a double value from a postfix expression
public class PostFixEvaluator {

    public static double evaluatePostFix(Queue<Token> tokens) {
        Stack<Token> stack = new Stack<Token>();
        Token token = new Token();

        while(!tokens.isEmpty()) {
            token = tokens.remove();
            if (token.isNumber()) {
                stack.push(token);
            } else if (token.isOperator()) {
                double second = stack.pop().getNumber();
                double first = stack.pop().getNumber();
                Token result = new Token(evaluate(token.getOperator(), first, second));
                stack.push(result);
            }
        }
        return stack.pop().getNumber();
    }

    public static double evaluate(String operator, double first, double second) {
        double result = 0.0;
        char op = operator.charAt(0);

        switch (op) {
            case '^': 
                result = Math.pow(first, second);
                break;
            case '%':
                result = first % second;
                break;
            case '*':
                result = first * second;
                break;
            case 'x':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '÷':
                result = first / second;
                break;
            case '+':
                result = first + second;
                break;
            case '-': 
                result = first - second; 
                break;
        }
        return result;
    }
}



