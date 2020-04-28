package com.personal.fundamental.course2.repository;

import com.personal.fundamental.course2.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakerList = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Alex");
        speaker.setLastName("Llor");

        speakerList.add(speaker);
        return speakerList;
    }
}