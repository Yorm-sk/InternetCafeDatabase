package com.solvd.xml_parsers.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


public class Dimas {
    private int height;
    private int weight;
    private fieldOfDrugs field;

    public Dimas() {
    }

    public Dimas(int height, int weight, fieldOfDrugs field) {
        this.height = height;
        this.weight = weight;
        this.field = field;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public fieldOfDrugs getField() {
        return field;
    }

    public void setField(fieldOfDrugs field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Dimas{" +
                "height=" + height +
                ", weight=" + weight +
                ", field=" + field +
                '}';
    }
}