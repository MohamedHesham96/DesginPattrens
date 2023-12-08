package structural_design_pattrens.composite;

public class Lion implements Animal {
    @Override
    public void eat(String food) {
        System.out.println("Lion: Start eat [" + food + "]");
    }

    @Override
    public void stopEat() {
        System.out.println("Lion: Stop eat");
    }
}
