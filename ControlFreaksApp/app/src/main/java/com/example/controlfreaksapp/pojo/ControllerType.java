package com.example.controlfreaksapp.pojo;

public class ControllerType {
    int picture;
    String title;
    String description;
    int destination;

    public ControllerType(int picture, String title, String description, int destination) {
        this.picture = picture;
        this.title = title;
        this.description = description;
        this.destination = destination;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }
}
