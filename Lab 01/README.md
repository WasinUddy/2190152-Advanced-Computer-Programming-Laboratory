## Lab 1 Introduction

**Objective:** Practice creating classes, using inheritance, working with class attributes, methods, and method specialization in Python.

### Task 1: Creating the Doll Classes in One File




1.   Define a class named `Doll`.
2.   Inside the Doll class's `__init__` method, define instance variables for `name`, `material`, `dimension`, and `price`.
3.   Add a method named `__str__` to the `Doll` class that returns the doll's `name`.
4.   Add a method named `__lt__` to the `Doll` class that returns `True` if the volume of this object less than volume of the `rhs` object.

### Task 2: Creating subclasses

1.   Define a class named `Barbie` that inherits from the `Doll` class. Override the `play()` method to print: `Barbie sings: I'm a Barbie girl in a Barbie world!`
2.   Define a class named `TeddyDoll` that inherits from the `Doll` class. Override the `play()` method to print: `Teddy Doll says: Hug me!`
3.   Define a class named `PorcelainDoll` that inherits from the `Doll` class. Override the play method to print: `Porcelain Doll is delicate, be gentle!`

### Task 3: Adding Methods

1. In the `Doll` class, add a method named `display_info()` that prints out the doll's `name`, `material`, `dimensions`, and `price`.
2. Moreover, add a method named `is_fragile()` that checks if the doll's `material` is `"Porcelain"` or `"Glass"` and returns True if it is, otherwise False.

### Task 4: Using the Doll Classes and Creating a main Function

Write a `main` function that does the following:

1. Creates a list of dolls:
  * 2 `Barbie` dolls named `"Barbie1"` and `"Barbie2"` with `prices` `$29.99` and `$34.99` respectively, and `dimensions` `(30, 20, 10)`.
  * 1 `TeddyDoll` named `"Teddy"` with a price of `$19.99` and dimensions `(25, `15, 12)`.
  * 2 `PorcelainDoll` dolls named `"Porcelain1" `and `"Porcelain2"` with prices `$49.99` and `$59.99` respectively, and dimensions `(18, 10, 8)`.
2. Prints the names of all dolls in the list, sorted by their order in the list, in one line.
3. Prints the total price of all dolls.
4. Sorts the dolls by price and prints their names and prices.
5. Plays with each doll in the list by calling their `play` method and prints the `play` message.
6. Plays with only the dolls that are not fragile (not made of "Porcelain" or "Glass") and prints their `play` messages.

### Expected Output

```
Barbie1 Barbie2 Teddy Porcelain1 Porcelain2

Total price of all dolls: 194.95000000000002

Dolls sorted by price:
Teddy: $19.99
Barbie1: $29.99
Barbie2: $34.99
Porcelain1: $49.99
Porcelain2: $59.99

Playing with all dolls:
Barbie sings: I'm a Barbie girl in a Barbie world!
Barbie sings: I'm a Barbie girl in a Barbie world!
Teddy Doll says: Hug me!
Porcelain Doll is delicate, be gentle!
Porcelain Doll is delicate, be gentle!

Playing with non-fragile dolls:
Barbie sings: I'm a Barbie girl in a Barbie world!
Barbie sings: I'm a Barbie girl in a Barbie world!
Teddy Doll says: Hug me!
```