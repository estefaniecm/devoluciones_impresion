package com.guatex.impresiones.entidades;

import com.guatex.impresiones.datos.Utils;

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
		this.hguiaHija = Utils.quitaNulo(HguiaHija);
	}

	public String getHnoguiaMadre() {
		return hnoguiaMadre;
	}

	public void setHnoguiaMadre(String HnoguiaMadre) {
		this.hnoguiaMadre = Utils.quitaNulo(HnoguiaMadre);
	}

	public String getpFecha() {
		return pFecha;
	}

	public void setpFecha(String pFecha) {
		this.pFecha = Utils.quitaNulo(pFecha);
	}

	public String getpHora() {
		return pHora;
	}

	public void setpHora(String pHora) {
		this.pHora = Utils.quitaNulo(pHora);
	}

	public String getpEstatus() {
		return pEstatus;
	}

	public void setpEstatus(String pEstatus) {
		this.pEstatus = Utils.quitaNulo(pEstatus);
	}

	public String getHestatus() {
		return Hestatus;
	}

	public void setHestatus(String Hestatus) {
		this.Hestatus = Utils.quitaNulo(Hestatus);
	}
	
}
