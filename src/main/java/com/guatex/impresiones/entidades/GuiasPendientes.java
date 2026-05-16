package com.guatex.impresiones.entidades;

public class GuiasPendientes {
	private String noguia = "";
	private int tguias = 0;
	
	public String getNoguia() {
		return noguia;
	}
	public void setNoguia(String noguia) {
		this.noguia = noguia;
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
	
	
}
