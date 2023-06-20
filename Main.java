import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int cantidadNumeros = 10; // Cantidad de números a generar

        GenerarNumeros generador = new GenerarNumeros();
        List<Integer> numeros = generador.generarNumerosAleatorios(cantidadNumeros);

        System.out.println("Números generados: " + numeros);

        VerificadorPar verificador = new VerificadorPar();
        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (verificador.esPar(numero)) {
                System.out.println(numero);
            }
        }
    }
}
