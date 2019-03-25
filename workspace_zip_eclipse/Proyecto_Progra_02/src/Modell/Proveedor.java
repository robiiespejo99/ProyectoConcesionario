package Modell;

public class Proveedor {
	private String nombreProveedor;
	private String paisProveedor;
	public Proveedor(String nombreProveedor, String paisProveedor) {
		super();
		this.nombreProveedor = nombreProveedor;
		this.paisProveedor = paisProveedor;
	}
	/**
	 * @return the nombreProveedor
	 */
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	/**
	 * @param nombreProveedor the nombreProveedor to set
	 */
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	/**
	 * @return the paisProveedor
	 */
	public String getPaisProveedor() {
		return paisProveedor;
	}
	/**
	 * @param paisProveedor the paisProveedor to set
	 */
	public void setPaisProveedor(String paisProveedor) {
		this.paisProveedor = paisProveedor;
	}
}
