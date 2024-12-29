package gr.aueb.cf.calc;

public class Main {

    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) throws ArithmeticException {
        try {
            return a / b;
        } catch (ArithmeticException ex) {
            System.err.println("Error. Denominator must not be zero");
            throw ex;
        }
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
