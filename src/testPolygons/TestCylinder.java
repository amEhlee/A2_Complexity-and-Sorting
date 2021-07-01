package testPolygons;

import shapes.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cyl1 = new Cylinder(2, 1);
        Cylinder cyl2 = new Cylinder(2, 1);
        Cylinder cyl3 = new Cylinder(3, 1);
        Cylinder cyl4 = new Cylinder(1, 1);

        System.out.println(cyl1);
        System.out.println(cyl2);
        System.out.println(cyl3);
        System.out.println(cyl4);

        System.out.println("cylinder 1 compared to cylinder 2: " + cyl1.compareTo(cyl2));
        System.out.println("cylinder 1 compared to cylinder 3: " + cyl1.compareTo(cyl3));
        System.out.println("cylinder 1 compared to cylinder 4: " + cyl1.compareTo(cyl4));

    }
}
