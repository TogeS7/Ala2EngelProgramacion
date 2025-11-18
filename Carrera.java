import java.util.ArrayList;

public class Carrera {
    private String nombreCarrera;
    private ArrayList<Estudiante> estudiantes;

    public Carrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " " + e.getApellido());
        }
    }

    public double promedioGeneral() {
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getPromedio();
        }
        return suma / estudiantes.size();
    }
}