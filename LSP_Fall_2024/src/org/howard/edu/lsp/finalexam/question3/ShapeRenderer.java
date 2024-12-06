package org.howard.edu.lsp.finalexam.question3;
// Shape Interface
interface Shape {
    void draw();
}

// Circle Class
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle Class
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Triangle Class
class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// ShapeFactory Class (Singleton)
class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {}

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}

// ShapeRenderer Class
public class ShapeRenderer {
    private final ShapeFactory factory;

    public ShapeRenderer() {
        this.factory = ShapeFactory.getInstance();
    }

    public void renderShape(String shapeType) {
        Shape shape = factory.getShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
    }
}
