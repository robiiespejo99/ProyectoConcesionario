package Cotroller;

public class Venta {

	public static Modell.Venta insert(Modell.Venta venta, Conexion conexion) {
		String sql = "insert into venta(fechaVenta, precioAuto) values (?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setString(1, venta.getFechaVenta());
			conexion.getSentencia().setInt(2, venta.getPrecioAuto());
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de Auto");
		}		
		return venta;
	}
}
