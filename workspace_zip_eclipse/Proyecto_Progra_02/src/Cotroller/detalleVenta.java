package Cotroller;

import java.sql.ResultSet;

public class detalleVenta {

	public static Modell.detalleVenta insert(Modell.detalleVenta detalleventa, Conexion conexion, Modell.Venta venta) {
		int foranea_venta = Integer.parseInt(listObtencion_codigoventa(conexion, venta));
		String sql = "insert into detalleVenta(cantidadAuto, descuentoAuto, codigoVenta) values (?,?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, detalleventa.getCantidadAuto());
			conexion.getSentencia().setInt(2, detalleventa.getDescuentoAuto());
			conexion.getSentencia().setInt(3, foranea_venta);
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de Detalle de Venta");
		}		
		return detalleventa;
	}
	
	
	
	
	public static String listObtencion_codigoventa(Conexion conexion, Modell.Venta venta) {
		String result = "";
		int CodigoCliente = venta.getCodigoCliente();
		String sql_2 = "SELECT * FROM venta WHERE codigoCliente = " + CodigoCliente;
		ResultSet resultSet;
		
		try {
			System.out.println(sql_2);
			conexion.consulta(sql_2);
			resultSet = conexion.resultado();
			 while (resultSet.next()) {
					result = result + resultSet.getInt("codigoVenta");
					break;
				}
				resultSet.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
}
