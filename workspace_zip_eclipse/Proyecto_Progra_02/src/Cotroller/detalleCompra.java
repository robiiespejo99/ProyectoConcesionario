package Cotroller;

import java.sql.ResultSet;

public class detalleCompra {
	public static Modell.detalleCompra insert(Modell.detalleCompra detallecompra, Conexion conexion, Modell.Compra compra, Modell.Auto auto) {
		int foranea_compra = Integer.parseInt(listObtencion_codigocompra(conexion, compra));
		int foranea_auto = Integer.parseInt(listObtencion_auto(conexion, auto));
		
		System.out.println(foranea_compra);
		System.out.println(foranea_auto);
		
	    String sql = "insert into detallecompra(cantidad, codigoCompra, codigoAuto) values (?,?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, detallecompra.getCantidad());
		     conexion.getSentencia().setInt(2, foranea_compra);
		     conexion.getSentencia().setInt(3, foranea_auto);
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
	
	public static String listObtencion_auto(Conexion conexion, Modell.Auto auto) {
		String result = "";
		String nombremarca = auto.getNombreMarca();
		System.out.println(nombremarca);
		String sql_4 = "SELECT * FROM auto WHERE nombreMarca = " + "'"+ nombremarca + "'";
		ResultSet resultSet;
		
		try {
			System.out.println(sql_4);
			conexion.consulta(sql_4);
			resultSet = conexion.resultado();
			 while (resultSet.next()) {
					result = result + resultSet.getInt("codigoAuto");
					break;
				}
				resultSet.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static String listObtencion_codigocompra(Conexion conexion, Modell.Compra compra) {
		String result = "";
		int Codigoproveedor = compra.getCodigoproveedor();
		System.out.println(Codigoproveedor);
		String sql_20 = "SELECT * FROM compra WHERE codigoProveedor = " + Codigoproveedor;
		ResultSet resultSet;
		
		try {
			System.out.println(sql_20);
			conexion.consulta(sql_20);
			resultSet = conexion.resultado();
			 while (resultSet.next()) {
					result = result + resultSet.getInt("codigoCompra");
					break;
				}
				resultSet.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
}
