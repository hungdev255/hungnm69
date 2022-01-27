package com.parking.service.impl;

import com.parking.entities.Parkinglot;
import com.parking.repository.ParkinglotRepository;
import com.parking.service.ParkinglotService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ParkinglotImpl implements ParkinglotService {

    private final ParkinglotRepository parkinglotRepository;

    public ParkinglotImpl(ParkinglotRepository parkinglotRepository) {
        this.parkinglotRepository = parkinglotRepository;
    }

    @Override
    public List<Parkinglot> getAll() {
        return parkinglotRepository.findAll();
    }

    @Override
    public List<Parkinglot> searchByName(String name) {
        return parkinglotRepository.findByParkNameContains(name);
    }

    @Override
    public String addParkinglot(Parkinglot parkinglot) {
        parkinglotRepository.save(parkinglot);
        return parkinglot.toString();
    }
}
