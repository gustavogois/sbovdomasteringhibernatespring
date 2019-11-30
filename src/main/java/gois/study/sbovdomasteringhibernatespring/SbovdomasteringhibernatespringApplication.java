package gois.study.sbovdomasteringhibernatespring;

import gois.study.sbovdomasteringhibernatespring.entity.Course;
import gois.study.sbovdomasteringhibernatespring.repository.CourseRepository;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@NoArgsConstructor
public class SbovdomasteringhibernatespringApplication implements CommandLineRunner {

    @Autowired
    private CourseRepository courseRepository;

    public static void main(String[] args) {
        SpringApplication.run(SbovdomasteringhibernatespringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Course course = courseRepository.findById(10001L);
        log.info("{}", course);
    }
}
