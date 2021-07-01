package testPolygons;

import shapes.PentagonalPrism;

public class TestPentagonalPrism {
    public static void main(String[] args) {
        PentagonalPrism pent1 = new PentagonalPrism(2, 1);
        PentagonalPrism pent2 = new PentagonalPrism(2, 1);
        PentagonalPrism pent3 = new PentagonalPrism(3, 1);
        PentagonalPrism pent4 = new PentagonalPrism(1, 1);

        System.out.println(pent1);
        System.out.println(pent2);
        System.out.println(pent3);
        System.out.println(pent4);

        System.out.println("pentagonal prism 1 compared to pentagonal prism 2: " + pent1.compareTo(pent2));
        System.out.println("pentagonal prism 1 compared to pentagonal prism 3: " + pent1.compareTo(pent3));
        System.out.println("pentagonal prism 1 compared to pentagonal prism 4: " + pent1.compareTo(pent4));
    }
}
