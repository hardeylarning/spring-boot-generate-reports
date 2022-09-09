package com.rocktech.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Report2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private int age;

    @ManyToOne
    @JoinColumn(name = "temp_test_id")
    private TempTest tempTest;

    @CreationTimestamp
    private Date date;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @JsonBackReference
    public TempTest getTempTest() {
        return tempTest;
    }

    public Date getDate() {
        return date;
    }
}
