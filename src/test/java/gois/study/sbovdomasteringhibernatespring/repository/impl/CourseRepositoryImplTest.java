package gois.study.sbovdomasteringhibernatespring.repository.impl;

import gois.study.sbovdomasteringhibernatespring.entity.Course;
import gois.study.sbovdomasteringhibernatespring.repository.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseRepositoryImplTest {

    @Autowired
    private CourseRepository repository;

    @Test
    public void findById() {
        Course course = repository.findById(10001L);
        assertThat(course.getName()).isEqualTo("JPA in 50 Steps");
    }

}