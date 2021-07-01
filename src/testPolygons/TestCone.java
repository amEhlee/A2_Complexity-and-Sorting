package testPolygons;

import shapes.Cone;

public class TestCone {
    public static void main(String[] args) {
        Cone cone1 = new Cone(2, 1);
        Cone cone2 = new Cone(2, 1);
        Cone cone3 = new Cone(3, 2);
        Cone cone4 = new Cone(1, 1);

        System.out.println(cone1);
        System.out.println(cone2);
        System.out.println(cone3);

        System.out.println("cone 1 compared to cone 2: " + cone1.compareTo(cone2));
        System.out.println("cone 1 compared to cone 3: " + cone1.compareTo(cone3));
        System.out.println("cone 1 compared to cone 4: " + cone1.compareTo(cone4));
    }
}
