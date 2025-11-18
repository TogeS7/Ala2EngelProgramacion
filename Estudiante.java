public class Estudiante extends Persona implements MiembroUniversidad {
    private String carrera;
    private ListaEnlazada materias;

    public Estudiante(String nombre, String apellido, int edad, String documento,
                      String carrera) {
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;
        this.materias = new ListaEnlazada();
    }

    public void agregarMateria(Materia m) {
        materias.agregar(m);
    }

    // obtiene el promedio general (usa recursivo del TP)
    public double getPromedio() {
        return calcularPromedioRecursivo();
    }

    // promedio iterativo
    public double calcularPromedioIterativo() {
        Nodo n = materias.getPrimero();
        if (n == null) return 0;

        double suma = 0;
        int count = 0;

        while (n != null) {
            suma += ((Materia)n.dato).getNota();
            count++;
            n = n.siguiente;
        }
        return suma / count;
    }

    // promedio recursivo
    public double calcularPromedioRecursivo() {
        return calcRec(materias.getPrimero(), 0, 0);
    }

    private double calcRec(Nodo actual, int cant, double suma) {
        if (actual == null) {
            return cant == 0 ? 0 : suma / cant;
        }
        Materia m = (Materia) actual.dato;
        return calcRec(actual.siguiente, cant + 1, suma + m.getNota());
    }

    @Override
    public String obtenerRol() {
        return "Estudiante";
    }

    @Override
    public String obtenerInformacionCompleta() {
        return toString() + " - Carrera: " + carrera;
    }

    @Override
    public String toString() {
        return "Estudiante: " + super.toString();
    }

    public String getCarrera() { return carrera; }
}
