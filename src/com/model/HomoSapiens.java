package com.model;

abstract class HomoSapiens {
    String name;
    float height;
    float weight;
    int age;

    public HomoSapiens(){
        this.name = "";
        this.height = 0;
        this.weight = 0;
        this.age = 0;
    }

    public HomoSapiens(String name, float height, float weight, int age){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
