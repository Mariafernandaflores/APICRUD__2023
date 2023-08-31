package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CarreraEntity;
import com.example.demo.service.CarreraService;

@RestController
@RequestMapping("/carreras")
public class CarreraController {

	@Autowired
	private CarreraService carreraService;
	@GetMapping("/all")
	public List<CarreraEntity> listar(){
		return carreraService.readAll();
	}
}
