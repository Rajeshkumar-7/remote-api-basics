package com.example.remoteapibasics;

public class MovieResponse {

    private int budget;

    private String original_title;

    private String tagline;

    private int revenue;

    public MovieResponse() {
    }

    public MovieResponse(int budget, String original_title, String tagline, int revenue) {
        this.budget = budget;
        this.original_title = original_title;
        this.tagline = tagline;
        this.revenue = revenue;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }
}
