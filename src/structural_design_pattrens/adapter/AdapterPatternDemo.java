package structural_design_pattrens.adapter;

import structural_design_pattrens.adapter.electric_car.ElectricCar;
import structural_design_pattrens.adapter.electric_car.Toyota;
import structural_design_pattrens.adapter.normal_car.BMW;

import java.util.ArrayList;
import java.util.List;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        System.out.println("Normal Car [BMW]...");
        bmw.moving();
        bmw.breaking();

        Toyota toyota = new Toyota();
        System.out.println("Electric Car...");
        toyota.electricMoving();
        toyota.electricBreaking();

        CarAdapter carAdapter = new CarAdapter(bmw);
        System.out.println("Electric Car [BMW]...");
        carAdapter.electricMoving();
        carAdapter.electricBreaking();

        System.out.println("\n\n");

        List<ElectricCar> list = new ArrayList<>();
        Toyota toyota2 = new Toyota();

        list.add(carAdapter);
        list.add(toyota2);
        System.out.println("Electric cars list...");
        for (ElectricCar electricCar : list) {
            electricCar.electricMoving();
            electricCar.electricBreaking();
        }
    }
}