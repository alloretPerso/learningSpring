package com.personal.fundamental.course2.service;

import com.personal.fundamental.course2.Speaker;
import com.personal.fundamental.course2.repository.HibernateSpeakerRepositoryImpl;
import com.personal.fundamental.course2.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {


    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("Speak service Impl no args constructor");
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("Speak service Impl repository constructor");
        this.repository = repository;
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Speak service Impl setter");
        this.repository = repository;
    }
}
