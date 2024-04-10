package com.dev.studentsapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student fulano = new Student(
                    "Fulano de Tal",
                    "fulano@email.com.br",
                    LocalDate.of(2000, 1, 5)
            );

            Student ciclano = new Student(
                    "Ciclano de Tal",
                    "fulano@email.com.br",
                    LocalDate.of(2000, 1, 5)
            );

            repository.saveAll(
                    List.of(fulano, ciclano)
            );

        };
    }
}
