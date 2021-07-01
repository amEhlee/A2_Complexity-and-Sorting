package testPolygons;

import shapes.SquarePrism;

public class TestSquarePrism {
    public static void main(String[] args) {
        SquarePrism sq1 = new SquarePrism(2, 1);
        SquarePrism sq2 = new SquarePrism(2, 1);
        SquarePrism sq3 = new SquarePrism(3, 1);
        SquarePrism sq4 = new SquarePrism(1, 1);

        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(sq3);
        System.out.println(sq4);

        System.out.println("square prism 1 compared to square prism 2: " + sq1.compareTo(sq2));
        System.out.println("square prism 1 compared to square prism 3: " + sq1.compareTo(sq3));
        System.out.println("square prism 1 compared to square prism 4: " + sq1.compareTo(sq4));
    }
}
