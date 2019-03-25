package Cotroller;

import java.sql.ResultSet;

public class detalleCompra {
	public static Modell.detalleCompra insert(Modell.detalleCompra detallecompra, Conexion conexion) {
		String sql = "insert into detallecompra(cantidad) values (?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, detallecompra.getCantidad());
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de Detalle de Compra");
		}		
		return detallecompra;
	}

	public static String list(Conexion conexion){
		String result = "";
		String sql = "select cantidad from detallecompra";
		ResultSet resultSet;
		try {
			conexion.consulta(sql);
			resultSet = conexion.resultado();
			 while (resultSet.next()) {
					result = result + " " + "codigoDetalleCompra: " + resultSet.getInt("codigoDetalleCompra") + "\n";
					result = result + " " + "cantidad: " + resultSet.getString("cantidad") + "\n";
					result = result + "\n";
				}
				resultSet.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
