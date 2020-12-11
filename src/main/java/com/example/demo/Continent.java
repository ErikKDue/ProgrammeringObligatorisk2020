package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="continents")
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String continentName;

    @OneToMany(mappedBy = "homeContinent")
    private Set<Billionaire> nativeBillionaires;

    public int getId() {
        return id;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContinentName(String name) {
        this.continentName = name;
    }

    public Set<Billionaire> getNativeBillionaires() {
        return nativeBillionaires;
    }

    public void setNativeBillionaires(Set<Billionaire> nativeBillionaires) {
        this.nativeBillionaires = nativeBillionaires;
    }
}
