import java.util.Scanner;
import java.util.Random;

public class AppArrayAlumnos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Introduce el número de alumnos: ");
        int n = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        AlumnoG[] alumnos = new AlumnoG[n];

        // Crear alumnos y calcular media individual
        for (int i = 0; i < n; i++) {
            System.out.println("\nAlumno " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Teléfono: ");
            String telefono = sc.nextLine();

            AlumnoG a = new AlumnoG(nombre, telefono);
            a.calcularMedia();
            alumnos[i] = a;
        }

        // Calcular media del grupo
        double sumaMedias = 0;
        double mayorNota = -1;
        String alumnoMayorNota = "";
        for (AlumnoG a : alumnos) {
            sumaMedias += a.media;

            // Comprobar mayor nota individual
            int[] notas = {a.nota1, a.nota2, a.nota3};
            for (int nota : notas) {
                if (nota > mayorNota) {
                    mayorNota = nota;
                    alumnoMayorNota = a.nombre;
                }
            }
        }

        double mediaGrupo = sumaMedias / n;
        System.out.println("\nMedia del grupo: " + mediaGrupo);

        System.out.println("\nAlumnos con media superior a la del grupo:");
        for (AlumnoG a : alumnos) {
            if (a.media > mediaGrupo) {
                System.out.println(a.nombre + " - Media: " + a.media);
            }
        }

        System.out.println("\nAlumno con mayor nota: " + alumnoMayorNota + " (Nota: " + mayorNota + ")");
        sc.close();
    }
}
