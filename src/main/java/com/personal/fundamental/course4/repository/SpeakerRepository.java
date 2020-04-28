package com.personal.fundamental.course4.repository;

import com.personal.fundamental.course4.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
