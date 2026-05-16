package com.guatex.impresiones.entidades;

import java.io.Serializable;

/**
 *
 * @author ESTEFANIECM
 */
public class LibreriaAgente implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombrelibreria = "";
	private byte[] jarlib;
	private String jarjash = "";

	public String getNOMBRELIBRERIA() {
		return nombrelibreria;
	}

	public void setNOMBRELIBRERIA(String NOMBRELIBRERIA) {
		this.nombrelibreria = NOMBRELIBRERIA;
	}

	public byte[] getJARLIB() {
		return jarlib;
	}

	public void setJARLIB(byte[] JARLIB) {
		this.jarlib = JARLIB;
	}

	public String getJARHASH() {
		return jarjash;
	}

	public void setJARHASH(String JARHASH) {
		this.jarjash = JARHASH;
	}

}
