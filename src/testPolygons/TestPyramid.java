package testPolygons;

import shapes.Pyramid;

public class TestPyramid {
    public static void main(String[] args) {
        Pyramid pyr1 = new Pyramid(2, 1);
        Pyramid pyr2 = new Pyramid(2, 1);
        Pyramid pyr3 = new Pyramid(3, 1);
        Pyramid pyr4 = new Pyramid(1, 1);

        System.out.println(pyr1);
        System.out.println(pyr2);
        System.out.println(pyr3);
        System.out.println(pyr4);

        System.out.println("pyramid 1 compared to pyramid 2: " + pyr1.compareTo(pyr2));
        System.out.println("pyramid 1 compared to pyramid 3: " + pyr1.compareTo(pyr3));
        System.out.println("pyramid 1 compared to pyramid 4: " + pyr1.compareTo(pyr4));

    }
}
