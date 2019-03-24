package View;

import java.util.Scanner;
import Cotroller.Conexion;
import View.EntradaDatos;

public class Auto {

public static Modell.Auto read(Scanner scanner) {
		
		System.out.println("Ingrese los datos del Auto");
		String nombreMarca = EntradaDatos.readString("Ingrese el Nombre de la Marca: " , scanner);
		String colorAuto = EntradaDatos.readString("Ingrese el color del Auto:" , scanner);
		int stock = EntradaDatos.readInt("Ingrese el la cantidad de autos en Stock:" , scanner);
		
		return new Modell.Auto(nombreMarca, colorAuto, stock);
	}
	
	public static void list(Conexion conexion) {
		System.out.println();
		System.out.println("Listado de Autos");
		System.out.println(Cotroller.Auto.list(conexion));
	}
}