public class Universidad {
    private ListaEnlazada miembros;

    public Universidad() {
        miembros = new ListaEnlazada();
    }

    public void agregarMiembro(MiembroUniversidad m) {
        miembros.agregar(m);
    }

    public void listarMiembros() {
        Nodo n = miembros.getPrimero();
        while (n != null) {
            System.out.println(((MiembroUniversidad)n.dato).obtenerInformacionCompleta());
            n = n.siguiente;
        }
    }

    // contar estudiantes recursivo
    public static int contarEstudiantesRecursivo(Nodo actual, String carrera) {
        if (actual == null) return 0;

        MiembroUniversidad m = (MiembroUniversidad) actual.dato;
        int suma = 0;

        if (m instanceof Estudiante) {
            Estudiante e = (Estudiante) m;
            if (e.getCarrera().equalsIgnoreCase(carrera)) suma = 1;
        }

        return suma + contarEstudiantesRecursivo(actual.siguiente, carrera);
    }

    // ordenar (lista → array → ordenar → lista)
    public void ordenarPorApellido() {
        Object[] arr = miembros.convertirAArray();

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                Persona p1 = (Persona) arr[j];
                Persona p2 = (Persona) arr[min];
                if (p1.getApellido().compareToIgnoreCase(p2.getApellido()) < 0) {
                    min = j;
                }
            }
            Object tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }

        miembros = ListaEnlazada.convertirArrayALista(arr);
    }

    //  getter simple para poder usar contarEstudiantesRecursivo desde el main
    public Nodo getPrimerMiembro() {
        return miembros.getPrimero();
    }
}
