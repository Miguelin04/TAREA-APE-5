import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor a agregar: ");
        String valoresAgregar = scanner.nextLine().trim();
        String[] valores = valoresAgregar.split(" ");
        for (String valor : valores) {
            lista.agregar(Integer.parseInt(valor));
        }

        System.out.print("Ingrese el valor a eliminar: ");
        int valorEliminar = Integer.parseInt(scanner.nextLine().trim());
        lista.eliminar(valorEliminar);

        System.out.print("Ingrese la posición: ");
        int posicion = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Ingrese el valor a insertar: ");
        int valorInsertar = Integer.parseInt(scanner.nextLine().trim());
        lista.insertar(posicion, valorInsertar);

        System.out.println("Lista actual:");
        lista.imprimirLista();
    }
}