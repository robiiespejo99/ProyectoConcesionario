package Cotroller;

import java.sql.ResultSet;

public class Compra {

	public static Modell.Compra insert(Modell.Compra compra, Conexion conexion) {
		String sql = "insert into compra(fechaCompra, precioUnidad) values (?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setString(1, compra.getFechaCompra());
			conexion.getSentencia().setInt(2, compra.getPrecioUnidad());
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de Compra");
		}		
		return compra;
	}

	public static String list(Conexion conexion){
		String result = "";
		String sql = "select precioUnidad, fechaCompra from compra";
		ResultSet resultSet;
		try {
			conexion.consulta(sql);
			resultSet = conexion.resultado();
			 while (resultSet.next()) {
					result = result + " " + "codigoCompra: " + resultSet.getInt("codigoCompra") + "\n";
					result = result + " " + "precioUnidad: " + resultSet.getString("precioUnidad") + "\n";
					result = result + " " + "fechaCompra: " + resultSet.getString("fechaCompra") + "\n";
					result = result + "\n";
				}
				resultSet.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
