package com.personal.fundamental.course4;

import com.personal.fundamental.course4.service.SpeakerService;
import com.personal.fundamental.course4.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        SpeakerService speakerService = applicationContext.getBean("speakerService",SpeakerService.class);

        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
