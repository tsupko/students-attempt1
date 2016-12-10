package org.tsupko.students.dao;

import org.tsupko.students.entity.Student;

import java.util.List;

/**
 * @author Alexander Tsupko (tsupko.alexander@yandex.ru)
 *         Copyright (c) 2016. All rights reserved.
 */
public interface StudentDao {
    List<Student> findAll();

    Student getById(Long id);

    void saveOrUpdate(Student student);
}
