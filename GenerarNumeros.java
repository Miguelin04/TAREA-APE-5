import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class GenerarNumeros {
    public List<Integer> generarNumerosAleatorios(int cantidad) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            numeros.add(numero);
        }

        return numeros;
    }
}
