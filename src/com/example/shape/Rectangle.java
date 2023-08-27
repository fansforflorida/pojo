// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.shape;

public class Rectangle {
    private double length;
    private double width;

    public double getArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("must be positive");
        }

        this.length = length;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("must be positive");
        }

        this.width = width;
    }
}
