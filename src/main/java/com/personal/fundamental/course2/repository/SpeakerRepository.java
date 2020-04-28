package com.personal.fundamental.course2.repository;

import com.personal.fundamental.course2.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
