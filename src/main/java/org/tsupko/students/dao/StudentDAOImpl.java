package org.tsupko.students.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tsupko.students.entity.Student;
import org.tsupko.students.service.DBService;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by bbb1991 on 12/10/16.
 *
 * @author Bagdat Bimaganbetov
 * @author bagdat.bimaganbetov@gmail.com
 */
@Repository
public class StudentDAOImpl implements StudentDao {

    private DBService dbService;

    @Autowired
    public void setDbService(DBService dbService) {
        this.dbService = dbService;
    }

    @Override
    public List<Student> findAll() {
        EntityManager entityManager = dbService.getEntityManagerFactory().createEntityManager();

        List<Student> users = entityManager.createQuery("from Student ").getResultList();

        entityManager.close();

        return users;
    }

    @Override
    public Student getById(Long id) {
        EntityManager entityManager = dbService.getEntityManagerFactory().createEntityManager();
        Student student = entityManager.find(Student.class, id);

        entityManager.close();

        return student;
    }

    public void save(Student student) {
        EntityManager entityManager = dbService.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.merge(student);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void update(Student student) {
        save(student);
    }
}
