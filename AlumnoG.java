import java.util.Random;
public class AlumnoG{
	String nombre;
	String telefono;
	int nota1;
	int nota2;
	int nota3;

	public AlumnoG(String nombre, String telefono){
		this.nombre=nombre;
		this.telefono=telefono;

		Random r = new Random();
		nota1=r.nextInt(11);
		nota2=r.nextInt(11);
		nota3=r.nextInt(11);
	}

	public void mostrarDatos(){
		System.out.println("Nombre: "+nombre);
		System.out.println("Telefono: "+telefono);
		System.out.println("Notas: " +nota1+ ", " +nota2+ ", "+nota3);
}
}
