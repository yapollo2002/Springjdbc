package com.example.demo;

public class Acounting {
    private Integer id;
    private  Integer telNum;
    private String  description;

    @Override
    public String toString() {
        return "Acounting{" +
                "id=" + id +
                ", telNum=" + telNum +
                ", description='" + description + '\'' +
                '}';
    }

    public Acounting(Integer id, Integer telNum, String description) {
        this.id = id;
        this.telNum = telNum;
        this.description = description;
    }
}
