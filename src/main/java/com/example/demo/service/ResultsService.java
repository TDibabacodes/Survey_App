package com.example.demo.service;

import com.example.demo.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultsService {

    private final SurveyRepository surveyRepository;

    @Autowired
    public ResultsService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public long getTotalSurveys() {
        return surveyRepository.countSurveys();
    }

    public Integer getAverageAge() {
        return surveyRepository.findAverageAge();
    }

    public Integer getOldestAge() {
        return surveyRepository.findOldestAge();
    }

    public Integer getYoungestAge() {
        return surveyRepository.findYoungestAge();
    }

    public Double getPercentagePizza() {
        return surveyRepository.findPercentageByFood("Pizza");
    }

    public Double getPercentagePasta() {
        return surveyRepository.findPercentageByFood("Pasta");
    }

    public Double getPercentageWors() {
        return surveyRepository.findPercentageByFood("Pap and Wors");
    }

    public Double getAverageMoviesRating() {
        return surveyRepository.findAverageMoviesRating();
    }

    public Double getAverageRadioRating() {
        return surveyRepository.findAverageRadioRating();
    }

    public Double getAverageEatOutRating() {
        return surveyRepository.findAverageEatOutRating();
    }


}
