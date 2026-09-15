public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("20261001", "Mateo", 4.0, 3.5, 4.5);

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Estudiante: " + student.getName());
        System.out.println("Notas: " + student.getGrade1() + " | " + student.getGrade2() + " | " + student.getGrade3());
        System.out.println("Promedio inicial: " + String.format("%.2f", student.getAverage()));

        System.out.println("\n--- PRUEBA 1: Cambiar Nombre A Válido ---");
        if (student.setName("Mateo Piedrahíta")) {
            System.out.println("Nombre actualizado a: " + student.getName());
        } else {
            System.out.println("Nombre rechazado.");
        }

        System.out.println("\n--- PRUEBA 2: Cambiar Nota 1 A Válida (5.0) ---");
        if (student.setGrade1(5.0)) {
            System.out.println("Nota 1 actualizada exitosamente.");
        } else {
            System.out.println("Nota 1 rechazada.");
        }
        System.out.println("Nuevo promedio: " + String.format("%.2f", student.getAverage()));

        System.out.println("\n--- PRUEBA 3: Cambiar Nota 2 A Inválida (6.0) ---");
        if (student.setGrade2(6.0)) {
            System.out.println("Nota 2 actualizada.");
        } else {
            System.out.println("Nota 2 RECHAZADA (Debe estar entre 0.0 y 5.0).");
        }
        System.out.println("Promedio tras fallo: " + String.format("%.2f", student.getAverage()));
    }
}