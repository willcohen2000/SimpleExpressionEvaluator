public class Operator {

    private String operator;

    public Operator(String operator) {
        this.operator = operator;
    }

    public float operation(float[] values) {
        switch (operator) {
            case "+":
                return (values[1] + values[0]);
            case "-":
                return (values[1] - values[0]);
            case "/":
                return (values[1] / values[0]);
            case "*":
                return (values[1] * values[0]);
            default:
                return 0;
        }
    }

    public static boolean isOperator(String str) {
        return (str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*"));
    }

}
