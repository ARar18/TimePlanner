package org.example.timeplanner.pojo.entity;

public class Catalog {

    private int id;
    private String name;

    public Catalog(String name) {
        this.name = name;
        this.id = -1;
    }

    public Catalog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
