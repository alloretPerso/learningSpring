package com.personal.fundamental.course2;

import com.personal.fundamental.course2.service.SpeakerService;
import com.personal.fundamental.course2.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService = applicationContext.getBean("speakerService",SpeakerService.class);


        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
