package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Curso;

public interface CursoDAO extends JpaRepository<Curso, Integer> {

}
