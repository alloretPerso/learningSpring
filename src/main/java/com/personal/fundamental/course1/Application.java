package com.personal.fundamental.course1;

import com.personal.fundamental.course1.service.SpeakerService;
import com.personal.fundamental.course1.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImpl();

        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
