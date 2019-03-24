package Cotroller;

import java.sql.ResultSet;

public class Auto {


	public static Modell.Auto insert(Modell.Auto auto, Conexion conexion) {
		String sql = "insert into auto(nombreMarca, colorAuto, stock) values (?,?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setString(1, auto.getNombreMarca());
			conexion.getSentencia().setString(2, auto.getColorAuto());
			conexion.getSentencia().setInt(3, auto.getStock());
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de Auto");
		}		
		return auto;
	}

	public static String list(Conexion conexion){
		String result = "";
		String sql = "select codigoAuto, nombreMarca, colorAuto, stock from auto";
		ResultSet resultSet;
		try {
			conexion.consulta(sql);
			resultSet = conexion.resultado();
			 while (resultSet.next()) {
					result = result + " " + "codigoAuto: " + resultSet.getInt("codigoAuto") + "\n";
					result = result + " " + "nombreMarca: " + resultSet.getString("nombreMarca") + "\n";
					result = result + " " + "colorAuto: " + resultSet.getString("colorAuto") + "\n";
					result = result + " " + "stock: " + resultSet.getInt("stock") + "\n";
					result = result + "\n";
				}
				resultSet.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}
