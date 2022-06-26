package com.example.DataVisualizationAPI.api;

public class Bar implements IBar {

    private float width;
    private float height;
    private String color;

    @Override
    public float getWidth() {
        return this.width;
    }

    @Override
    public float getHeight() {
        return this.height;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
