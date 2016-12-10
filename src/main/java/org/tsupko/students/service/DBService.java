package org.tsupko.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tsupko.students.dao.StudentDao;
import org.tsupko.students.entity.Student;

import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * @author Alexander Tsupko (tsupko.alexander@yandex.ru)
 *         Copyright (c) 2016. All rights reserved.
 */
@Service
public class DBService {

    private StudentDao studentDao;

    private EntityManagerFactory entityManagerFactory;

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    public Student getById(Long id) {
        return studentDao.getById(id);
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Autowired
    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }


}
