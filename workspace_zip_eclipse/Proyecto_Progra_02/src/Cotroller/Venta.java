package Cotroller;

import java.sql.ResultSet;

public class Venta {

	public static Modell.Venta insert(Modell.Venta venta, Conexion conexion, Modell.Empleado empleado, Modell.Cliente cliente) {
		int foranea_empleado = Integer.parseInt(listObtencion_empleado(conexion, empleado));
		int foranea_cliente = Integer.parseInt(listObtencion_cliente(conexion, cliente));
		venta.setCodigoEmpleado(foranea_empleado);
		venta.setCodigoCliente(foranea_cliente);
		String sql = "insert into venta(fechaVenta, precioAuto, codigoEmpleado, codigoCliente) values (?,?,?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setString(1, venta.getFechaVenta());
			conexion.getSentencia().setInt(2, venta.getPrecioAuto());
			conexion.getSentencia().setInt(3, foranea_empleado);
			conexion.getSentencia().setInt(4, foranea_cliente);
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de Auto");
		}		
		return venta;
	}
	
	
	public static String listObtencion_empleado(Conexion conexion, Modell.Empleado empleado) {
		
		String result = "";
		int TelefonoEmpleado = empleado.getTelefonoEmpleado();
		String sql_2 = "SELECT * FROM empleado WHERE telefonoEmpleado = " + TelefonoEmpleado;
		ResultSet resultSet;
		
		try {
			System.out.println(sql_2);
			conexion.consulta(sql_2);
			resultSet = conexion.resultado();
			 while (resultSet.next()) {
					result = result + resultSet.getInt("codigoEmpleado");
					break;
				}
				resultSet.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("hola");
		return result;
	}
	
	public static String listObtencion_cliente(Conexion conexion, Modell.Cliente cliente) {
		String result = "";
		int TelefonoEmpleado = cliente.getTelefono();
		String sql_2 = "SELECT * FROM cliente WHERE telefonoCliente = " +  TelefonoEmpleado;
		ResultSet resultSet;
		
		try {
			System.out.println(sql_2);
			conexion.consulta(sql_2);
			resultSet = conexion.resultado();
			 while (resultSet.next()) {
					result = result + resultSet.getInt("codigoCliente");
					break;
				}
				resultSet.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
}
