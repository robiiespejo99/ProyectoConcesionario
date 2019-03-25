package Modell;

public class Venta {

	private int codigoVenta;
	private String fechaVenta;
	private int codigoEmpleado; //Foreign key
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

}
