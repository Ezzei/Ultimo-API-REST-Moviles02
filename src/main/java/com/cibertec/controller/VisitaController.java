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

import com.cibertec.entity.Visita;
import com.cibertec.service.VisitaService;
import com.cibertec.util.Constantes;

@RestController
@RequestMapping("/visita/lista")
public class VisitaController {
	
	@Autowired
	private VisitaService service;
	
	@GetMapping
    public List<Visita> listaVisita() {
        return service.listaVisita();
    }
	
	//METODO REGISTRAR
		@PostMapping("/registra")
		@ResponseBody
		public ResponseEntity<Map<String, Object>> inserta(@RequestBody Visita obj){
			Map<String, Object> salida = new HashMap<>();
			try {
				obj.setCodigoVisita(0);				
				Visita objSalida = service.insertaActualizaVisita(obj);
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
		public ResponseEntity<Map<String, Object>> visitaActualiza(@RequestBody Visita obj){
			Map<String, Object> salida = new HashMap<>();
			try {
				Visita objSalida = service.insertaActualizaVisita(obj);
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
		public ResponseEntity<Map<String, Object>> eliminaVisita(@PathVariable("id") int codigoVisita) {
			Map<String, Object> salida = new HashMap<>();
			try {
				service.eliminarVisita(codigoVisita);
				salida.put("mensaje", Constantes.MENSAJE_ELI_EXITOSO);
			} catch (Exception e) {
				e.printStackTrace();
				salida.put("mensaje", Constantes.MENSAJE_ELI_ERROR);
			}
			return ResponseEntity.ok(salida);
		}

}
