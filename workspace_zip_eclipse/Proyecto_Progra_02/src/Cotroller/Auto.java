package Cotroller;

import java.sql.ResultSet;

public class Auto {


	public static Modell.Auto insert(Modell.Auto auto, Conexion conexion, Modell.Categoria categoria, int cantidadstock) {
		int foranea = Integer.parseInt(listObtencion(conexion, categoria));
		auto.setCodigoCategoria(foranea);
		String sql_7 = "insert into auto(nombreMarca, colorAuto, stock, codigoCategoria) values (?,?,?,?)";
		try {
			conexion.consulta(sql_7);
			conexion.getSentencia().setString(1, auto.getNombreMarca());
			conexion.getSentencia().setString(2, auto.getColorAuto());
			conexion.getSentencia().setInt(3, cantidadstock);
			conexion.getSentencia().setInt(4, foranea);
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de Auto");
		}
		return auto;
	}

	
	public static Modell.Auto insertStock(Modell.Auto auto, Conexion conexion,Modell.detalleCompra detallecompra) {
		String sql_6 = "insert into auto(stock) values (?)";
		try {
			conexion.consulta(sql_6);
			conexion.getSentencia().setInt(1, detallecompra.getCantidad());
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
	public static String listObtencion(Conexion conexion, Modell.Categoria categoria) {
		String result = "";
		String DescripcionCategoria = categoria.getDescripcionCategoria();
		System.out.println(DescripcionCategoria);
		String sql_5 = "SELECT * FROM categoria WHERE descripcionCategoria = " + "'"+ DescripcionCategoria + "'";
		ResultSet resultSet;
		
		try {
			System.out.println(sql_5);
			conexion.consulta(sql_5);
			resultSet = conexion.resultado();
			 while (resultSet.next()) {
					result = result + resultSet.getInt("codigoCategoria");
					break;
				}
				resultSet.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
	
	

