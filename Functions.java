import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int sum = addNumbers(num1, num2);
        System.out.println("The sum is: " + sum);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}

