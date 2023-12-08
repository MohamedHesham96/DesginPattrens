package structural_design_pattrens.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Bear bear = new Bear();
        tiger.eat("Best food");

        Zoo zoo = new Zoo();

        zoo.add(lion);
        zoo.add(tiger);
        zoo.add(bear);

        System.out.println("Start eat animals in the zoo");
        zoo.eat("Best food");
        System.out.println("Stop eat animals in the zoo");
        zoo.stopEat();
    }
}