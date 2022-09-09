package com.rocktech.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Entity
public class TempTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tempTest")

    private Set<Report1> report1;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tempTest")
    private Set<Report2> report2;

    public int getId() {
        return id;
    }

    @JsonManagedReference
    public Set<Report1> getReport1() {
        return report1;
    }

    @JsonManagedReference
    public Set<Report2> getReport2() {
        return report2;
    }
}
