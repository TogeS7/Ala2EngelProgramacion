public class Profesor extends Persona implements MiembroUniversidad {
    private String especialidad;
    private int aniosExperiencia;
    private ListaEnlazada materiasAsignadas;

    public Profesor(String nombre, String apellido, int edad, String documento,
                    String especialidad, int aniosExperiencia) {
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.materiasAsignadas = new ListaEnlazada();
    }

    public void asignarMateria(Materia m) {
        materiasAsignadas.agregar(m);
    }

    @Override
    public String obtenerRol() {
        return "Profesor";
    }

    @Override
    public String obtenerInformacionCompleta() {
        return toString() + " - Esp: " + especialidad +
               " - Exp: " + aniosExperiencia + " años";
    }

    @Override
    public String toString() {
        return "Profesor: " + super.toString();
    }
}
