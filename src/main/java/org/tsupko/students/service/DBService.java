package org.tsupko.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tsupko.students.dao.StudentDao;
import org.tsupko.students.entity.Student;

import java.util.List;

/**
 * @author Alexander Tsupko (tsupko.alexander@yandex.ru)
 *         Copyright (c) 2016. All rights reserved.
 */
@Service
public class DBService {
    @Autowired
    private StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }
}
