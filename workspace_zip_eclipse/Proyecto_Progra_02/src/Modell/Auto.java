package Modell;

public class Auto {

	private int codigoAuto;
	private String nombreMarca;
	private String colorAuto;
	private int codigoModelo;
	private int codigoCategoria;
	private int stock;
	
	public Auto(int codigoAuto, String nombreMarca, String colorAuto, int codigoModelo, int codigoCategoria, int stock) {
		this.codigoAuto = codigoAuto;
		this.nombreMarca = nombreMarca;
		this.colorAuto = colorAuto;
		this.codigoModelo = codigoModelo;
		this.codigoCategoria = codigoCategoria;
		this.stock = stock;
	}
	public Auto(String nombreMarca, String colorAuto, int stock) {
		this.codigoAuto = codigoAuto;
		this.nombreMarca = nombreMarca;
		this.colorAuto = colorAuto;
		this.codigoModelo = codigoModelo;
		this.codigoCategoria = codigoCategoria;
		this.stock = stock;
	}
	/**
	 * @return the codigoAuto
	 */
	public int getCodigoAuto() {
		return codigoAuto;
	}
	/**
	 * @param codigoAuto the codigoAuto to set
	 */
	public void setCodigoAuto(int codigoAuto) {
		this.codigoAuto = codigoAuto;
	}
	/**
	 * @return the nombreMarca
	 */
	public String getNombreMarca() {
		return nombreMarca;
	}
	/**
	 * @param nombreMarca the nombreMarca to set
	 */
	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}
	/**
	 * @return the color
	 */
	public String getColorAuto() {
		return colorAuto;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String colorAuto) {
		this.colorAuto = colorAuto;
	}
	/**
	 * @return the codigoModelo
	 */
	public int getCodigoModelo() {
		return codigoModelo;
	}
	/**
	 * @param codigoModelo the codigoModelo to set
	 */
	public void setCodigoModelo(int codigoModelo) {
		this.codigoModelo = codigoModelo;
	}
	/**
	 * @return the codigoCategoria
	 */
	public int getCodigoCategoria() {
		return codigoCategoria;
	}
	/**
	 * @param codigoCategoria the codigoCategoria to set
	 */
	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Auto [codigoAuto=" + codigoAuto + ", nombreMarca=" + nombreMarca + ", color=" + colorAuto
				+ ", codigoModelo=" + codigoModelo + ", codigoCategoria=" + codigoCategoria + ", stock=" + stock + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Auto auto = (Auto) obj;
	    return (this.codigoAuto == auto.codigoAuto);
	}

	public boolean equals(int codigoAuto) {
		return (this.codigoAuto == codigoAuto);
	}
}
