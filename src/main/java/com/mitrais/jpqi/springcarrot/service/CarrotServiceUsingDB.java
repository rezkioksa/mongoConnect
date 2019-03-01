package com.mitrais.jpqi.springcarrot.service;

import com.mitrais.jpqi.springcarrot.model.Carrot;
import com.mitrais.jpqi.springcarrot.repository.CarrotRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CarrotServiceUsingDB implements CarrotService {
    @Autowired
    CarrotRepository carrotRepository;

    public CarrotServiceUsingDB(CarrotRepository carrotRepository) {
        this.carrotRepository = carrotRepository;
    }

    @Override
    public void create(Carrot carrot) {
        carrotRepository.save(carrot);
    }
}
