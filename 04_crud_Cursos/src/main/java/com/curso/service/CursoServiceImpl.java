package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursoDAO;
import com.curso.model.Curso;


@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	CursoDAO dao;
	
	public void altaCurso(Curso curso) {
		dao.save(curso);
	}
	public List<Curso> eliminarCurso(int codigo){
		dao.deleteById(codigo);
		return dao.findAll();
	}
	public void actualizarCurso(int codigo,int horas) {
		Curso curso =dao.findById(codigo).orElse(null);
		curso.setDuracion(horas);
		dao.save(curso);
		
	}
	public Curso buscarCurso(int codigo) {
		return dao.findById(codigo).orElse(null);
	}
	public List<Curso> buscarCursoPorPrecio(Double precioMinimo,Double precioMaximo){
		List<Curso> cursos = dao.findAll();
		List<Curso> cursosPrecio = new ArrayList<>();
		for (Curso curso : cursos) {
			if (curso.getPrecio()>precioMinimo && curso.getPrecio()<precioMaximo) {
				cursosPrecio.add(curso);
			}
		}
		
		return cursosPrecio;
	}
}
