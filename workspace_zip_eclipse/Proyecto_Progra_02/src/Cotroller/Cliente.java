package Cotroller;

public class Cliente {

	public static Modell.Cliente insert(Modell.Cliente cliente, Conexion conexion) {
		String sql = "insert into cliente(nombreCliente, apellidoCliente, direccionCliente, telefonoCliente) values (?,?,?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setString(1, cliente.getNombreCliente());
			conexion.getSentencia().setString(2, cliente.getApellidoCliente());
			conexion.getSentencia().setString(3, cliente.getDireccionCliente());
			conexion.getSentencia().setString(4, cliente.getTelefono());
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de Cliente");
		}
		return cliente;
	}
}
