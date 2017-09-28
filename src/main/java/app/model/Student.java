package app.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private Date birthYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Date birthYear) {
        this.birthYear = birthYear;
    }
}
