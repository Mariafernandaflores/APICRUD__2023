package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.CarreraEntity;

public interface CarreraService {
	CarreraEntity create(CarreraEntity prod);
	List<CarreraEntity> readAll();
}
