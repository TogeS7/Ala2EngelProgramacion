public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad();

        Profesor prof1 = new Profesor("Ana", "Gomez", 45, "30000000", "Matematica", 20);
        Estudiante est1 = new Estudiante("Juan", "Perez", 20, "45000000", "Sistemas");
        Estudiante est2 = new Estudiante("Maria", "Lopez", 22, "46000000", "Sistemas");
        Personal per1 = new Personal("Carlos", "Martinez", 40, "32000000", "Administracion", "Secretario", "2018-05-10");

        uni.agregarMiembro(prof1);
        uni.agregarMiembro(est1);
        uni.agregarMiembro(est2);
        uni.agregarMiembro(per1);

        System.out.println("=== Miembros de la universidad ===");
        uni.listarMiembros();

        System.out.println("\n=== Ordenados por apellido ===");
        uni.ordenarPorApellido();
        uni.listarMiembros();

        System.out.println("\n=== Estudiantes en Sistemas ===");
        int cant = Universidad.contarEstudiantesRecursivo(uni.getPrimerMiembro(), "Sistemas");
        System.out.println("Cantidad: " + cant);
    }
}
