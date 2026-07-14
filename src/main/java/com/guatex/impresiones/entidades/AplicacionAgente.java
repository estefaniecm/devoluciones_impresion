package com.guatex.impresiones.entidades;

import java.io.Serializable;
import java.util.List;

import com.guatex.impresiones.datos.Utils;

/**
 *
 * @author ESTEFANIECM
 */
public class AplicacionAgente implements Serializable {

	private static final long serialVersionUID = 1L;
	private String codigoversion = "";
	private byte[] jaraplicacion;
	private String jarjash = "";
	private List<LibreriaAgente> librerias;

	public List<LibreriaAgente> getLIBRERIAS() {
		return librerias;
	}

	public void setLIBRERIAS(List<LibreriaAgente> LIBRERIAS) {
		this.librerias = LIBRERIAS;
	}

	public byte[] getJARAPLICACION() {
		return jaraplicacion;
	}

	public void setJARAPLICACION(byte[] JARAPLICACION) {
		this.jaraplicacion = JARAPLICACION;
	}

	public String getCODIGOVERSION() {
		return codigoversion;
	}

	public void setCODIGOVERSION(String CODIGOVERSION) {
		this.codigoversion = Utils.quitaNulo(CODIGOVERSION);
	}

	public String getJARHASH() {
		return jarjash;
	}

	public void setJARHASH(String JARHASH) {
		this.jarjash = Utils.quitaNulo(JARHASH);
	}

}
