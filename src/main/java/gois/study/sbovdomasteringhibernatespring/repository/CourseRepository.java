package gois.study.sbovdomasteringhibernatespring.repository;

import gois.study.sbovdomasteringhibernatespring.entity.Course;

import java.util.List;

public interface CourseRepository {
    Course findById(Long id);
    List<Course> findAll();
    //public Course save(Course course);
    //public void deleteById(Long id);
}
