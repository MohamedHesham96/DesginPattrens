package creational_design_pattrens.abstract_factory_pattern.factories;

import creational_design_pattrens.abstract_factory_pattern.shapes.Circle;
import creational_design_pattrens.abstract_factory_pattern.shapes.Shape;

public class RoundedShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }

        return null;
    }
}
