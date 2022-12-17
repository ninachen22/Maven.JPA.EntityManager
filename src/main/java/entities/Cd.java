package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String description;
    private int year;
    private String artist;
    private int price;

}
