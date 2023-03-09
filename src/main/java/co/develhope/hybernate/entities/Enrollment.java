package co.develhope.hybernate.entities;

import javax.persistence.*;

@Entity
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private SchoolClass schoolClass;
}