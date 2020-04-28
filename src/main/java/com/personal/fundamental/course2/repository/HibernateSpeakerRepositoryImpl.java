package com.personal.fundamental.course2.repository;

import com.personal.fundamental.course2.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakerList = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Alex");
        speaker.setLastName("Llor");
        speaker.setSeedNum(seedNum);
        System.out.println("cal= " + cal.getTime());

        speakerList.add(speaker);
        return speakerList;
    }
}
