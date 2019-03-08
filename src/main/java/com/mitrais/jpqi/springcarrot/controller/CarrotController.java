package com.mitrais.jpqi.springcarrot.controller;

import com.mitrais.jpqi.springcarrot.model.Carrot;
import com.mitrais.jpqi.springcarrot.repository.CarrotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/carrots")
public class CarrotController {
    @Autowired
    CarrotRepository carrotRepository;

    @GetMapping
    public List<Carrot> findAll(){
        return carrotRepository.findAll();
    }

    @PostMapping
    public void create(@RequestBody Carrot carrot) {
        carrotRepository.save(carrot);
    }
}
