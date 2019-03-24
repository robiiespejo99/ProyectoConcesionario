package View;
import java.util.Scanner;
import Cotroller.Conexion;
import View.EntradaDatos;


public class Categoria {

	
public static Modell.Categoria read(Scanner scanner){
	scanner.nextLine();
	System.out.println("Ingrese los datos de la Categoria del Auto");
	String descripcionCategoria = EntradaDatos.readString("Ingrese el Nombre de la descripcion de la Categoria: " , scanner);
	
	String tipoAuto = EntradaDatos.readString("Ingrese el tipo de Auto:" , scanner);
	
	return new Modell.Categoria(descripcionCategoria, tipoAuto);
    }
public static void list(Conexion conexion) {
	System.out.println();
	System.out.println("Listado de Categoria");
	System.out.println(Cotroller.Categoria.list(conexion));
}
}
