package creational_design_pattrens.abstract_factory_pattern;

import creational_design_pattrens.abstract_factory_pattern.factories.AbstractFactory;
import creational_design_pattrens.abstract_factory_pattern.factories.RoundedShapeFactory;
import creational_design_pattrens.abstract_factory_pattern.factories.ShapeFactory;

public class FactoryProducer {
    public AbstractFactory getShapeFactory(boolean isRectangleFactory) {

        if (isRectangleFactory) {
            return new ShapeFactory();
        } else {
            return new RoundedShapeFactory();
        }
    }
}