import java.util.*;
import javax.swing.JOptionPane;
public class EvaluacionApp 
{
	public static void main(String...args)
	{
		float pGeneral=0, pGeneration=0, pBack=0;
		String snombre;
		String[]colores = new String[8];
		float[]icalis = new float[8];
		String[]mentalidades = {	"Mentalidad de crecimiento",
									"Persistencia",
									"Responsabilidad personal",
									"Orientacion al futuro",
									"Comunicacion",
									"Trabajo en equipo",
									"Gestion del tiempo",
									"Orientacion al detalle"};
		
		snombre = JOptionPane.showInputDialog("Ingrese nombre del alumno");
		int a=1;
		int contador=0;
		while(a<=4 && a>=1 && contador<8)
		{
			icalis[contador] = Integer.parseInt(JOptionPane.showInputDialog("Calificacion para "+mentalidades[contador]));
			if(icalis[contador]>=1 && icalis[contador]<=4)
				contador++;
		}
		
		for(int i=0; i<=7; i++)
		{
			if(icalis[i]==1)		colores[i]="Rojo";
			else if(icalis[i]==2)	colores[i]="Amarillo";
			else if(icalis[i]==3)	colores[i]="Rojo";
			else if(icalis[i]==4)	colores[i]="Azul";
		}
		
		for(int i=0; i<=3; i++)
			pGeneration+=icalis[i];
		
		for(int i=4; i<=7; i++)
			pBack+=icalis[i];
		
		for(int i=0; i<=7; i++)
			pGeneral+=icalis[i];
		
		System.out.println("Alumno: "+snombre+"\n\n");
		for(int i=0; i<=7; i++)
			System.out.println(mentalidades[i]+" -- "+icalis[i]+" -- "+colores[i]);
		
		System.out.println("\n\nLa suma general es: "+pGeneral);
		System.out.println("El promedio general es: "+(pGeneral/8.0));
		System.out.println("El promedio Generation es: "+(pGeneration/4.0));
		System.out.println("El promedio de Back End es: "+(pBack/4.0));
	}
}
