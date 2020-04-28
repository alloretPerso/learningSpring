package com.personal.fundamental.course3.repository;

import com.personal.fundamental.course3.Speaker;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
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
