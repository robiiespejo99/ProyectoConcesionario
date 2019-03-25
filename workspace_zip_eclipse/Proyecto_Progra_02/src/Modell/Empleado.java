package Modell;

public class Empleado {

	private int codigoEmpleado;
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private String cargoEmpleado;
	public Empleado(String nombreEmpleado, String apellidoEmpleado, String cargoEmpleado) {
	
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoEmpleado = apellidoEmpleado;
		this.cargoEmpleado = cargoEmpleado;
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
	
}
