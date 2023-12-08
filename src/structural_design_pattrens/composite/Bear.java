package structural_design_pattrens.composite;

public class Bear implements Animal {
    @Override
    public void eat(String food) {
        System.out.println("Bear: Start eat [" + food + "]");
    }

    @Override
    public void stopEat() {
        System.out.println("Bear: Stop eat");
    }
}
