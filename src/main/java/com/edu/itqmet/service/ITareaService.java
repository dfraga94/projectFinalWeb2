package com.edu.itqmet.service;

import java.util.List;

import com.edu.itqmet.dto.TareaDTO;

public interface ITareaService {

	
    public List<TareaDTO> findAll();
    public TareaDTO save(TareaDTO tarea);
    public TareaDTO findById(Integer id);
    public void delete(Integer id);
}
