package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursoService {

	void altaCurso(Curso curso);
	List<Curso> eliminarCurso(int codigo);
	void actualizarCurso(int codigo,int horas);
	Curso buscarCurso(int codigo);
	List<Curso> buscarCursoPorPrecio(Double precioMinimo,Double precioMaximo);
	
}
