package com.zmu.model;

public enum Type {
    Clothes("Дрехи"),
    LPS("Лпс"),
    Shoes("Обувки");

    private String name;

    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
