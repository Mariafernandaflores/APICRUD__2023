package com.example.demo.serviceImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CarreraEntity;
import com.example.demo.repository.CarreraRepository;
import com.example.demo.service.CarreraService;
@Service
public class CarreraServiceImpl implements Serializable{
	@Autowired
	private CarreraRepository carreraRepository;

	@Override
	public CarreraEntity create(CarreraEntity carre) {
		// TODO Auto-generated method stub
		return carreraRepository.save(carre);
	}

	
	@Override
	public List<CarreraEntity> readAll() {
		// TODO Auto-generated method stub
		return carreraRepository.findAll();
	}
}