package com.edu.itqmet.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "Tb_Tarea")
	public class TareaDTO {

	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="Id")
	    private Integer id;
	    
	    @Column(name="tarea")
	    private String tarea;
	    
	    @Column(name="finalizado")
	    private Boolean finalizado;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getTarea() {
	        return tarea;
	    }

	    public void setTarea(String tarea) {
	        this.tarea = tarea;
	    }

	    public Boolean getFinalizado() {
	        return finalizado;
	    }

	    public void setFinalizado(Boolean finalizado) {
	        this.finalizado = finalizado;
	    }
	    
		
}
