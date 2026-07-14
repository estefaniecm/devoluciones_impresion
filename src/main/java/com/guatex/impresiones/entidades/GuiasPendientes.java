package com.guatex.impresiones.entidades;

import com.guatex.impresiones.datos.Utils;

public class GuiasPendientes {
	private String noguia = "";
	private String tipoGuia = "";
	private int tguias = 0;

	public String getNoguia() {
		return noguia;
	}

	public void setNoguia(String noguia) {
		this.noguia = Utils.quitaNulo(noguia);
	}

	public int getTguias() {
		return tguias;
	}

	public void setTguias(int tguias) {
		this.tguias = tguias;
	}

	@Override
	public String toString() {
		return "E_GuiasPendientes [noguia=" + noguia + ", tguias=" + tguias + "]";
	}

	public String getTipoGuia() {
		return tipoGuia;
	}

	public void setTipoGuia(String tipoGuia) {
		this.tipoGuia = Utils.quitaNulo(tipoGuia);
	}

}
