package creational_design_pattrens.abstract_factory_pattern.shapes;

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}