import java.util.Scanner;

public class Evaluator {

    public static void main(String[] args) {
        while (true) {
            Scanner read = new Scanner(System.in);
            System.out.println("\nInput your expression \n");
            System.out.println("Answer: " + evaluate(read.nextLine()));
        }
    }

    public static float evaluate(String expression) {
        CustomStack<Float> valueStack = new CustomStack<Float>();
        CustomStack<Operator> operatorStack = new CustomStack<Operator>();

        String[] components = expression.split(" ");
        for (String component : components) {
            if (isNumber(component)) {
                valueStack.push(Float.parseFloat(component));
            } else if (Operator.isOperator(component)) {
                operatorStack.push(new Operator(component));
            } else if (component.equals(")")) {
                Operator currentOperator = operatorStack.pop();
                float[] values = {valueStack.pop(), valueStack.pop()};
                valueStack.push(currentOperator.operation(values));
            } else if (!component.equals("(")) {
                System.out.println("Invalid format. Example of a valid input: ( ( 5 + 7 ) * 8 )");
                System.out.println("Invalid component: " + component);
                return -1;
            }
        }

        return valueStack.pop();
    }

    private static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
