package Cotroller;

public class Empleado {

	public static Modell.Empleado insert(Modell.Empleado empleado, Conexion conexion) {
		String sql = "insert into empleado(nombreEmpleado, apellidoEmpleado, cargoEmpleado) values (?,?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setString(1, empleado.getNombreEmpleado());
			conexion.getSentencia().setString(2, empleado.getApellidoEmpleado());
			conexion.getSentencia().setString(3, empleado.getCargoEmpleado());
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de Auto");
		}		
		return empleado;
	}
}
