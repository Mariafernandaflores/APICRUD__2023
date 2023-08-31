package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CarreraDTO implements Serializable{
		  
		private Long id;
	  
	  	private String nombre;
	  	
	  	private Boolean estado;

}

