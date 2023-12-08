package structural_design_pattrens.adapter;

import structural_design_pattrens.adapter.electric_car.ElectricCar;
import structural_design_pattrens.adapter.normal_car.NormalCar;

public class CarAdapter implements ElectricCar {
    NormalCar normalCar;

    public CarAdapter(NormalCar normalCar) {
        this.normalCar = normalCar;
    }

    @Override
    public void electricMoving() {
        normalCar.moving();
    }

    @Override
    public void electricBreaking() {
        normalCar.breaking();
    }
}
