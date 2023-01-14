package com.edu.itqmet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.itqmet.dto.TareaDTO;
import com.edu.itqmet.service.ITareaService;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class TareaController {

	 @Autowired
	    private ITareaService tareaService;
	    
	    //listar
	    @GetMapping("/tareas")
	    public List<TareaDTO> listar()
	    {
	        return tareaService.findAll();
	    }
	    
	    //guardar
	    @PostMapping("/tareas")
	    public  TareaDTO guardar(@RequestBody TareaDTO tarea)
	    {
	        return tareaService.save(tarea);
	    }
	    
	    //get una tarea
	    @GetMapping("/tareas/{id}")
	    public TareaDTO getUnaTarea(@PathVariable Integer id)
	    {
	        return tareaService.findById(id);
	    }
	    
	    //Modeficar
	    @PutMapping("/tareas/{id}")
	    public TareaDTO modifecar(@RequestBody TareaDTO tarea,@PathVariable Integer id)
	    {
	        TareaDTO tareaActual= tareaService.findById(id);
	        tareaActual.setTarea(tarea.getTarea());
	        tareaActual.setFinalizado(tarea.getFinalizado());
	        
	        return tareaService.save(tareaActual);
	    }
	    
	    @DeleteMapping("/tareas/{id}")
	    public void eliminar(@PathVariable Integer id)
	    {
	        tareaService.delete(id);
	    }
}
