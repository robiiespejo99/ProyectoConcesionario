package Modell;

public class Categoria {

	private int codigoCategoria;
	private String descripcionCategoria;
	private String tipoAuto;
	public Categoria(String descripcionCategoria, String tipoAuto) {
		this.descripcionCategoria = descripcionCategoria;
		this.tipoAuto = tipoAuto;
	}
	/**
	 * @return the descripcionCategoria
	 */
	public String getDescripcionCategoria() {
		return descripcionCategoria;
	}
	/**
	 * @param descripcionCategoria the descripcionCategoria to set
	 */
	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
	}
	/**
	 * @return the tipoAuto
	 */
	public String getTipoAuto() {
		return tipoAuto;
	}
	/**
	 * @param tipoAuto the tipoAuto to set
	 */
	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Categoria [codigoCategoria=" + codigoCategoria + ", descripcionCategoria=" + descripcionCategoria
				+ ", tipoAuto=" + tipoAuto + "]";
	}
	
	
}
