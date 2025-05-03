package org.example;

public class Container<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generic Container Test");

        Container<Integer> intContainer = new Container<>();
        intContainer.setValue(10);
        System.out.println("Integer Value: " + intContainer.getValue());

        Container<String> stringContainer = new Container<>();
        stringContainer.setValue("Hello");
        System.out.println("String Value: " + stringContainer.getValue());

        // Uncommenting the line below causes a compile-time error:
        // Container<Integer> errorContainer = new Container<>();
        // errorContainer.setValue("String");

        System.out.println("Program terminated.");
    }
}
