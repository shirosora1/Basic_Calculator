public class Calculation {

    public static void addition(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    }

    public static void subtraction(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
    }

    public static void multiplication(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
    }

    public static void division(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
    }

    public static void sqrRoot(int firstNumber) {
        double result = Math.sqrt(firstNumber);

        System.out.println("The square root of " + firstNumber + " is " + (int) result);
    }
}