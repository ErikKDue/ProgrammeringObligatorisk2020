package com.example.demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Conspiracy {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String cName;

    private String description;

    @ManyToMany(mappedBy = "conspiracies")
    private Set<Billionaire> conspiracyLeaders;
}
