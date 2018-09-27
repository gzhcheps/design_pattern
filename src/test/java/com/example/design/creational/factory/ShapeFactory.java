package com.example.design.creational.factory;

import org.springframework.util.StringUtils;

public class ShapeFactory {

    public Shape getShape(String type){
        if (null == type){
            return null;
        }

        switch (type.toLowerCase()){
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
                default:
                    break;
        }
        return null;
    }
}
