package structural_design_pattrens.composite;

public class Tiger implements Animal {
    @Override
    public void eat(String food) {
        System.out.println("Tiger: Start eat [" + food + "]");
    }

    @Override
    public void stopEat() {
        System.out.println("Tiger: Stop eat");
    }
}
