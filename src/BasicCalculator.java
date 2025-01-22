import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Please enter the first number:");
            int firstNumber = scanner.nextInt();

            System.out.println("Please enter the second number:");
            int secondNumber = scanner.nextInt();

            System.out.println("What do you want to do? (x), (+), (-), (/) or (sqr)?");
            scanner.nextLine();
            String action = scanner.nextLine();

            if (secondNumber == 0 && action.contains("/")) {
                System.out.println("Can't divide by 0");
                continue;
            }

                switch (action) {
                    case "x":
                        Calculation.multiplication(firstNumber, secondNumber);
                        break;
                    case "+":
                        Calculation.addition(firstNumber, secondNumber);
                        break;
                    case "-":
                        Calculation.subtraction(firstNumber, secondNumber);
                        break;
                    case "/":
                        Calculation.division(firstNumber, secondNumber);
                        break;
                    case "sqr":
                        Calculation.sqrRoot(firstNumber);
                        break;
                    default:
                        System.out.println("Please enter a valid operator: x, +, - or /");
                        break;
                }

            System.out.println(" ");
            System.out.println("Would you like to make another calculation?");
            String choice = scanner.nextLine();

            if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}