package com.personal.fundamental.course2;

import com.personal.fundamental.course2.repository.HibernateSpeakerRepositoryImpl;
import com.personal.fundamental.course2.repository.SpeakerRepository;
import com.personal.fundamental.course2.service.SpeakerService;
import com.personal.fundamental.course2.service.SpeakerServiceImpl;
import com.personal.fundamental.course2.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.personal.fundamental.course2"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

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
