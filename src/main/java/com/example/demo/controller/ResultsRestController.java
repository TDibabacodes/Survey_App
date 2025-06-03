package com.example.demo.controller;

import com.example.demo.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultsRestController {

    private final ResultsService resultsService;

    @Autowired
    public ResultsRestController(ResultsService resultsService) {
        this.resultsService = resultsService;
    }

    @GetMapping("/api/results/totalSurveys")
    public long getTotalSurveys() {
        return resultsService.getTotalSurveys();
    }

    @GetMapping("/api/results/averageAge")
    public Integer getAverageAge() {
        return resultsService.getAverageAge();
    }

    @GetMapping("/api/results/oldestAge")
    public Integer getOldestAge() {
        return resultsService.getOldestAge();
    }

    @GetMapping("/api/results/youngestAge")
    public Integer getYoungestAge() {
        return resultsService.getYoungestAge();
    }

    @GetMapping("/api/results/percentagePizza")
    public Double getPercentagePizza() {
        return resultsService.getPercentagePizza();
    }

    @GetMapping("/api/results/percentagePasta")
    public Double getPercentagePasta() {
        return resultsService.getPercentagePasta();
    }

    @GetMapping("/api/results/percentageWors")
    public Double getPercentageWors() {
        return resultsService.getPercentageWors();
    }

    @GetMapping("/api/results/averageMoviesRating")
    public Double getAverageMoviesRating() {
        return resultsService.getAverageMoviesRating();
    }

    @GetMapping("/api/results/averageRadioRating")
    public Double getAverageRadioRating() {
        return resultsService.getAverageRadioRating();
    }

    @GetMapping("/api/results/averageEatOutRating")
    public Double getAverageEatOutRating() {
        return resultsService.getAverageEatOutRating();
    }


}
