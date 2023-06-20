import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        double[] numeros = new double[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        Promedio calculadora = new Promedio();
        double promedio = calculadora.calcularPromedio(numeros);

        System.out.println("El promedio es: " + promedio);
    }
}