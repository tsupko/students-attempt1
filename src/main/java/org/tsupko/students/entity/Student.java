package org.tsupko.students.entity;

import javax.persistence.*;

/**
 * @author Alexander Tsupko (tsupko.alexander@yandex.ru)
 * @author Bagdat Bimaganbetov
 *         Copyright (c) 2016. All rights reserved.
 */
@Entity
public class Student {
    private long version = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
