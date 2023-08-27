// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.shape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void getArea_ReturnsArea() {
        Rectangle rect = new Rectangle();
        rect.setLength(3);
        rect.setWidth(4);

        double actual = rect.getArea();

        assertEquals(12, actual, 0.0001);
    }

    @Test
    public void getLength_ReturnsLength() {
        Rectangle rect = new Rectangle();
        rect.setLength(3);
        rect.setWidth(4);

        double actual = rect.getLength();

        assertEquals(3, actual, 0.0001);
    }

    @Test
    public void getWidth_ReturnsWidth() {
        Rectangle rect = new Rectangle();
        rect.setLength(3);
        rect.setWidth(4);

        double actual = rect.getWidth();

        assertEquals(4, actual, 0.0001);
    }

    @Test
    public void setLength_NegativeValue_ThrowsException() {
        Rectangle rect = new Rectangle();

        final Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            rect.setLength(-1);
        });

        assertEquals("must be positive", exception.getMessage());
    }

    @Test
    public void setLength_Zero_ThrowsException() {
        Rectangle rect = new Rectangle();

        final Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            rect.setLength(0);
        });

        assertEquals("must be positive", exception.getMessage());
    }

    @Test
    public void setWidth_NegativeValue_ThrowsException() {
        Rectangle rect = new Rectangle();

        final Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            rect.setWidth(-1);
        });

        assertEquals("must be positive", exception.getMessage());
    }

    @Test
    public void setWidth_Zero_ThrowsException() {
        Rectangle rect = new Rectangle();

        final Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            rect.setWidth(0);
        });

        assertEquals("must be positive", exception.getMessage());
    }
}
