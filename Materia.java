public class Materia {
    private String nombre;
    private double nota;
    private Profesor profesor;

    public Materia(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() { return nombre; }
    public double getNota() { return nota; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor profesor) { this.profesor = profesor; }

    @Override
    public String toString() {
        return nombre + " (" + nota + ")";
    }
}
