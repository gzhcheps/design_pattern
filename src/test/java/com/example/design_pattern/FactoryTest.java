package com.example.design_pattern;

import com.example.design.creational.factory.Shape;
import com.example.design.creational.factory.ShapeFactory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@SpringBootTest
public class FactoryTest {



    @Test
    public void test_factory() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeCircle = shapeFactory.getShape("circle");
        shapeCircle.draw();

        Shape shapeSquare = shapeFactory.getShape("square");
        shapeSquare.draw();

        Shape shapeTriangle = shapeFactory.getShape("triangle");
        shapeTriangle.draw();
    }
}
