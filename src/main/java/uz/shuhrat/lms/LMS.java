package uz.shuhrat.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"uz.shuhrat.lms.db.repository"})
public class LMS {
    public static void main(String[] args) {
        SpringApplication.run(LMS.class, args);
    }
}