# SOEN 350 – Lab 7: Java Generics

**Author:** Umme Athiya  
**Course:** SOEN 350 – Object-Oriented Programming  
**Term:** Spring 2025  
**Due Date:** (Fill in actual due date)  

## 📚 Lab Overview

This lab introduces key Java generics concepts including:

- Generic classes
- Generic methods
- Bounded type parameters (`<T extends Number>`)
- Wildcards (`<?>`, `<? extends Type>`)
- Generic interfaces and implementations

Each question is implemented in its own file and demonstrates strong object-oriented design principles with clear input/output handling.

---

## 🧩 Questions & Features

### ✅ Question 1 – `Container<T>`
- Generic class with getter/setter.
- Tested with `Integer` and `String`.

### ✅ Question 2 – `swapElements`
- Static generic method to swap two elements in an array.
- Tested with arrays of `Integer` and `String`.

### ✅ Question 3 – `NumberStats<T extends Number>`
- Bounded generic class that computes the sum of a numeric list.
- Tested with `List<Integer>` and `List<Double>`.

### ✅ Question 4 – Wildcard Generics
- `customList`: Returns a list of numbers using `<? extends Number>`.
- `printList`: Prints any type of list using unbounded wildcard `<?>`.

### ✅ Question 5 – Generic Interface
- `Repository` interface with `saveBook` and `findByID`.
- `BookRepository` implements the interface using a `Map`.
- `Book` class models a book entity with ID and name.

---

## 🛠️ How to Run

### 1. Compile All Java Files
```bash
javac *.java
