package com.zmu.model;

public enum Type {
    Дрехи("Дрехи"),
    Лпс("Лпс"),
    Обувки("Обувки");

    private String name;

    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  Type getType(String name){
        if(name.equals(this.name)){
            return this;
        }
        return null;
    }
}
