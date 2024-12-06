package org.howard.edu.lsp.finalexam.question3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShapeRendererTest {

    @Test
    void testCircleShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("circle");
        assertNotNull(shape);
        assertTrue(shape instanceof Circle);
    }

    @Test
    void testRectangleShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("rectangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Rectangle);
    }

    @Test
    void testTriangleShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("triangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Triangle);
    }

    @Test
    void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("hexagon");
        assertNull(shape);
    }
}
