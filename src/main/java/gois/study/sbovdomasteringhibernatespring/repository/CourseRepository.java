package gois.study.sbovdomasteringhibernatespring.repository;

import gois.study.sbovdomasteringhibernatespring.entity.Course;

public interface CourseRepository {
    Course findById(Long id);
    //public Course save(Course course);
    //public void deleteById(Long id);
}
