package org.tsupko.students.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tsupko.students.entity.Student;
import org.tsupko.students.service.DBService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
}
