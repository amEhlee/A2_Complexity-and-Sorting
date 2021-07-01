package testPolygons;

import shapes.OctagonalPrism;

public class TestOctagonalPrism {
    public static void main(String[] args) {
        OctagonalPrism oct1 = new OctagonalPrism(2, 1);
        OctagonalPrism oct2 = new OctagonalPrism(2, 1);
        OctagonalPrism oct3 = new OctagonalPrism(3, 1);
        OctagonalPrism oct4 = new OctagonalPrism(1, 1);

        System.out.println(oct1);
        System.out.println(oct2);
        System.out.println(oct3);
        System.out.println(oct4);

        System.out.println("octagonal prism 1 compared to octagonal prism 2: " + oct1.compareTo(oct2));
        System.out.println("octagonal prism 1 compared to octagonal prism 3: " + oct1.compareTo(oct3));
        System.out.println("octagonal prism 1 compared to octagonal prism 4: " + oct1.compareTo(oct4));
    }
}
