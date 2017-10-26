import java.util.*;
public class PrimeroApp 
{
	public static void main(String... args)
	{
		Scanner teclado = new Scanner(System.in);	//Entrada de teclado (objeto Scanner)
		Persona usuario = new Persona();			//Crea un objeto de la clase Persona
		System.out.println("Ingrese el nombre de la persona");
		usuario.SetNombre(teclado.next());
		System.out.println("Ingrese el apellido de la persona");
		usuario.SetApellido(teclado.next());
		System.out.println("Ingrese la edad en años de la persona");
		usuario.SetEdad(teclado.nextInt());
		
		System.out.println(usuario.GetNombre()+" "+usuario.GetApellido()+" tiene "+usuario.GetEdad()+" años;");
		teclado.close();	//Se cierra teclado
	}
}
