package creational_design_pattrens.abstract_factory_pattern.factories;

import creational_design_pattrens.abstract_factory_pattern.shapes.Rectangle;
import creational_design_pattrens.abstract_factory_pattern.shapes.Shape;
import creational_design_pattrens.abstract_factory_pattern.shapes.Square;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;

    }
}
