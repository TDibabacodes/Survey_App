package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String contact;
    private Integer age;
    private LocalDate date;

    private String favoriteFoods;

    private Integer eatOutRating;
    private Integer moviesRating;
    private Integer tvRating;
    private Integer radioRating;

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getFavoriteFoods() { return favoriteFoods; }
    public void setFavoriteFoods(String favoriteFoods) { this.favoriteFoods = favoriteFoods; }

    public Integer getEatOutRating() { return eatOutRating; }
    public void setEatOutRating(Integer eatOutRating) { this.eatOutRating = eatOutRating; }

    public Integer getMoviesRating() { return moviesRating; }
    public void setMoviesRating(Integer moviesRating) { this.moviesRating = moviesRating; }

    public Integer getTvRating() { return tvRating; }
    public void setTvRating(Integer tvRating) { this.tvRating = tvRating; }

    public Integer getRadioRating() { return radioRating; }
    public void setRadioRating(Integer radioRating) { this.radioRating = radioRating; }
}
