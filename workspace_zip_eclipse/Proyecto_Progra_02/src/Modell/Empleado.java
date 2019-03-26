package Modell;

public class Empleado {

	private int codigoEmpleado;
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private String cargoEmpleado;
	private int telefonoEmpleado;
	public Empleado(String nombreEmpleado, String apellidoEmpleado, String cargoEmpleado, int telefonoEmpleado) {
	
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoEmpleado = apellidoEmpleado;
		this.cargoEmpleado = cargoEmpleado;
		this.telefonoEmpleado = telefonoEmpleado;
	}
	/**
	 * @return the nombreEmpleado
	 */
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	/**
	 * @param nombreEmpleado the nombreEmpleado to set
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	/**
	 * @return the apellidoEmpleado
	 */
	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}
	/**
	 * @param apellidoEmpleado the apellidoEmpleado to set
	 */
	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}
	/**
	 * @return the cargoEmpleado
	 */
	public String getCargoEmpleado() {
		return cargoEmpleado;
	}
	/**
	 * @param cargoEmpleado the cargoEmpleado to set
	 */
	public void setCargoEmpleado(String cargoEmpleado) {
		this.cargoEmpleado = cargoEmpleado;
	}
	/**
	 * @return the telefonoEmpleado
	 */
	public int getTelefonoEmpleado() {
		return telefonoEmpleado;
	}
	/**
	 * @param telefonoEmpleado the telefonoEmpleado to set
	 */
	public void setTelefonoEmpleado(int telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}
	
	
}
