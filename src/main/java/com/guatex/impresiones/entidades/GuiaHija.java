package com.guatex.impresiones.entidades;

/**
 * 
 * @author ESTEFANIECM
 *
 */
public class GuiaHija {
	private String hguiaHija = "";
	private String hnoguiaMadre = "";
	private String pFecha = "";
	private String pHora = "";
	private String pEstatus = "";
	private String Hestatus = "";

	public String getHguiaHija() {
		return hguiaHija;
	}

	public void setHguiaHija(String HguiaHija) {
		this.hguiaHija = quitaNulo(HguiaHija);
	}

	public String getHnoguiaMadre() {
		return hnoguiaMadre;
	}

	public void setHnoguiaMadre(String HnoguiaMadre) {
		this.hnoguiaMadre = quitaNulo(HnoguiaMadre);
	}

	public String getpFecha() {
		return pFecha;
	}

	public void setpFecha(String pFecha) {
		this.pFecha = quitaNulo(pFecha);
	}

	public String getpHora() {
		return pHora;
	}

	public void setpHora(String pHora) {
		this.pHora = quitaNulo(pHora);
	}

	public String getpEstatus() {
		return pEstatus;
	}

	public void setpEstatus(String pEstatus) {
		this.pEstatus = quitaNulo(pEstatus);
	}

	public String getHestatus() {
		return Hestatus;
	}

	public void setHestatus(String Hestatus) {
		this.Hestatus = quitaNulo(Hestatus);
	}

	private String quitaNulo(String txt) {
		return txt == null ? "" : txt.trim();
	}
}
