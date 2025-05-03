package org.example;

// Entity class
class Book {
    private String name;
    private int id;

    public Book(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public int getId() { return id; }

    public String toString() {
        return "Book[ID=" + id + ", Name=" + name + "]";
    }
}