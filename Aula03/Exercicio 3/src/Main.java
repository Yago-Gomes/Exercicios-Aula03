import java.util.Scanner;

/**
 * @author Yago
 * @version 1.0
 * @since 04/03/21 03:30 AM
 * @category View
 */
public class Main {

    int number;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para descobrir se ele é par ou impar!");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("O numero " + number + " é par!");
        } else {
            System.out.println("O numero " + number + " é impar!");
        }
    }
}
