package gois.study.sbovdomasteringhibernatespring.criteriaquery;

import gois.study.sbovdomasteringhibernatespring.entity.Course;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CriteriaQuery {

    @Autowired
    EntityManager em;

    @Test
    public void name() {

        // Use Criteria Builder to create a Criteria Query returning the expected result object
        CriteriaBuilder cb = em.getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<Course> cq = cb.createQuery(Course.class);

        // Define roots for tables which are involved in the Query
        Root<Course> courseRoot = cq.from(Course.class);

        // Define Predicates etc using Criteria Builder

        // Add Predicates etc to the Criteria Query

        // Build the TypedQuery using the entity manager and criteria query
        TypedQuery<Course> query = em.createQuery(cq.select(courseRoot));
        List<Course> resultList = query.getResultList();

        log.info("Typed Query: {}", resultList);
    }
}
