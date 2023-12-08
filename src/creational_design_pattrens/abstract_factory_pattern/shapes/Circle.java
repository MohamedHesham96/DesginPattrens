package creational_design_pattrens.abstract_factory_pattern.shapes;

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}