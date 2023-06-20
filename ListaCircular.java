class ListaCircular {
    private Nodo cabeza;

    public ListaCircular() {
        this.cabeza = null;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.setSiguiente(cabeza);
        } else {
            Nodo ultimo = cabeza;
            while (ultimo.getSiguiente() != cabeza) {
                ultimo = ultimo.getSiguiente();
            }
            nuevoNodo.setSiguiente(cabeza);
            ultimo.setSiguiente(nuevoNodo);
        }
    }

    public void eliminar(int valor) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.getValor() == valor) {
            Nodo ultimo = cabeza;
            while (ultimo.getSiguiente() != cabeza) {
                ultimo = ultimo.getSiguiente();
            }
            if (cabeza == cabeza.getSiguiente()) {
                cabeza = null;
            } else {
                cabeza = cabeza.getSiguiente();
                ultimo.setSiguiente(cabeza);
            }
            return;
        }

        Nodo actual = cabeza;
        Nodo anterior = null;
        do {
            anterior = actual;
            actual = actual.getSiguiente();
            if (actual.getValor() == valor) {
                anterior.setSiguiente(actual.getSiguiente());
                return;
            }
        } while (actual != cabeza);

        System.out.println("El valor especificado no existe en la lista.");
    }

    public void insertar(int posicion, int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (cabeza == null) {
            if (posicion == 0) {
                cabeza = nuevoNodo;
                nuevoNodo.setSiguiente(cabeza);
            } else {
                System.out.println("La posición especificada no existe en la lista.");
            }
            return;
        }

        if (posicion == 0) {
            Nodo ultimo = cabeza;
            while (ultimo.getSiguiente() != cabeza) {
                ultimo = ultimo.getSiguiente();
            }
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
            ultimo.setSiguiente(cabeza);
            return;
        }

        int contador = 0;
        Nodo actual = cabeza;
        Nodo anterior = null;
        do {
            anterior = actual;
            actual = actual.getSiguiente();
            contador++;
            if (contador == posicion) {
                nuevoNodo.setSiguiente(actual);
                anterior.setSiguiente(nuevoNodo);
                return;
            }
        } while (actual != cabeza);

        System.out.println("La posición especificada no existe en la lista.");
    }

    public void imprimirLista() {
        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSiguiente();
        } while (actual != cabeza);

        System.out.print(actual.getValor() + " ... ");
        System.out.println();
        System.out.println("El último valor está conectado al primero.");
    }
}