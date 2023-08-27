// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.movie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test
    public void getRating_AfterSetRating_ReturnsValue() {
        Movie movie = new Movie();
        movie.setRating(Rating.R);

        Rating actual = movie.getRating();

        assertEquals(Rating.R, actual);
    }

    @Test
    public void getRating_DefaultConstructor_ReturnsNull() {
        Movie movie = new Movie();

        Rating actual = movie.getRating();

        assertEquals(null, actual);
    }

    @Test
    public void getTitle_AfterSetTitle_ReturnsValue() {
        Movie movie = new Movie();
        movie.setTitle("Testing");

        String actual = movie.getTitle();

        assertEquals("Testing", actual);
    }

    @Test
    public void getTitle_DefaultConstructor_ReturnsNull() {
        Movie movie = new Movie();

        String actual = movie.getTitle();

        assertEquals(null, actual);
    }

    @Test
    public void getYear_AfterSetYear_ReturnsValue() {
        Movie movie = new Movie();
        movie.setYear(1980);

        int actual = movie.getYear();

        assertEquals(1980, actual);
    }

    @Test
    public void getYear_DefaultConstructor_ReturnsZero() {
        Movie movie = new Movie();

        int actual = movie.getYear();

        assertEquals(0, actual);
    }
}
