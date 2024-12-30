package com.aks.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student akshi = new Student(
                    "Akshi",
                    "aksh@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 4)
            );
            Student praveen = new Student(
                    "Praveen",
                    "praveen@gmail.com",
                    LocalDate.of(2000, Month.SEPTEMBER, 10)
            );

            repository.saveAll(
                    List.of(akshi,praveen)
            );
        };
    }

}
