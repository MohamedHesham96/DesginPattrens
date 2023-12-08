package structural_design_pattrens.adapter.electric_car;

public class Toyota implements ElectricCar {

    public void electricMoving() {
        System.out.println("Toyota [Electric car]: Electric moving");
    }

    public void electricBreaking() {
        System.out.println("Toyota [Electric car]: Electric breaking");
    }
}
