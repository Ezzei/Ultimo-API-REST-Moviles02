package com.cibertec.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.Producto;
import com.cibertec.service.ProductoService;
import com.cibertec.util.Constantes;

@RestController
@RequestMapping("/producto/lista")
public class ProductoController {
	
	@Autowired
	ProductoService service;
	
	@GetMapping
	public List<Producto> listaCliente(){
		return service.listaCliente();
	}
	
	//METODO REGISTRAR
		@PostMapping("/registra")
		@ResponseBody
		public ResponseEntity<Map<String, Object>> inserta(@RequestBody Producto obj){
			Map<String, Object> salida = new HashMap<>();
			try {
				obj.setCodigoProducto(0);
				
				Producto objSalida = service.insertaActualizaProducto(obj);
				if (objSalida == null) {
					salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
				} else {
					salida.put("mensaje", Constantes.MENSAJE_REG_EXITOSO);
				}
			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
			}
			return ResponseEntity.ok(salida);
		}
		
		//METODO ACTUALIZAR
		@PutMapping("/actualiza")
		@ResponseBody
		public ResponseEntity<Map<String, Object>> actualizaProducto(@RequestBody Producto obj){
			Map<String, Object> salida = new HashMap<>();
			try {
				Producto objSalida = service.insertaActualizaProducto(obj);
				if (objSalida == null) {
					salida.put("mensaje", Constantes.MENSAJE_ACT_ERROR);
				} else {
					salida.put("mensaje", Constantes.MENSAJE_ACT_EXITOSO);
				}
			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", Constantes.MENSAJE_ACT_ERROR);
			}
			return ResponseEntity.ok(salida);
		}
		
		//METODO ELIMINAR POR ID
		@DeleteMapping("/eliminar/{id}")
		@ResponseBody
		public ResponseEntity<Map<String, Object>> eliminaProducto(@PathVariable("id") int codigoProducto) {
			Map<String, Object> salida = new HashMap<>();
			try {
				service.eliminarProducto(codigoProducto);
				salida.put("mensaje", Constantes.MENSAJE_ELI_EXITOSO);
			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", Constantes.MENSAJE_ELI_ERROR);
			}
			return ResponseEntity.ok(salida);
		}

}
