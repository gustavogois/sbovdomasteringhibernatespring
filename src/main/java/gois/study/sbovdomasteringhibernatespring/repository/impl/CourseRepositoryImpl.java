package gois.study.sbovdomasteringhibernatespring.repository.impl;

import gois.study.sbovdomasteringhibernatespring.entity.Course;
import gois.study.sbovdomasteringhibernatespring.repository.CourseRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@NoArgsConstructor
public class CourseRepositoryImpl implements CourseRepository {

    @Autowired
    private EntityManager em;

    @Override
    public Course findById(Long id) {
        return em.find(Course.class, id);
    }
}
