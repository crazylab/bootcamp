package com.math;

public class Area implements Calculator{

    @Override
    public int calculate(int width, int height) {
        return width * height;
    }
}
