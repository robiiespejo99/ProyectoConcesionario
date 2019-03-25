package View;

import java.sql.SQLException;
import java.util.Scanner;
import Cotroller.Conexion;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Conexion db = new Conexion();
Window w = new Window();
    w.setVisible(true);
	/*	Scanner scanner = new Scanner (System.in);
		Conexion conexion = new Conexion();
		
		System.out.println("Eliga la actividad a realizar");		
		
		
		
		Modell.Auto auto = Auto.read(scanner);
		Modell.Categoria categoria = Categoria.read(scanner);
		
		Cotroller.Auto.insert(auto, conexion);
		Cotroller.Categoria.insert(categoria, conexion);
		
		Auto.list(conexion);
		Categoria.list(conexion);
		try {
			conexion.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}*/
	}
}
