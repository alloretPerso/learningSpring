package com.personal.fundamental.course1.service;

import com.personal.fundamental.course1.Speaker;
import com.personal.fundamental.course1.repository.HibernateSpeakerRepositoryImpl;
import com.personal.fundamental.course1.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
