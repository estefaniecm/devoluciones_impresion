package com.guatex.impresiones.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.guatex.impresiones.entidades.ActualizarImpresion;
import com.guatex.impresiones.entidades.AplicacionAgente;
import com.guatex.impresiones.entidades.Guia;
import com.guatex.impresiones.entidades.GuiaDetalle;
import com.guatex.impresiones.entidades.GuiaHija;
import com.guatex.impresiones.entidades.GuiasPendientes;
import com.guatex.impresiones.entidades.ImpresionesUsuario;
import com.guatex.impresiones.entidades.LibreriaAgente;
import com.guatex.impresiones.entidades.Usuario;

/**
 * 
 * @author ESTEFANIECM
 *
 */
@Repository
public class ImpresionesDAO {

	/*****************************************************************************************************/
	public List<ImpresionesUsuario> buscarIMPP(List<Usuario> usuarios) {
		List<ImpresionesUsuario> listadoRespuesta = new ArrayList<>();

		try (Connection con = new Conexion().AbrirConexion()) {
			con.setReadOnly(true);
			con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);

			String query = "SELECT DISTINCT TOP 15 NOGUIA, TGUIAS FROM CONTROL_IMPR_GTX WHERE USUARIO = ? AND ESTADO = ? ; ";

			try (PreparedStatement ps = con.prepareStatement(query)) {
				for (Usuario u : usuarios) {
					ImpresionesUsuario impU = new ImpresionesUsuario();
					impU.setUsuario(u);

					List<GuiasPendientes> guiasPendientes = new ArrayList<GuiasPendientes>();

					ps.setString(1, u.getUsuario());
					ps.setString(2, "N");

					try (ResultSet rs = ps.executeQuery()) {
						while (rs.next()) {
							GuiasPendientes gP = new GuiasPendientes();
							gP.setNoguia(rs.getString("NOGUIA"));
							gP.setTguias(rs.getInt("TGUIAS"));
							guiasPendientes.add(gP);
						}
					}
					if (!guiasPendientes.isEmpty()) {
						List<Guia> listaGuiasUsuario = buscarGuiasxUsuario(guiasPendientes, con);
						impU.setGuiasImpresion(listaGuiasUsuario);

					}
					if (!impU.getGuiasImpresion().isEmpty()) {
						listadoRespuesta.add(impU);
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}
		logsImpresiones(listadoRespuesta);
		return listadoRespuesta;
	}

	public List<Guia> buscarGuiasxUsuario(List<GuiasPendientes> guiasP, Connection con) {

		List<Guia> listadoInfoGuias = new ArrayList<>();

		String query = "SELECT CONVERT(varchar, G.FECHA, 3) AS FECHA, "
				+ "G.NOMREM, "
				+ "G.NOMDES, "
				+ "ISNULL(G.DIRREM1,'') + ' ' + ISNULL(G.DIRREM2,'') AS DIRREM, "
				+ "ISNULL(G.DIRDES1,'') + ' ' + ISNULL(G.DIRDES2,'') AS DIRDES, "
				+ "G.MNCPORI, G.PTOORI, G.MNCPDES, G.PTODES, "
				+ "G.TELREM, G.TELDES, "
				+ "G.COBEX, "
				+ "G.OBSERVACIONES, "
				+ "G.CODCOB, "
				+ "SUM(GD.PIEZAS) AS PIEZAS, "
				+ "SUM(GD.PIEZAS * GD.PESO) AS PESO, "
				+ "G.SEGURO, G.DECLARADO, "
				+ "G.NOGUIA, G.LLAVECLIENTE, G.RECOGEOFICINA, "
				+ "G.COD_VALORACOBRAR, G.SEABREPAQUETE, "
				+ "FC.LXCOBRAR, FC.LPREPAGADA, FC.LCREDITO, FC.LCONTADOFRECUENTE "
				+ "FROM GUIAS G "
				+ "INNER JOIN GUIASDETALLE GD ON G.NOGUIA = GD.NOGUIA "
				+ "INNER JOIN FACCLIENTES FC ON G.CODCOB = FC.CODIGO "
				+ "WHERE G.NOGUIA = ? "
				+ "GROUP BY CONVERT(varchar, G.FECHA, 3), "
				+ "G.NOMREM, "
				+ "G.NOMDES, "
				+ "ISNULL(G.DIRREM1,'') + ' ' + ISNULL(G.DIRREM2,''), "
				+ "ISNULL(G.DIRDES1,'') + ' ' + ISNULL(G.DIRDES2,''), "
				+ "G.MNCPORI, G.PTOORI, G.MNCPDES, G.PTODES, "
				+ "G.TELREM, G.TELDES, "
				+ "G.COBEX, "
				+ "G.OBSERVACIONES, "
				+ "G.CODCOB, "
				+ "G.SEGURO, G.DECLARADO, "
				+ "G.NOGUIA, G.LLAVECLIENTE, G.RECOGEOFICINA, "
				+ "G.COD_VALORACOBRAR, G.SEABREPAQUETE, "
				+ "FC.LXCOBRAR, FC.LPREPAGADA, FC.LCREDITO, FC.LCONTADOFRECUENTE";

		try (PreparedStatement ps = con.prepareStatement(query)) {
			for (GuiasPendientes g : guiasP) {
				ps.setString(1, g.getNoguia());
				try (ResultSet rs = ps.executeQuery()) {
					if (rs.next()) {
						Guia dGuia = new Guia();
						dGuia.setFecha(rs.getString("FECHA"));
						dGuia.setNombreRemitente(rs.getString("NOMREM"));
						dGuia.setNombreDestinatario(rs.getString("NOMDES"));
						dGuia.setDireccionRemitente(rs.getString("DIRREM"));
						dGuia.setDireccionDestinatario(rs.getString("DIRDES"));
						dGuia.setMuniRemitente(rs.getString("MNCPORI"));
						dGuia.setPuntoOrigen(rs.getString("PTOORI"));
						dGuia.setMuniDestinatario(rs.getString("MNCPDES"));
						dGuia.setPuntoDestino(rs.getString("PTODES"));
						dGuia.setTelefonoRemitente(rs.getString("TELREM"));
						dGuia.setTelefonoDestinatario(rs.getString("TELDES"));
						dGuia.setCobex(rs.getString("COBEX"));
						dGuia.setDescripcionEnvio(rs.getString("OBSERVACIONES"));
						dGuia.setCodigoCredito(rs.getString("CODCOB"));
						dGuia.setPiezas(rs.getString("PIEZAS"));
						dGuia.setPeso(rs.getString("PESO"));
						dGuia.setSeguro(rs.getString("SEGURO"));
						dGuia.setValorDeclarado(rs.getString("DECLARADO"));
						dGuia.setNumeroGuia(rs.getString("NOGUIA"));
						dGuia.setLlaveCliente(rs.getString("LLAVECLIENTE"));
						dGuia.setRecogeOficina(rs.getString("RECOGEOFICINA"));
						dGuia.setCodValorCobrar(rs.getString("COD_VALORACOBRAR"));
						dGuia.setSeabrepaquete(rs.getString("SEABREPAQUETE"));
						if (rs.getString("LXCOBRAR").equals("S")) {
							dGuia.setFormaPago("POR COBRAR");
						} else if (rs.getString("LPREPAGADA").equals("S")) {
							dGuia.setFormaPago("PREPAGADA");
						} else if (rs.getString("LCREDITO").equals("S")) {
							dGuia.setFormaPago("CREDITO");
						} else if (rs.getString("LCONTADOFRECUENTE").equals("S")) {
							dGuia.setFormaPago("CONTADO");
						}
						dGuia.setLineasDetalle(buscarDetalleGuia(g.getNoguia(), con));
						dGuia.setGuiasHijas(buscarGuiasHija(g.getNoguia(), con));
						/* Colocar tarifa */
						double sumaTarifa = 0;
						for (GuiaDetalle d : dGuia.getLineasDetalle()) {
							sumaTarifa = sumaTarifa + Double.valueOf(d.getTarifa());
						}
						dGuia.setTarifa(String.format("%.2f", sumaTarifa));
						listadoInfoGuias.add(dGuia);
					}
				}
			} // fin FOR noGuias

		} catch (Exception e) {
			System.out.println("Error buscarGuiasxUsuario: " + e.getLocalizedMessage());
			e.printStackTrace();
		}

		return listadoInfoGuias;
	}

	/*****************************************************************************************************/
	public List<GuiaDetalle> buscarDetalleGuia(String noGuia, Connection con) {

		List<GuiaDetalle> lineasDetalle = new ArrayList<>();

		String query = "SELECT LINEA, PIEZAS, TIPENV, PESO, TARIFA, MANUAL, PBULTOS, NOGUIA FROM GUIASDETALLE WHERE NOGUIA = ? ; ";

		try (PreparedStatement ps = con.prepareStatement(query)) {
			ps.setString(1, noGuia);
			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					GuiaDetalle detalle = new GuiaDetalle();
					detalle.setLinea(rs.getString("LINEA"));
					detalle.setPiezas(rs.getString("PIEZAS"));
					detalle.setTipoEnvio(rs.getString("TIPENV"));
					detalle.setPeso(rs.getString("PESO"));
					detalle.setTarifa(rs.getString("TARIFA"));
					detalle.setManual(rs.getString("MANUAL"));
					detalle.setpBultos(rs.getString("PBULTOS"));
					detalle.setNumeroGuia(rs.getString("NOGUIA"));
					lineasDetalle.add(detalle);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}

		return lineasDetalle;
	}

	/*****************************************************************************************************/
	public List<GuiaHija> buscarGuiasHija(String noGuia, Connection con) {

		List<GuiaHija> listaGuiasHija = new ArrayList<>();

		String query = "SELECT HGUIAHIJA, HNOGUIA, P_FECHA, P_HORA, P_ESTATUS, HESTATUS FROM GUIASHIJAS where HNOGUIA = ? ";

		try (PreparedStatement ps = con.prepareStatement(query)) {
			ps.setString(1, noGuia);
			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					GuiaHija gHija = new GuiaHija();
					gHija.setHguiaHija(rs.getString("HGUIAHIJA"));
					gHija.setHnoguiaMadre(rs.getString("HNOGUIA"));
					gHija.setpFecha(rs.getString("P_FECHA"));
					gHija.setpHora(rs.getString("P_HORA"));
					gHija.setpEstatus(rs.getString("P_ESTATUS"));
					gHija.setHestatus(rs.getString("HESTATUS"));
					listaGuiasHija.add(gHija);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		return listaGuiasHija;
	}

	/****************************************************************************************************/
	public String cambiarEstado(ActualizarImpresion req) {

		String respuesta = "";

		try (Connection con = new Conexion().AbrirConexion()) {

			con.setAutoCommit(false);

			con.setTransactionIsolation(
					Connection.TRANSACTION_READ_COMMITTED);

			String query = "UPDATE CONTROL_IMPR_GTX "
					+ "SET ESTADO = 'I', "
					+ "FECHA_IMPRESO = GETDATE(), "
					+ "IP_IMPRESO = ? "
					+ "WHERE NOGUIA = ? ";

			try (PreparedStatement ps = con.prepareStatement(query)) {
				ps.setString(1, req.getIp());
				ps.setString(2, req.getNoguia());

				int realizado = ps.executeUpdate();

				if (realizado > 0) {
					con.commit();
					respuesta = "OK";
				} else {
					con.rollback();
					respuesta = "ERROR";
				}
			}

		} catch (Exception e) {

			e.printStackTrace();

			respuesta = "EXCEPCIÓN";
		}

		return respuesta;
	}

	/****************************************************************************************************/
	public AplicacionAgente obtengoAplicacion() {
		AplicacionAgente appSIG = null;
		String query = "SELECT TOP 1 CODIGOVERSION, JARAPLICACION, JARHASH FROM VERSIONES_AGENTE_GUATEX WHERE VALIDA = 'S' ORDER BY CODIGOVERSION DESC ; ";
		try (Connection con = new Conexion().AbrirConexion();) {
			try (PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery();) {
				if (rs.next()) {
					appSIG = new AplicacionAgente();
					appSIG.setCODIGOVERSION(rs.getString("CODIGOVERSION"));
					appSIG.setJARAPLICACION(rs.getBytes("JARAPLICACION"));
					appSIG.setJARHASH(rs.getString("JARHASH"));
				}
			}
			if (appSIG != null) {
				List<LibreriaAgente> libreriasAgenteSIG = obtengoLibrerias(con);
				appSIG.setLIBRERIAS(libreriasAgenteSIG);
			}
		} catch (Exception e) {
			System.out.println("EXCEPTION: " + e.getLocalizedMessage());
		}
		return appSIG;
	}

	/****************************************************************************************************/
	public List<LibreriaAgente> obtengoLibrerias(Connection con) {
		List<LibreriaAgente> librerias = new ArrayList<>();
		String query = "SELECT NOMBRELIBRERIA, JARLIB, JARHASH FROM LIBRERIAS_AGENTE_GUATEX WHERE ACTIVA = 'S' ";
		try (PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery();) {
			while (rs.next()) {
				LibreriaAgente lib = new LibreriaAgente();
				lib.setNOMBRELIBRERIA(rs.getString("NOMBRELIBRERIA"));
				lib.setJARLIB(rs.getBytes("JARLIB"));
				lib.setJARHASH(rs.getString("JARHASH"));
				librerias.add(lib);
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());

		}
		return librerias;
	}

	public void logsImpresiones(List<ImpresionesUsuario> listadoRespuesta) {
		if (!listadoRespuesta.isEmpty()) {
			for (ImpresionesUsuario imp : listadoRespuesta) {
				if (!imp.getGuiasImpresion().isEmpty()) {
					System.out.println("ImpresionesUsuario: " + imp.getUsuario().getUsuario() + " > "
							+ imp.getGuiasImpresion().toString());
				}
			}
		}
	}

}
