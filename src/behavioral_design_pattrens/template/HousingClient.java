package behavioral_design_pattrens.template;

public class HousingClient {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }

}