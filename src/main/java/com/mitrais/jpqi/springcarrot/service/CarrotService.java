package com.mitrais.jpqi.springcarrot.service;

import com.mitrais.jpqi.springcarrot.model.Carrot;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CarrotService {
    void create(Carrot carrot);
    public List<Carrot> findAllCarrots();

}
