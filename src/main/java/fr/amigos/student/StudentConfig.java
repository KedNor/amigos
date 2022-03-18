package fr.amigos.student;

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
            Student noreddine = new Student(
                    "Noreddine",
                    "noreddine@gmail.com",
                    LocalDate.of(1991, Month.OCTOBER,30)
            );
            Student alex = new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(1993, Month.JANUARY,28));
            Student fatou = new Student(
                    "Fatou",
                    "Fatou@gmail.com",
                    LocalDate.of(1997, Month.FEBRUARY,24));
            Student mohamed = new Student(
                    "Mohamed",
                    "Mohamed@gmail.com",
                    LocalDate.of(1984, Month.JULY,19));
            repository.saveAll(List.of(noreddine,alex,fatou,mohamed));
        };

    }
}
