package BasicArithmeticOperations;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        System.out.println("Test Data:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number:");
        int x = scanner.nextInt();
        
        System.out.println("Input second number:");
        int y = scanner.nextInt();

        int mal = x * y;
        System.out.println(x + " * " + y + " = " + mal);

        int div = x / y;
        System.out.println(x + " / " + y + " = " + div);

        int rest = x % y;
        System.out.println(x + " % " + y + " = " + rest);

        int add = x + y;
        System.out.println(x + " + " + y + " = " + add);

        int min = x - y;
        System.out.println(x + " - " + y + " = " + min);
    }
}
