package com.personal.fundamental.course2;

import com.personal.fundamental.course2.repository.HibernateSpeakerRepositoryImpl;
import com.personal.fundamental.course2.repository.SpeakerRepository;
import com.personal.fundamental.course2.service.SpeakerService;
import com.personal.fundamental.course2.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository()); //Constructor injection
        service.setRepository(getSpeakerRepository()); // Setter injection
        return service;
    }
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
