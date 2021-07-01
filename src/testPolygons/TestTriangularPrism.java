package testPolygons;

import shapes.TriangularPrism;

public class TestTriangularPrism {
    public static void main(String[] args) {
        TriangularPrism tri1 = new TriangularPrism(2, 1);
        TriangularPrism tri2 = new TriangularPrism(2, 1);
        TriangularPrism tri3 = new TriangularPrism(3, 1);
        TriangularPrism tri4 = new TriangularPrism(1, 1);

        System.out.println(tri1);
        System.out.println(tri2);
        System.out.println(tri3);
        System.out.println(tri4);

        System.out.println("triangular prism 1 compared to triangular prism 2: " + tri1.compareTo(tri2));
        System.out.println("triangular prism 1 compared to triangular prism 3: " + tri1.compareTo(tri3));
        System.out.println("triangular prism 1 compared to triangular prism 4: " + tri1.compareTo(tri4));

    }
}
