package structural_design_pattrens.adapter.normal_car;

public class BMW implements NormalCar {
    @Override
    public void moving() {
        System.out.println("BMW [Normal car]: Moving");
    }

    @Override
    public void breaking() {
        System.out.println("BMW [Normal car]: Breaking");
    }

}
