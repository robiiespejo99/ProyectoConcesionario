package Cotroller;

import java.sql.ResultSet;

public class Proveedor {


	public static Modell.Proveedor insert(Modell.Proveedor proveedor, Conexion conexion) {
		String sql = "insert into proveedor(nombreProveedor, paisProveedor) values (?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setString(1, proveedor.getNombreProveedor());
			conexion.getSentencia().setString(2, proveedor.getPaisProveedor());
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de Proveedor");
		}		
		return proveedor;
	}

	public static String list(Conexion conexion){
		String result = "";
		String sql = "select nombreProveedor, paisProveedor from proveedor";
		ResultSet resultSet;
		try {
			conexion.consulta(sql);
			resultSet = conexion.resultado();
			 while (resultSet.next()) {
					result = result + " " + "codigoProveedor: " + resultSet.getInt("codigoProveedor") + "\n";
					result = result + " " + "nombreProveedor: " + resultSet.getString("nombreProveedor") + "\n";
					result = result + " " + "paisProveedor: " + resultSet.getString("paisProveedor") + "\n";
					result = result + "\n";
				}
				resultSet.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
