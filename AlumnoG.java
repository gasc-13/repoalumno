import java.util.Random;
public class AlumnoG{
	String nombre;
	String telefono;
	int edad;
	int nota1;
	int nota2;
	int nota3;

	public AlumnoG(String nombre, String telefono, int edad){
		this.nombre=nombre;
		this.telefono=telefono;
		this.edad=edad;

		Random r = new Random();
		nota1=r.nextInt(11);
		nota2=r.nextInt(11);
		nota3=r.nextInt(11);
	}

	public void mostrarDatos(){
		System.out.println("Nombre: "+nombre);
		System.out.println("Telefono: "+telefono);
		System.out.println("Edad: "+edad);
		System.out.println("Notas: " +nota1+ ", " +nota2+ ", "+nota3);
}
}
