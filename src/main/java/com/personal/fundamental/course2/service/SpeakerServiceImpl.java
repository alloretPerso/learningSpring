package com.personal.fundamental.course2.service;

import com.personal.fundamental.course2.Speaker;
import com.personal.fundamental.course2.repository.HibernateSpeakerRepositoryImpl;
import com.personal.fundamental.course2.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {


    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
