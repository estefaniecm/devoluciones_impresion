package com.guatex.impresiones.entidades;

import java.util.List;

/**
 * 
 * @author ESTEFANIECM
 *
 */
public class Guia {
	private String fecha = "";
	private String nombreRemitente = "";
	private String nombreDestinatario = "";
	private String direccionRemitente = "";
	private String direccionDestinatario = "";
	private String muniRemitente = "";
	private String puntoOrigen = "";
	private String muniDestinatario = "";
	private String puntoDestino = "";
	private String telefonoRemitente = "";
	private String telefonoDestinatario = "";
	private String cobex = "";
	private String descripcionEnvio = "";
	private String codigoCredito = "";
	private String piezas = "";
	private String peso = "";
	private String seguro = "";
	private String guiaMadre = "S";
	private String valorDeclarado = "";
	private String numeroGuia = "";
	private String llaveCliente = "";
	private String recogeOficina = "";
	private String codValorCobrar = "";
	private String seabrepaquete = "";
	private String formaPago = "";
	private String tarifa = "";
	private List<GuiaHija> guiasHijas;
	private List<GuiaDetalle> lineasDetalle;

	private String coberturaExtra = "";
	private String recoleccionEntrega = "";
	private String tipoCobro = "";

	public String getRecogeOficina() {
		return recogeOficina;
	}

	public void setRecogeOficina(String recogeOficina) {
		this.recogeOficina = spaces(quitaNulo(recogeOficina));
	}

	public String getLlaveCliente() {
		return llaveCliente;
	}

	public void setLlaveCliente(String llaveCliente) {
		this.llaveCliente = spaces(quitaNulo(llaveCliente));
	}

	public String getGuiaMadre() {
		return guiaMadre;
	}

	public void setGuiaMadre(String guiaMadre) {
		this.guiaMadre = quitaNulo(guiaMadre);
	}

	public String getPuntoDestino() {
		return puntoDestino;
	}

	public void setPuntoDestino(String puntoDestino) {
		this.puntoDestino = spaces(quitaNulo(puntoDestino));
	}

	public String getPuntoOrigen() {
		return puntoOrigen;
	}

	public void setPuntoOrigen(String puntoOrigen) {
		this.puntoOrigen = spaces(quitaNulo(puntoOrigen));
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = spaces(quitaNulo(tarifa));
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = spaces(quitaNulo(formaPago));
	}

	public String getRecoleccionEntrega() {
		return recoleccionEntrega;
	}

	public void setRecoleccionEntrega(String recoleccionEntrega) {
		this.recoleccionEntrega = spaces(quitaNulo(recoleccionEntrega));
	}

