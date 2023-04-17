package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void testRectangle(){
        Rectangle rectangle = new Rectangle(5,10);
        assertEquals(5,rectangle.getLength());
        assertEquals(10,rectangle.getWidth());
        assertEquals(50,rectangle.getArea());
        assertEquals(30,rectangle.getPerimeter());
    }
}
