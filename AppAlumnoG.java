import java.util.Scanner;
import java.util.Random;

public class AppAlumnoG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del alumno: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce el teléfono: ");
        String telefono = sc.nextLine();


        AlumnoG alumno = new AlumnoG(nombre, telefono);
	
	alumno.calcularMedia();
        alumno.mostrarDatos();

        sc.close();
    }
}
