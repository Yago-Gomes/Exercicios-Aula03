import java.util.Scanner;

/**
 * @author Yago
 * @version 1.0
 * @since 04/03/21 03:18 AM
 * @category View
 */
public class Main {
    
        int number;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para descobrir se ele é positivo ou negativo!");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("O numero " + number + " é negativo!");
        } else {
            System.out.println("O numero " + number + " é positivo!");
        }
    }
}
