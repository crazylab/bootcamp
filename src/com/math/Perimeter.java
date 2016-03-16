package com.math;

public class Perimeter implements Calculator {
    @Override
    public int calculate(int width, int height) {
        return 2 * (width + height);
    }
}
