package org.example;

class BookRepository implements Repository {
    private java.util.Map<Integer, Book> storage = new java.util.HashMap<>();

    public void saveBook(Book book) {
        storage.put(book.getId(), book);
    }

    public Book findByID(int id) {
        return storage.get(id);
    }

    public static void main(String[] args) {
        BookRepository repo = new BookRepository();
        repo.saveBook(new Book("OOP with Java", 1));
        repo.saveBook(new Book("Generics Explained", 2));

        System.out.println(repo.findByID(1));
        System.out.println(repo.findByID(2));
    }
}