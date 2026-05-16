package com.guatex.impresiones.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ESTEFANIECM
 *
 */
public class ImpresionesUsuario {
	private Usuario usuario;
	private List<Guia> guiasImpresion = new ArrayList<>();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Guia> getGuiasImpresion() {
		return guiasImpresion;
	}

	public void setGuiasImpresion(List<Guia> guiasImpresion) {
		this.guiasImpresion = guiasImpresion;
	}

}
