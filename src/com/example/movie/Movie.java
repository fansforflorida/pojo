// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.movie;

public class Movie {
    private String title;
    private int year;
    private Rating rating;

    public Rating getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
