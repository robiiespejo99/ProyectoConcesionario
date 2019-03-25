package Cotroller;

public class detalleVenta {

	public static Modell.detalleVenta insert(Modell.detalleVenta detalleventa, Conexion conexion) {
		String sql = "insert into detalleVenta(cantidadAuto, descuentoAuto) values (?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, detalleventa.getCantidadAuto());
			conexion.getSentencia().setInt(2, detalleventa.getDescuentoAuto());
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de Detalle de Venta");
		}		
		return detalleventa;
	}
}
