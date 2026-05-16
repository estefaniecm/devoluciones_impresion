package com.guatex.impresiones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.guatex.impresiones.datos.ImpresionesDAO;
import com.guatex.impresiones.entidades.AplicacionAgente;
import com.guatex.impresiones.entidades.ActualizarImpresion;
import com.guatex.impresiones.entidades.ImpresionesUsuario;
import com.guatex.impresiones.entidades.Usuario;

/**
 * 
 * @author ESTEFANIECM
 *
 */
@RestController
@RequestMapping("/apidevimpresiones")
@CrossOrigin(origins = "*")

public class rest {

	@Autowired
	private ImpresionesDAO impresionesDAO;

	@GetMapping("/conexion")
	public String pruebaConexion() {
		System.out.print("apidevimpresiones > OK");
		return "OK";
	}

	// Obtiene la aplicación del Agente Guatex desde el lanzador
	@GetMapping("/agente")
	public AplicacionAgente obtenerAgente() {
		System.out.print("agente");
		return new ImpresionesDAO().obtengoAplicacion();
	}

	// Listado de impresiones
	@PostMapping("/agente/impresiones")
	public List<ImpresionesUsuario> impresionesPendientes(@RequestBody List<Usuario> usuarios) {
		return impresionesDAO.buscarIMPP(usuarios);
	}

	// Modifica estado de impresión
	@PatchMapping("/agente/estado")
	public String updateImpresiones(@RequestBody ActualizarImpresion req) {
		return impresionesDAO.cambiarEstado(req);
	}

}
