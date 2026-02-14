public class Assignment2 {
    public static void main(String args[]) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        long sum = firstNumber + secondNumber;
        long subs = firstNumber - secondNumber;
        long mult = (long) firstNumber * secondNumber;
        double division = 0;
        int remainder = 0;

        if (secondNumber != 0) {
            division = (double) firstNumber / secondNumber;
            remainder = firstNumber % secondNumber;
        } else {
            System.out.println("No division by zero");
        }

        System.out.println("Sum is " + sum);
        System.out.println("Subtraction is " + subs);
        System.out.println("Multiplication is " + mult);

        if (secondNumber != 0) {
            System.out.println("Division is " + division);
            System.out.println("Remainder is " + remainder);
        }
    }
}
