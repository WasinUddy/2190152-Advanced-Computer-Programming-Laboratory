## Lab 2 Convert to Java

Objective:
1. Practice creating classes, using inheritance, 2. working with class attributes, methods, and method specialization in Java.

Task 1: Creating the `Doll` Classes in One File
1. Define a class named Doll.
2. Inside the Doll class's constructor (Doll()), define member variables for name (String), material (String), and price (float). All of them are `private`.
3. Add a method named toString() to the Doll class that returns the doll's name.
4. Add a method named play() that is void type (no return statement). This method just prints `"I don't know. How to play"`.

Task 2: Creating Subclasses
1. Subclass `Barbie`
  * Define a class named `Barbie` that inherits from the Doll class (using keyword `extends`).
  * Override the play() method to print: `"Barbie sings: I'm a Barbie girl in a Barbie world!"`
2. Subclass `TeddyDoll`
  * Define a class named `TeddyDoll` that inherits from the `Doll` class.
  * Override the `play()` method to print: `"Teddy Doll says: Hug me!"`
3. Subclass `PorcelainDell`
  * Define a class named PorcelainDoll that inherits from the Doll class.
  * Override the play() method to print: "Porcelain Doll is delicate, be gentle!"

Task 3: Adding Methods
1. In the `Doll` class
  * Add a method named `displayInfo()` that prints out the doll's name, material, and price.
  * Add a method named isFragile() that checks if the doll's material is "Porcelain" or "Glass" and returns `true` if it is, otherwise `false`.

Test your program by running the App.java file in the cell below.