class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void eliminar(int valor) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.getValor() == valor) {
            cabeza = cabeza.getSiguiente();
            return;
        }

        Nodo actual = cabeza;
        Nodo anterior = null;
        while (actual != null && actual.getValor() != valor) {
            anterior = actual;
            actual = actual.getSiguiente();
        }

        if (actual == null) {
            System.out.println("El valor especificado no existe en la lista.");
            return;
        }

        anterior.setSiguiente(actual.getSiguiente());
    }

    public void insertar(int posicion, int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (posicion == 0) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
            return;
        }

        int contador = 0;
        Nodo actual = cabeza;
        Nodo anterior = null;
        while (actual != null && contador < posicion) {
            anterior = actual;
            actual = actual.getSiguiente();
            contador++;
        }

        if (contador != posicion) {
            System.out.println("La posición especificada no existe en la lista.");
            return;
        }

        anterior.setSiguiente(nuevoNodo);
        nuevoNodo.setSiguiente(actual);
    }

    public void imprimirLista() {
        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
}
