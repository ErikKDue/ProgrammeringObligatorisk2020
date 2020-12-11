package com.example.demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "billionaires")
public class Billionaire {



    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    String fName;
    String lName;
    String career;

    @ManyToOne
    private Continent homeContinent;

    @ManyToMany(cascade = { CascadeType.ALL })
    Set<Conspiracy> conspiracies = new HashSet<>();

    public int getId() {
        return id;
    }

    public String getCareer() {
        return career;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Billionaire(){}

    public Billionaire(String career, String fName, String lName){
        this.career = career;
        this.fName = fName;
        this.lName = lName;
    }

    public Billionaire(int id, String career, String fName, String lName){
        this.career = career;
        this.fName = fName;
        this.lName = lName;
        this.id = id;
    }

    public Continent getHomeContinent() {
        return homeContinent;
    }

    public void setHomeContinent(Continent homeContinent) {
        this.homeContinent = homeContinent;
    }
}
