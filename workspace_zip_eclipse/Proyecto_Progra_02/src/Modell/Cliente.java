package Modell;

public class Cliente {

	private int codigoCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String direccionCliente;
	private String telefono;
	public Cliente(String nombreCliente, String apellidoCliente, String direccionCliente, String telefono) {
		
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.direccionCliente = direccionCliente;
		this.telefono = telefono;
	}
	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}
	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	/**
	 * @return the apellidoCliente
	 */
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	/**
	 * @param apellidoCliente the apellidoCliente to set
	 */
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	/**
	 * @return the direccionCliente
	 */
	public String getDireccionCliente() {
		return direccionCliente;
	}
	/**
	 * @param direccionCliente the direccionCliente to set
	 */
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
