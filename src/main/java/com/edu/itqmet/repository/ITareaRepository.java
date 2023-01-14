package com.edu.itqmet.repository;

import org.springframework.data.repository.CrudRepository;

import com.edu.itqmet.dto.TareaDTO;

public interface ITareaRepository extends CrudRepository<TareaDTO, Integer> {

	
}
