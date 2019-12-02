package gois.study.sbovdomasteringhibernatespring.faqs;

import gois.study.sbovdomasteringhibernatespring.entity.Course;
import gois.study.sbovdomasteringhibernatespring.repository.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FAQ {

    @Autowired
    EntityManager em;

    @Autowired
    CourseRepository repository;

    @Test
    @Transactional
    public void whenDoesHibernateUpdateDatabase() {
        Course course3 = Course.builder().name("Terceiro curso").build();
        em.persist(course3);
        Course course4 = Course.builder().name("Quarto curso").build();
        em.persist(course4);

        em.flush();

        List<Course> result = repository.findAll();
        System.out.println("Resultado: " + result);
        assertThat(result.size()).isEqualTo(4);

        course3.setName("Alterado");
        Course course3Altered = repository.findById(1L);
        assertThat(course3Altered.getName()).isEqualTo("Alterado");
    }

    @Test
    public void testSimple() {
        em.find(Course.class, 1001L);
    }
}
