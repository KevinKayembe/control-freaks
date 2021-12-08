package com.example.controlfreaksapp.ListView;

/**
 * Instantiate each variable with the data type
 */
public class ControllerDataType {
    private String name;
    private String description;

    /**
     * This will get the String of the names and descriptions.
     * @param name - it'll retrieve the name and instantiate itself to hold the value
     * @param description - it'll retrieve the description and instantiate itself
     * to hold the value
     */
    public ControllerDataType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
