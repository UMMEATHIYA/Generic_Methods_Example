package org.example;

// Interface
interface Repository {
    void saveBook(Book book);
    Book findByID(int id);
}