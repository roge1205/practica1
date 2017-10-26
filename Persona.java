
public class Persona 
{
	private String Nombre;
	private String Apellido;
	private int Edad;
	
	public void SetNombre(String nombre)
	{
		this.Nombre = nombre;
	}
	public String GetNombre()
	{
		return Nombre;
	}
	public void SetApellido(String apellido)
	{
		this.Apellido = apellido;
	}
	public String GetApellido()
	{
		return Apellido;
	}
	public void SetEdad(int edad)
	{
		this.Edad = edad;
	}
	public int GetEdad()
	{
		return Edad;
	}
}
