package creational_design_pattrens.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {

        Computer computer = new Computer.ComputerBuilder("SSD", "Fury Beast 16 GB").setGraphicsCardEnabled(true).setBluetoothEnabled(true).build();

        System.out.println(computer);
    }
}