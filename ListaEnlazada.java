public class ListaEnlazada {
    private Nodo primero;

    public ListaEnlazada() {
        primero = null;
    }

    // agrega al final
    public void agregar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = nuevo;
            return;
        }
        Nodo actual = primero;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    // devuelve primer nodo
    public Nodo getPrimero() {
        return primero;
    }

    // convierte a array
    public Object[] convertirAArray() {
        int tamaño = 0;
        Nodo actual = primero;
        while (actual != null) {
            tamaño++;
            actual = actual.siguiente;
        }

        Object[] arr = new Object[tamaño];
        actual = primero;
        int i = 0;

        while (actual != null) {
            arr[i++] = actual.dato;
            actual = actual.siguiente;
        }
        return arr;
    }

    // reconstruye lista desde array
    public static ListaEnlazada convertirArrayALista(Object[] arr) {
        ListaEnlazada lista = new ListaEnlazada();
        for (Object o : arr) lista.agregar(o);
        return lista;
    }
}
