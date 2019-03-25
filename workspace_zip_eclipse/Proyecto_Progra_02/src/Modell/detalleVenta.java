package Modell;

public class detalleVenta {

	private int codigoDetalleVenta;
	private int codigoVenta; //foreign key
	private int codigoCleinte; //foreign key
	private int cantidadAuto;
	private int descuentoAuto;
	public detalleVenta(int cantidadAuto, int descuentoAuto) {
		
		this.cantidadAuto = cantidadAuto;
		this.descuentoAuto = descuentoAuto;
	}
	/**
	 * @return the cantidadAuto
	 */
	public int getCantidadAuto() {
		return cantidadAuto;
	}
	/**
	 * @param cantidadAuto the cantidadAuto to set
	 */
	public void setCantidadAuto(int cantidadAuto) {
		this.cantidadAuto = cantidadAuto;
	}
	/**
	 * @return the descuentoAuto
	 */
	public int getDescuentoAuto() {
		return descuentoAuto;
	}
	/**
	 * @param descuentoAuto the descuentoAuto to set
	 */
	public void setDescuentoAuto(int descuentoAuto) {
		this.descuentoAuto = descuentoAuto;
	}
	
}
