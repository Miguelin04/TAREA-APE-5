//suma de dos numeros
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();
        suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }
}