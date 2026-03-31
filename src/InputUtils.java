import java.util.Scanner;

public class InputUtils {

    public static String readString(Scanner sc, String msg) {
        String input;
        do {
            System.out.println(msg);
            input = sc.nextLine().trim();
            if (input.isBlank()) {
                System.out.println("Entrada inválida!");
            }
        } while (input.isBlank());
        return input;
    }

    public static int readInt(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.println(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro válido!");
            }
        }
    }

    public static double readDouble(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.println(msg);
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido!");
            }
        }
    }
}