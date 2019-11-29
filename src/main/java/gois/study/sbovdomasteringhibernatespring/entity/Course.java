package gois.study.sbovdomasteringhibernatespring.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue
    @Getter
    private Long id;

    String name;

    public Course(String name) {
        this.name = name;
    }
}
