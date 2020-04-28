package com.personal.fundamental.course3;

import com.personal.fundamental.course3.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {


    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("Speak service Impl no args constructor");
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("Speak service Impl repository constructor");
        this.repository = repository;
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("Speak service Impl setter");
        this.repository = repository;
    }
}
