package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursoService;

@RestController
public class CursoController {

	@Autowired
	CursoService service;
	
	@PostMapping(value = "curso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaCurso(@RequestBody Curso curso) {
		service.altaCurso(curso);
	}
	@DeleteMapping(value = "curso/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> eliminarCurso(@PathVariable(name = "id")int codigo){
		return service.eliminarCurso(codigo);
	}
	@GetMapping(value = "curso/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarCurso(@PathVariable(name = "id")int codigo) {
		return service.buscarCurso(codigo);
	}
	@PutMapping(value = "curso/{id}/{horas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarCurso(@PathVariable(name = "id")int codigo,@PathVariable(name = "horas")int horas) {
		service.actualizarCurso(codigo, horas);
	}
	@GetMapping(value = "cursos/{pmin}/{pmax}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> verCursosPorPrecio(@PathVariable(name = "pmin") Double pmin,@PathVariable(name = "pmax")Double pmax){
		return service.buscarCursoPorPrecio(pmin, pmax);
	}
}
