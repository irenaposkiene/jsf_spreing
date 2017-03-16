package lt.vtvpmc.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.entities.Student;

public class NewCrudStudent {



    
    @PersistenceContext
   private EntityManager entityManager;
    
    private String studentFirstName;
    private String studentLastName;
    private String studentOperations;
    
    @Transactional
    public String save() {
        Student student = new Student(studentFirstName, studentLastName, studentOperations);
        entityManager.persist(student);
        return "basic";
    }
    
    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentOperations() {
        return studentOperations;
    }

    public void setStudentOperations(String studentOperations) {
        this.studentOperations = studentOperations;
    }
    

    
}
