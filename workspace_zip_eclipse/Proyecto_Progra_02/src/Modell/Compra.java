package Modell;

public class Compra {
 
	private int codigoproveedor;
	
	private String fechaCompra;
	private int precioUnidad;
	public Compra(String fechaCompra, int precioUnidad) {
		this.fechaCompra = fechaCompra;
		this.precioUnidad = precioUnidad;
	}
	
	/**
	 * @return the fechaCompra
	 */
	public String getFechaCompra() {
		return fechaCompra;
	}
	/**
	 * @param fechaCompra the fechaCompra to set
	 */
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	/**
	 * @return the precioUnidad
	 */
	public int getPrecioUnidad() {
		return precioUnidad;
	}
	/**
	 * @param precioUnidad the precioUnidad to set
	 */
	public void setPrecioUnidad(int precioUnidad) {
		this.precioUnidad = precioUnidad;
	}
	/**
	 * @return the codigoproveedor
	 */
	public int getCodigoproveedor() {
		return codigoproveedor;
	}

	/**
	 * @param codigoproveedor the codigoproveedor to set
	 */
	public void setCodigoproveedor(int codigoproveedor) {
		this.codigoproveedor = codigoproveedor;
	}
	
}
