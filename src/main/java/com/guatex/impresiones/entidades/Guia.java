package com.guatex.impresiones.entidades;

import java.util.List;

import com.guatex.impresiones.datos.Utils;

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

	// Guía Solución
	private String tipoGuia = "";
	private String razonNoEntrega = "";
	private String solucionTipo = "";
	private String solucionUbicacionActual = "";
	private String solucionDireccion = "";
	private String solucionTelefono = "";
	private String solucionDetalle = "";
	private String solucionUsuarioRegistro = "";
	private String solucionFechaRegistro = "";

	public String getSolucionUsuarioRegistro() {
		return solucionUsuarioRegistro;
	}

	public void setSolucionUsuarioRegistro(String solucionUsuarioRegistro) {
		this.solucionUsuarioRegistro = spaces(Utils.quitaNulo(solucionUsuarioRegistro));
	}

	public String getSolucionFechaRegistro() {
		return solucionFechaRegistro;
	}

	public void setSolucionFechaRegistro(String solucionFechaRegistro) {
		this.solucionFechaRegistro = spaces(Utils.quitaNulo(solucionFechaRegistro));
	}

	public String getSolucionUbicacionActual() {
		return solucionUbicacionActual;
	}

	public void setSolucionUbicacionActual(String solucionUbicacionActual) {
		this.solucionUbicacionActual = spaces(Utils.quitaNulo(solucionUbicacionActual));
	}

	public String getSolucionDireccion() {
		return solucionDireccion;
	}

	public void setSolucionDireccion(String solucionDireccion) {
		this.solucionDireccion = spaces(Utils.quitaNulo(solucionDireccion));
	}

	public String getSolucionUsrRegistro() {
		return solucionUsuarioRegistro;
	}

	public void setSolucionUsrRegistro(String solucionUsrRegistro) {
		this.solucionUsuarioRegistro = spaces(Utils.quitaNulo(solucionUsrRegistro));
	}

	public String getTipoGuia() {
		return tipoGuia;
	}

	public void setTipoGuia(String tipoGuia) {
		this.tipoGuia = spaces(Utils.quitaNulo(tipoGuia));
	}

	public String getRazonNoEntrega() {
		return razonNoEntrega;
	}

	public void setRazonNoEntrega(String razonNoEntrega) {
		this.razonNoEntrega = spaces(Utils.quitaNulo(razonNoEntrega));
	}

	public String getSolucionTipo() {
		return solucionTipo;
	}

	public void setSolucionTipo(String solucionTipo) {
		this.solucionTipo = spaces(Utils.quitaNulo(solucionTipo));
	}

	public String getSolucionDetalle() {
		return solucionDetalle;
	}

	public void setSolucionDetalle(String solucionDetalle) {
		this.solucionDetalle = spaces(Utils.quitaNulo(solucionDetalle));
	}

	public String getRecogeOficina() {
		return recogeOficina;
	}

	public void setRecogeOficina(String recogeOficina) {
		this.recogeOficina = spaces(Utils.quitaNulo(recogeOficina));
	}

	public String getLlaveCliente() {
		return llaveCliente;
	}

	public void setLlaveCliente(String llaveCliente) {
		this.llaveCliente = spaces(Utils.quitaNulo(llaveCliente));
	}

	public String getGuiaMadre() {
		return guiaMadre;
	}

	public void setGuiaMadre(String guiaMadre) {
		this.guiaMadre = spaces(Utils.quitaNulo(guiaMadre));
	}

	public String getPuntoDestino() {
		return puntoDestino;
	}

	public void setPuntoDestino(String puntoDestino) {
		this.puntoDestino = spaces(Utils.quitaNulo(puntoDestino));
	}

	public String getPuntoOrigen() {
		return puntoOrigen;
	}

	public void setPuntoOrigen(String puntoOrigen) {
		this.puntoOrigen = spaces(Utils.quitaNulo(puntoOrigen));
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = spaces(Utils.quitaNulo(tarifa));
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = spaces(Utils.quitaNulo(formaPago));
	}

	public String getRecoleccionEntrega() {
		return recoleccionEntrega;
	}

	public void setRecoleccionEntrega(String recoleccionEntrega) {
		this.recoleccionEntrega = spaces(Utils.quitaNulo(recoleccionEntrega));
	}

	public String getNumeroGuia() {
		return numeroGuia;
	}

	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = spaces(Utils.quitaNulo(numeroGuia));
	}

	public String getNombreRemitente() {
		return nombreRemitente;
	}

	public void setNombreRemitente(String nombreRemitente) {
		this.nombreRemitente = spaces(Utils.quitaNulo(nombreRemitente).toUpperCase());
	}

	public String getDireccionRemitente() {
		return direccionRemitente;
	}

	public void setDireccionRemitente(String direccionRemitente) {
		this.direccionRemitente = spaces(Utils.quitaNulo(direccionRemitente).toUpperCase());
	}

	public String getTelefonoRemitente() {
		return telefonoRemitente;
	}

	public void setTelefonoRemitente(String telefonoRemitente) {
		this.telefonoRemitente = spaces(Utils.quitaNulo(telefonoRemitente));
	}

	public String getMuniRemitente() {
		return muniRemitente.isEmpty() ? "." : muniRemitente;
	}

	public void setMuniRemitente(String muniRemitente) {
		this.muniRemitente = spaces(Utils.quitaNulo(muniRemitente).toUpperCase());
	}

	public String getDescripcionEnvio() {
		return descripcionEnvio;
	}

	public void setDescripcionEnvio(String descripcionEnvio) {
		this.descripcionEnvio = spaces(Utils.quitaNulo(descripcionEnvio));
	}

	public String getCodigoCredito() {
		return codigoCredito;
	}

	public void setCodigoCredito(String codigoCredito) {
		this.codigoCredito = spaces(Utils.quitaNulo(codigoCredito));
	}

	public String getPiezas() {
		return piezas;
	}

	public void setPiezas(String piezas) {
		this.piezas = spaces(Utils.quitaNulo(piezas));
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = spaces(Utils.quitaNulo(peso));
	}

	public String getSeguro() {
		if (this.seguro.isEmpty()) {
			this.seguro = "0.00";
		}
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = Utils.quitaNulo(seguro);
	}

	public String getValorDeclarado() {
		if (this.valorDeclarado.isEmpty()) {
			this.valorDeclarado = "0.00";
		}
		return valorDeclarado;
	}

	public void setValorDeclarado(String valorDeclarado) {
		this.valorDeclarado = spaces(Utils.quitaNulo(valorDeclarado));
	}

	public String getTipoCobro() {
		return tipoCobro;
	}

	public void setTipoCobro(String tipoCobro) {
		this.tipoCobro = spaces(Utils.quitaNulo(tipoCobro));
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
		this.codValorCobrar = spaces(Utils.quitaNulo(codValorCobrar));
	}

	public String getSeabrepaquete() {
		if (this.seabrepaquete.isEmpty()) {
			this.seabrepaquete = "N";
		}
		return seabrepaquete;
	}

	public void setSeabrepaquete(String seabrepaquete) {
		this.seabrepaquete = spaces(Utils.quitaNulo(seabrepaquete));
	}

	public String getCobex() {
		return cobex;
	}

	public void setCobex(String cobex) {
		this.cobex = spaces(Utils.quitaNulo(cobex));
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = spaces(Utils.quitaNulo(fecha));
	}

	public String getNombreDestinatario() {
		return nombreDestinatario;
	}

	public void setNombreDestinatario(String nombreDestinatario) {
		this.nombreDestinatario = spaces(Utils.quitaNulo(nombreDestinatario).toUpperCase());
	}

	public String getDireccionDestinatario() {
		return direccionDestinatario;
	}

	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = spaces(Utils.quitaNulo(direccionDestinatario).toUpperCase());
	}

	public String getTelefonoDestinatario() {
		return telefonoDestinatario;
	}

	public void setTelefonoDestinatario(String telefonoDestinatario) {
		this.telefonoDestinatario = spaces(Utils.quitaNulo(telefonoDestinatario));
	}

	public String getMuniDestinatario() {
		return muniDestinatario.isEmpty() ? "." : muniDestinatario;
	}

	public void setMuniDestinatario(String muniDestinatario) {
		this.muniDestinatario = Utils.quitaNulo(muniDestinatario);
	}

	public String getCoberturaExtra() {
		return coberturaExtra;
	}

	public void setCoberturaExtra(String coberturaExtra) {
		this.coberturaExtra = spaces(Utils.quitaNulo(coberturaExtra));
	}

	private String spaces(String txt) {
		return (txt.replaceAll("\\s+", " ").replaceAll("\\.NULL\\.", "").replaceAll("\\bNULL\\b", "")
				.replaceAll("\\bNULO\\b", "")).trim();
	}

	@Override
	public String toString() {
		return numeroGuia + "-" + piezas + " - PTOORI: " + puntoOrigen + " PTODES: " + puntoDestino;
	}

	public String getUbicacionActual() {
		return solucionUbicacionActual;
	}

	public void setUbicacionActual(String ubicacionActual) {
		this.solucionUbicacionActual = ubicacionActual;
	}

	public String getSolucionTelefono() {
		return solucionTelefono;
	}

	public void setSolucionTelefono(String solucionTelefono) {
		this.solucionTelefono = solucionTelefono;
	}

}
