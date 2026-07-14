package com.guatex.impresiones.entidades;

import com.guatex.impresiones.datos.Utils;

/**
 * 
 * @author ESTEFANIECM
 *
 */
public class GuiaDetalle {
	private String linea;
	private String piezas;
	private String tipoEnvio;
	private String peso;
	private String tarifa;
	private String manual;
	private String pBultos;
	private String numeroGuia;

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = Utils.quitaNulo(linea);
	}

	public String getPiezas() {
		return piezas;
	}

	public void setPiezas(String piezas) {
		this.piezas = Utils.quitaNulo(piezas);
	}

	public String getTipoEnvio() {
		return tipoEnvio;
	}

	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = Utils.quitaNulo(tipoEnvio);
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = Utils.quitaNulo(peso);
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		String t = Utils.quitaNulo(tarifa);
		if (t.isEmpty()) {
			this.tarifa = "0.00";
		} else {
			this.tarifa = t;
		}

	}

	public String getManual() {
		return manual;
	}

	public void setManual(String manual) {
		this.manual = Utils.quitaNulo(manual);
	}

	public String getpBultos() {
		return pBultos;
	}

	public void setpBultos(String pBultos) {
		this.pBultos = Utils.quitaNulo(pBultos);
	}

	public String getNumeroGuia() {
		return numeroGuia;
	}

	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = Utils.quitaNulo(numeroGuia);
	}
	
	@Override
	public String toString() {
		return "E_GuiaDetalle [linea=" + linea + ", piezas=" + piezas + ", tipoEnvio=" + tipoEnvio + ", peso=" + peso
				+ ", tarifa=" + tarifa + ", manual=" + manual + ", pBultos=" + pBultos + ", numeroGuia=" + numeroGuia
				+ "]";
	}

	
}
