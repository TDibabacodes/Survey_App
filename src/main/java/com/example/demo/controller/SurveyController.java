package com.example.demo.controller;

import com.example.demo.model.Survey;
import com.example.demo.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.time.LocalDate;

@Controller
public class SurveyController {

    @Autowired
    private SurveyRepository surveyRepository;

    @PostMapping("/submitSurvey")
    public String handleFormSubmission(
            @RequestParam String fullName,
            @RequestParam String contact,
            @RequestParam Integer age,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestParam(required = false) String[] food,
            @RequestParam Integer eatOut,
            @RequestParam Integer movies,
            @RequestParam Integer tv,
            @RequestParam Integer radio,
            Model model
    ) {
        // Create a new Survey object and set its properties
        Survey survey = new Survey();
        survey.setFullName(fullName);
        survey.setContact(contact);
        survey.setAge(age);
        survey.setDate(date);
        survey.setFavoriteFoods(food != null ? String.join(",", food) : "");
        survey.setEatOutRating(eatOut);
        survey.setMoviesRating(movies);
        survey.setTvRating(tv);
        survey.setRadioRating(radio);

        // Save the survey to the database
        surveyRepository.save(survey);

        // Add attribute to the model for the thank you page
        model.addAttribute("name", fullName);

        // Return the view name of the thank you page.
        return "redirect:/thankyou.html";
    }
}