	public String getNumeroGuia() {
		return numeroGuia;
	}

	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = spaces(quitaNulo(numeroGuia));
	}

	public String getNombreRemitente() {
		return nombreRemitente;
	}

	public void setNombreRemitente(String nombreRemitente) {
		this.nombreRemitente = spaces(quitaNulo(nombreRemitente).toUpperCase());
	}

	public String getDireccionRemitente() {
		return direccionRemitente;
	}

	public void setDireccionRemitente(String direccionRemitente) {
		this.direccionRemitente = spaces(quitaNulo(direccionRemitente).toUpperCase());
	}

	public String getTelefonoRemitente() {
		return telefonoRemitente;
	}

	public void setTelefonoRemitente(String telefonoRemitente) {
		this.telefonoRemitente = spaces(quitaNulo(telefonoRemitente));
	}

	public String getMuniRemitente() {
		return muniRemitente.isEmpty() ? "." : muniRemitente;
	}

	public void setMuniRemitente(String muniRemitente) {
		this.muniRemitente = spaces(quitaNulo(muniRemitente).toUpperCase());
	}

	public String getDescripcionEnvio() {
		return descripcionEnvio;
	}

	public void setDescripcionEnvio(String descripcionEnvio) {
		this.descripcionEnvio = spaces(quitaNulo(descripcionEnvio));
	}

	public String getCodigoCredito() {
		return codigoCredito;
	}

	public void setCodigoCredito(String codigoCredito) {
		this.codigoCredito = spaces(quitaNulo(codigoCredito));
	}

	public String getPiezas() {
		return piezas;
	}

	public void setPiezas(String piezas) {
		this.piezas = spaces(quitaNulo(piezas));
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = spaces(quitaNulo(peso));
	}

	public String getSeguro() {
		if (this.seguro.isEmpty()) {
			this.seguro = "0.00";
		}
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = quitaNulo(seguro);
	}

	public String getValorDeclarado() {
		if (this.valorDeclarado.isEmpty()) {
			this.valorDeclarado = "0.00";
		}
		return valorDeclarado;
	}

	public void setValorDeclarado(String valorDeclarado) {
		this.valorDeclarado = spaces(quitaNulo(valorDeclarado));
	}

	public String getTipoCobro() {
		return tipoCobro;
	}

	public void setTipoCobro(String tipoCobro) {
		this.tipoCobro = spaces(quitaNulo(tipoCobro));
	}

	public List<GuiaDetalle> getLineasDetalle() {
		return lineasDetalle;
	}

	public void setLineasDetalle(List<GuiaDetalle> lineasDetalle) {
		this.lineasDetalle = lineasDetalle;
	}

	public List<GuiaHija> getGuiasHijas() {
		return guiasHijas;
	}

	public void setGuiasHijas(List<GuiaHija> guiasHijas) {
		this.guiasHijas = guiasHijas;
	}

	public String getCodValorCobrar() {
		if (this.codValorCobrar.isEmpty()) {
			this.codValorCobrar = "0.00";
		}
		return codValorCobrar;
	}

	public void setCodValorCobrar(String codValorCobrar) {
		this.codValorCobrar = spaces(quitaNulo(codValorCobrar));
	}

	public String getSeabrepaquete() {
		if (this.seabrepaquete.isEmpty()) {
			this.seabrepaquete = "N";
		}
		return seabrepaquete;
	}

	public void setSeabrepaquete(String seabrepaquete) {
		this.seabrepaquete = spaces(quitaNulo(seabrepaquete));
	}

	public String getCobex() {
		return cobex;
	}

	public void setCobex(String cobex) {
		this.cobex = spaces(quitaNulo(cobex));
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = spaces(quitaNulo(fecha));
	}

	public String getNombreDestinatario() {
		return nombreDestinatario;
	}

	public void setNombreDestinatario(String nombreDestinatario) {
		this.nombreDestinatario = spaces(quitaNulo(nombreDestinatario).toUpperCase());
	}

	public String getDireccionDestinatario() {
		return direccionDestinatario;
	}

	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = spaces(quitaNulo(direccionDestinatario).toUpperCase());
	}

	public String getTelefonoDestinatario() {
		return telefonoDestinatario;
	}

	public void setTelefonoDestinatario(String telefonoDestinatario) {
		this.telefonoDestinatario = spaces(quitaNulo(telefonoDestinatario));
	}

	public String getMuniDestinatario() {
		return muniDestinatario.isEmpty() ? "." : muniDestinatario;
	}

	public void setMuniDestinatario(String muniDestinatario) {
		this.muniDestinatario = quitaNulo(muniDestinatario);
	}

	public String getCoberturaExtra() {
		return coberturaExtra;
	}

	public void setCoberturaExtra(String coberturaExtra) {
		this.coberturaExtra = spaces(quitaNulo(coberturaExtra));
	}

	private String quitaNulo(String txt) {
		return txt == null ? "" : txt.trim();
	}

	private String spaces(String txt) {
		return (txt.replaceAll("\\s+", " ").replaceAll("\\.NULL\\.", "").replaceAll("\\bNULL\\b", "")
				.replaceAll("\\bNULO\\b", "")).trim();
	}

	@Override
	public String toString() {
		return numeroGuia + "-" + piezas + " - PTOORI: " + puntoOrigen + " PTODES: " + puntoDestino;
	}

}
