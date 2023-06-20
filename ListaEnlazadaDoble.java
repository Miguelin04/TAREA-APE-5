 class ListaEnlazadaDoble {
        private Nodo cabeza;

        public ListaEnlazadaDoble() {
            this.cabeza = null;
        }

        public void agregar(int valor) {
            Nodo nuevoNodo = new Nodo(valor);

            if (cabeza == null) {
                cabeza = nuevoNodo;
            } else {
                Nodo nodoActual = cabeza;
                while (nodoActual.getSiguiente() != null) {
                    nodoActual = nodoActual.getSiguiente();
                }
                nodoActual.setSiguiente(nuevoNodo);
                nuevoNodo.setAnterior(nodoActual);
            }
        }

        public void editar(int posicion, int nuevoValor) {
            Nodo nodoActual = cabeza;
            int indice = 0;
            while (nodoActual != null && indice < posicion) {
                nodoActual = nodoActual.getSiguiente();
                indice++;
            }
            if (nodoActual != null) {
                nodoActual.setValor(nuevoValor);
            } else {
                System.out.println("La posición especificada no existe en la lista.");
            }
        }

        public void eliminar(int valor) {
            if (cabeza == null) {
                System.out.println("La lista está vacía.");
                return;
            }

            if (cabeza.getValor() == valor) {
                cabeza = cabeza.getSiguiente();
                if (cabeza != null) {
                    cabeza.setAnterior(null);
                }
                return;
            }

            Nodo nodoActual = cabeza;
            while (nodoActual != null) {
                if (nodoActual.getValor() == valor) {
                    Nodo nodoAnterior = nodoActual.getAnterior();
                    Nodo nodoSiguiente = nodoActual.getSiguiente();

                    if (nodoAnterior != null) {
                        nodoAnterior.setSiguiente(nodoSiguiente);
                    }
                    if (nodoSiguiente != null) {
                        nodoSiguiente.setAnterior(nodoAnterior);
                    }
                    return;
                }
                nodoActual = nodoActual.getSiguiente();
            }

            System.out.println("El valor especificado no existe en la lista.");
        }

        public void imprimirLista() {
            Nodo nodoActual = cabeza;
            while (nodoActual != null) {
                System.out.print(nodoActual.getValor() + " ");
                nodoActual = nodoActual.getSiguiente();
            }
            System.out.println();
        }
}
