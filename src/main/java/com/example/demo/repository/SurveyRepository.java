package com.example.demo.repository;

import com.example.demo.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SurveyRepository extends JpaRepository<Survey, Long> {

    @Query("SELECT AVG(s.age) FROM Survey s")
    Integer findAverageAge();

    @Query("SELECT MAX(s.age) FROM Survey s")
    Integer findOldestAge();

    @Query("SELECT MIN(s.age) FROM Survey s")
    Integer findYoungestAge();

    // Count how many surveys
    @Query("SELECT COUNT(s) FROM Survey s")
    long countSurveys();

    // Percentage liking specific food (e.g. pizza)
    @Query("SELECT (COUNT(s)*100.0) / (SELECT COUNT(s2) FROM Survey s2) FROM Survey s WHERE s.favoriteFoods LIKE %:food%")
    Double findPercentageByFood(@Param("food") String food);

    // Average rating of people who like movies (rating > 0 assumed)
    @Query("SELECT AVG(s.moviesRating) FROM Survey s WHERE s.moviesRating > 0")
    Double findAverageMoviesRating();

    @Query("SELECT AVG(s.radioRating) FROM Survey s WHERE s.radioRating > 0")
    Double findAverageRadioRating();

    // Average eat out rating of people who like to eat out (eatOutRating > 0 assumed)
    @Query("SELECT AVG(s.eatOutRating) FROM Survey s WHERE s.eatOutRating > 0")
    Double findAverageEatOutRating();





}
