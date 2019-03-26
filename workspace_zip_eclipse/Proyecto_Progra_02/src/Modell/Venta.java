package Modell;

public class Venta {

	private int codigoVenta;
	private String fechaVenta;
	private int codigoEmpleado; //Foreign key
	private int codigoCliente;
	private int precioAuto;
	public Venta(String fechaVenta, int precioAuto) {

		this.fechaVenta = fechaVenta;
		this.precioAuto = precioAuto;
	}
	/**
	 * @return the fechaVenta
	 */
	public String getFechaVenta() {
		return fechaVenta;
	}
	/**
	 * @param fechaVenta the fechaVenta to set
	 */
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	/**
	 * @return the precioAuto
	 */
	public int getPrecioAuto() {
		return precioAuto;
	}
	/**
	 * @param precioAuto the precioAuto to set
	 */
	public void setPrecioAuto(int precioAuto) {
		this.precioAuto = precioAuto;
	}
	/**
	 * @return the codigoVenta
	 */
	public int getCodigoVenta() {
		return codigoVenta;
	}
	/**
	 * @param codigoVenta the codigoVenta to set
	 */
	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}
	/**
	 * @return the codigoEmpleado
	 */
	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}
	/**
	 * @param codigoEmpleado the codigoEmpleado to set
	 */
	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	/**
	 * @return the codigoCliente
	 */
	public int getCodigoCliente() {
		return codigoCliente;
	}
	/**
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	
}
