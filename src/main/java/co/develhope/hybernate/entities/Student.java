package co.develhope.hybernate.entities;
import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String lastName;
    private String firstName;
    @Column(unique = true, name = "student_email")
    private String email;

    public Student() {
    }
}