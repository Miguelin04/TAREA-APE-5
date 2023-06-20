import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingrese la longitud del tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();

        CalcularArea triangulo = new CalcularArea(lado1, lado2, lado3);
        double area = triangulo.calcularArea();

        String areaFormateada = String.format("%.2f", area);

        System.out.println("El área del triángulo es: " + areaFormateada);
    }
}
