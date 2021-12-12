package com.company;

public class People {
    public String name;
    public float height;
    public float weight;


    People(String name, float height, float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public float getHeight(){
        return height;
    }

    public float getWeight(){
        return weight;
    }

    public float getBmi() {
        return this.weight/(this.height * this.height);
    }

}
