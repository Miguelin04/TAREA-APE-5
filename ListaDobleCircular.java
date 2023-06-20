class ListaDobleCircular {
    private Nodo cabeza;

    public ListaDobleCircular() {
        this.cabeza = null;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.setSiguiente(cabeza);
            cabeza.setAnterior(cabeza);
        } else {
            Nodo ultimo = cabeza.getAnterior();
            nuevoNodo.setSiguiente(cabeza);
            nuevoNodo.setAnterior(ultimo);
            cabeza.setAnterior(nuevoNodo);
            ultimo.setSiguiente(nuevoNodo);
        }
    }

    public void quitar(int valor) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        boolean encontrado = false;

        do {
            if (actual.getValor() == valor) {
                encontrado = true;
                break;
            }
            actual = actual.getSiguiente();
        } while (actual != cabeza);

        if (!encontrado) {
            System.out.println("El valor especificado no existe en la lista.");
            return;
        }

        Nodo anterior = actual.getAnterior();
        Nodo siguiente = actual.getSiguiente();

        anterior.setSiguiente(siguiente);
        siguiente.setAnterior(anterior);

        if (actual == cabeza) {
            cabeza = siguiente;
        }

        actual.setSiguiente(null);
        actual.setAnterior(null);
    }

    public void insercion(int posicion, int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (cabeza == null) {
            if (posicion == 0) {
                cabeza = nuevoNodo;
                cabeza.setSiguiente(cabeza);
                cabeza.setAnterior(cabeza);
            } else {
                System.out.println("La posición especificada no existe en la lista.");
            }
            return;
        }

        if (posicion == 0) {
            Nodo ultimo = cabeza.getAnterior();
            nuevoNodo.setSiguiente(cabeza);
            nuevoNodo.setAnterior(ultimo);
            cabeza.setAnterior(nuevoNodo);
            ultimo.setSiguiente(nuevoNodo);
            cabeza = nuevoNodo;
            return;
        }

        int contador = 0;
        Nodo actual = cabeza;

        while (contador < posicion && actual.getSiguiente() != cabeza) {
            actual = actual.getSiguiente();
            contador++;
        }

        if (contador == posicion) {
            Nodo anterior = actual.getAnterior();
            nuevoNodo.setSiguiente(actual);
            nuevoNodo.setAnterior(anterior);
            anterior.setSiguiente(nuevoNodo);
            actual.setAnterior(nuevoNodo);
        } else {
            System.out.println("La posición especificada no existe en la lista.");
        }
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

        System.out.println();
    }
}
