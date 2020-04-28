package com.personal.fundamental.course1.repository;

import com.personal.fundamental.course1.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
