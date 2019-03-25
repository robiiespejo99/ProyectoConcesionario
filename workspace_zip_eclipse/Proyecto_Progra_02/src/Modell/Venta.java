package Modell;

public class Venta {

	private int codigoVenta;
	private int fechaVenta;
	private int codigoEmpleado; //Foreign key
	private int precioAuto;
	public Venta(int fechaVenta, int precioAuto) {

		this.fechaVenta = fechaVenta;
		this.precioAuto = precioAuto;
	}
	/**
	 * @return the fechaVenta
	 */
	public int getFechaVenta() {
		return fechaVenta;
	}
	/**
	 * @param fechaVenta the fechaVenta to set
	 */
	public void setFechaVenta(int fechaVenta) {
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

}
