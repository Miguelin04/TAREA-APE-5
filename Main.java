import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            if (esPar(numero)) {
                System.out.println("El número ingresado es par.");
            } else {
                System.out.println("El número ingresado es impar.");
            }
        }
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
