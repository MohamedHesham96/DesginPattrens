package creational_design_pattrens.abstract_factory_pattern.shapes;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}