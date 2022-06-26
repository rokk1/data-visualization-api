package com.example.DataVisualizationAPI.api;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bar implements IBar {

    private @Id @GeneratedValue Long id;
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

    public Bar() {}

    public Bar(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public Bar(float width, float height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bar that = (Bar) o;

        return com.google.common.base.Objects.equal(this.id, that.id) &&
                com.google.common.base.Objects.equal(this.width, that.width) &&
                com.google.common.base.Objects.equal(this.height, that.height) &&
                com.google.common.base.Objects.equal(this.color, that.color);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(id, width, height, color);
    }
}
