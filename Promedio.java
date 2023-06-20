public class Promedio {
    public double calcularPromedio(double[] numeros) {
        double suma = 0;

        for (double numero : numeros) {
            suma += numero;
        }

        return suma / numeros.length;
    }
}
