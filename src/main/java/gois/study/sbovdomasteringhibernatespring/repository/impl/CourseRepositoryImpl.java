package gois.study.sbovdomasteringhibernatespring.repository.impl;

import gois.study.sbovdomasteringhibernatespring.entity.Course;
import gois.study.sbovdomasteringhibernatespring.repository.CourseRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@NoArgsConstructor
public class CourseRepositoryImpl implements CourseRepository {

    @Autowired
    private EntityManager em;

    @Override
    public Course findById(Long id) {
        return em.find(Course.class, id);
    }

    @Override
    public List<Course> findAll() {
        TypedQuery<Course> selectAll = em.createQuery("select c from Course c", Course.class);
        return selectAll.getResultList();
    }
}
