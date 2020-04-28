package com.personal.fundamental.course2;

import com.personal.fundamental.course2.repository.HibernateSpeakerRepositoryImpl;
import com.personal.fundamental.course2.repository.SpeakerRepository;
import com.personal.fundamental.course2.service.SpeakerService;
import com.personal.fundamental.course2.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.personal.fundamental.course2"})
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service =  new SpeakerServiceImpl();
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository()); //Constructor injection
        //service.setRepository(getSpeakerRepository()); // Setter injection
        return service;
    }
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
