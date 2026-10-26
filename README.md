# SHEIN Glam Cart

A Java console application developed as an academic project.

## Overview
The program collects customer details, creates sample product objects, and displays the store, product, and customer information.

## Main Classes
- `APP.java` — runs the application and creates sample data.
- `Product.java` — represents product information such as ID, name, and price.
- `Customer.java` — represents customer information.
- `Organization.java` — stores organization details and arrays of products and customers.

## Concepts Demonstrated
- Java classes and objects
- Constructors
- Encapsulation with private fields
- Getters and setters
- Arrays of objects
- Overriding `toString()`

## How to Run
Compile all Java files in the same directory, then run `APP`.

```bash
javac APP.java Product.java Customer.java Organization.java
java APP
```

## Note
This is an academic console project and uses sample product data. The program asks the user to enter customer details when it runs; do not enter real personal information when demonstrating it publicly.
