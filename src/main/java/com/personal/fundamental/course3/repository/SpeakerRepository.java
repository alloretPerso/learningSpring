package com.personal.fundamental.course3.repository;

import com.personal.fundamental.course3.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
