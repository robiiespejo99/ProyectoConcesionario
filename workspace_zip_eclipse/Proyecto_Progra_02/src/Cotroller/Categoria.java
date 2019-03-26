package Cotroller;

import java.sql.ResultSet;

public class Categoria {

	public static Modell.Categoria insert(Modell.Categoria categoria, Conexion conexion) {
		String sql = "insert into categoria(DescripcionCategoria, TipoAuto) values (?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setString(1, categoria.getDescripcionCategoria());
			conexion.getSentencia().setString(2, categoria.getTipoAuto());
			conexion.modificacion();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Error en la consulta Categoria");
		}		
		return categoria;
	}
	public static String list(Conexion conexion){
		String result = "";
		String sql = "select codigoCategoria, DescripcionCategoria, TipoAuto from categoria";
		ResultSet resultSet;
		try {
			conexion.consulta(sql);
			resultSet = conexion.resultado();
			 while (resultSet.next()) {
					result = result + " " + "codigoCategoria: " + resultSet.getInt("codigoCategoria") + "\n";
					result = result + " " + "DescripcionCategoria: " + resultSet.getString("DescripcionCategoria") + "\n";
					result = result + " " + "TipoAuto: " + resultSet.getString("TipoAuto") + "\n";
					result = result + "\n";
				}
				resultSet.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
}
