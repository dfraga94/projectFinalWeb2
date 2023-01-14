package com.edu.itqmet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.itqmet.dto.TareaDTO;
import com.edu.itqmet.repository.ITareaRepository;

@Service
public class TareaServiceImpl implements ITareaService {

	@Autowired
	private ITareaRepository tareaDao;

	@Override
	@Transactional(readOnly = true)
	public List<TareaDTO> findAll() {
		return (List<TareaDTO>) tareaDao.findAll();
	}

	@Override
	@Transactional(readOnly = false)
	public TareaDTO save(TareaDTO tarea) {
		return tareaDao.save(tarea);
	}

	@Override
	@Transactional(readOnly = true)
	public TareaDTO findById(Integer id) {
		return tareaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		tareaDao.deleteById(id);
	}

}
