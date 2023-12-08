package creational_design_pattrens.abstract_factory_pattern.factories;

import creational_design_pattrens.abstract_factory_pattern.shapes.Shape;

public interface AbstractFactory {
    Shape getShape(String shapeName);
}
