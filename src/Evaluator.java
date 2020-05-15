import java.util.Scanner;

public class Evaluator {

    public static void main(String[] args) {
        while (true) {
            Scanner read = new Scanner(System.in);
            System.out.println("\nInput your expression");
            System.out.println("Answer: " + evaluate(read.next()));
        }
    }

    public static double evaluate(String expression) {
        System.out.println("Your expression: " + expression);
        return 0;
    }

}
