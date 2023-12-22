package creational_design_pattrens.abstract_factory_pattern;

import creational_design_pattrens.abstract_factory_pattern.factories.AbstractFactory;
import creational_design_pattrens.abstract_factory_pattern.shapes.Shape;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory roundedShapeFactory = factoryProducer.getShapeFactory(true);

        Shape rectangle = roundedShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = roundedShapeFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory shapeFactory = factoryProducer.getShapeFactory(false);

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
    }
}