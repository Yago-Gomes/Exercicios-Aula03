import java.util.Scanner;

/**
 * @author Yago
 * @version 1.0
 * @since 04/03/21 03:40 AM
 * @category View
 */
public class Main {

    double number1, number2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero real");
        double number1 = scanner.nextDouble();

        System.out.println("Digite outro numero real");
        double number2 = scanner.nextDouble();

        if (number1 == number2) {
            System.out.println("O numero " + number1 + " é igual ao " + number2 + "!");
        } else if (number1 > number2){
            System.out.println("O numero " + number1 + " é maior que o " + number2 + "!");
        } else {
            System.out.println("O numero " + number1 + " é menor que o " + number2 + "!");
        }
    }
}
