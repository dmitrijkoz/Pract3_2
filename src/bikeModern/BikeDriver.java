package bikeModern;
public class BikeDriver {

    public static void main(String[] args) {

        RoadBike bike1 = new RoadBike();

        RoadBike bike2 = new RoadBike(
                "drop",
                "tourer",
                "semi-grip",
                "comfort",
                14,
                25,
                18
        );

        MountainBike bike3 = new MountainBike();

        Bike bike4 = new Bike();

        System.out.println("=== До изменения bike1 ===");

        bike1.printDescription();

        System.out.println();

        System.out.println("=== Изменяем postHeight на 20 ===");

        bike1.setPostHeight(20);

        System.out.println();

        System.out.println("=== После изменения bike1 ===");

        bike1.printDescription();

        System.out.println();

        bike2.printDescription();
        bike3.printDescription();
        bike4.printDescription();
    }
}