import java.lang.Math;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

// Abstract class Shape to define the common properties and methods for different shapes
abstract class Shape {
    // Color of the shape
    protected String color;

    // Constructor to initialize the color
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to get the area of the shape
    public abstract double getArea();

    // Abstract method to print the details of the shape
    public abstract void printDetails();

    // Abstract method to resize the shape
    public abstract void resize(double factor);

    // Getter method for color
    public String getColor() {
        return color;
    }
}

// Class Square extending Shape
class Square extends Shape {
    // Side length of the square
    private double sideLength;

    // Constructor to initialize the side length and color
    public Square(double sideLength, String color) {
        super(color);
        this.sideLength = sideLength;
    }

    // Overridden method to get the area of the square
    @Override
    public double getArea() {
        return this.sideLength * this.sideLength;
    }

    // Overridden method to print the details of the square
    @Override
    public void printDetails() {
        System.out.println("Shape: Square");
        System.out.println("Color: " + this.color);
        System.out.println("Side Length: " + this.sideLength);
        System.out.println("Area: " + this.getArea());
        System.out.println("----------------------");
    }

    // Method to resize the square
    public void resize(double factor) {
        this.sideLength *= factor;
    }
}

// Class Rectangle extending Shape
class Rectangle extends Shape {
    // Width and height of the rectangle
    private double width;
    private double height;

    // Constructor to initialize the width, height, and color
    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Overridden method to get the area of the rectangle
    @Override
    public double getArea() {
        return this.width * this.height;
    }

    // Overridden method to print the details of the rectangle
    @Override
    public void printDetails() {
        System.out.println("Shape: Rectangle");
        System.out.println("Color: " + this.color);
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Area: " + this.getArea());
        System.out.println("----------------------");
    }

    // Method to resize the rectangle
    public void resize(double factor) {
        this.width *= factor;
        this.height *= factor;
    }
}

// Class Circle extending Shape
class Circle extends Shape {
    // Radius of the circle
    private double radius;

    // Constructor to initialize the radius and color
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    // Overridden method to get the area of the circle
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    // Overridden method to print the details of the circle
    @Override
    public void printDetails() {
        System.out.println("Shape: Circle");
        System.out.println("Color: " + this.color);
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + this.getArea());
        System.out.println("----------------------");
    }

    // Method to resize the circle
    public void resize(double factor) {
        this.radius *= factor;
    }
}

// Main class to test the functionality
public class Lab4 {
    public static void main(String[] args) {
        // Setup for capturing the output for testing
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream dualStream = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                originalOut.write(b);
                outContent.write(b);
            }
        });

        // Expected output for testing
        String expectedTest1Output = "Shape: Square\nColor: Red\nSide Length: 5.0\nArea: 25.0\n----------------------\nShape: Square\nColor: Blue\nSide Length: 3.0\nArea: 9.0\n----------------------\nShape: Rectangle\nColor: Green\nWidth: 4.0\nHeight: 6.0\nArea: 24.0\n----------------------\nShape: Rectangle\nColor: Yellow\nWidth: 2.0\nHeight: 8.0\nArea: 16.0\n----------------------\nShape: Circle\nColor: Orange\nRadius: 7.0\nArea: 153.93804002589985\n----------------------\n";
        String expectedTest2Output = "Shape: Square\nColor: Red\nSide Length: 10.0\nArea: 100.0\n----------------------\nShape: Square\nColor: Blue\nSide Length: 6.0\nArea: 36.0\n----------------------\nShape: Rectangle\nColor: Green\nWidth: 8.0\nHeight: 12.0\nArea: 96.0\n----------------------\nShape: Rectangle\nColor: Yellow\nWidth: 4.0\nHeight: 16.0\nArea: 64.0\n----------------------\nShape: Circle\nColor: Orange\nRadius: 14.0\nArea: 615.7521601035994\n----------------------\n";

        // Array to hold different shapes
        Shape[] shapes = new Shape[5];
        
        // Initialize shapes
        shapes[0] = new Square(5.0, "Red");
        shapes[1] = new Square(3.0, "Blue");
        shapes[2] = new Rectangle(4.0, 6.0, "Green");
        shapes[3] = new Rectangle(2.0, 8.0, "Yellow");
        shapes[4] = new Circle(7.0, "Orange");

        // Print details before resizing
        System.out.println("===== Start of Before Resizing =====");
        System.setOut(dualStream);
        for (Shape shape : shapes) {
            shape.printDetails();
        }
        System.setOut(originalOut);
        System.out.println("===== End of Before Resizing =====");
        String output1 = outContent.toString();

        // Resize shapes
        for (Shape shape : shapes) {
            shape.resize(2.0);
        }
        outContent.reset();
        
        // Print details after resizing
        System.out.println("===== Start of After Resizing =====");
        System.setOut(dualStream);
        for (Shape shape : shapes) {
            shape.printDetails();
        }
        System.setOut(originalOut);
        System.out.println("===== End of After Resizing =====");
        String output2 = outContent.toString();
        
        // Test the output
        System.out.println("Test 1 : " + (output1.equals(expectedTest1Output) ? "Passed" : "Failed"));
        System.out.println("Test 2 : " + (output2.equals(expectedTest2Output) ? "Passed" : "Failed"));
    }
}
