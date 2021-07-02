package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import shapes.*;

class TestShapes {

    @Test 
    void testCone() {
        Cone cone1 = new Cone(2, 1); // base cone to test against
        Cone cone2 = new Cone(2, 1); // test equals
        Cone cone3 = new Cone(3, 2); // test greater than 
        Cone cone4 = new Cone(1, 1); // test less than

        assertEquals(0, cone1.compareTo(cone2));
        assertEquals(-1, cone1.compareTo(cone3));
        assertEquals(1, cone1.compareTo(cone4));
    }
    
	@Test
	void testCylinder() {
        Cylinder cyl1 = new Cylinder(2, 1); // base shape to test against
        Cylinder cyl2 = new Cylinder(2, 1); // test equals
        Cylinder cyl3 = new Cylinder(3, 1); // test greater than
        Cylinder cyl4 = new Cylinder(1, 1); // test less than
        
        assertEquals(0, cyl1.compareTo(cyl2));
        assertEquals(-1, cyl2.compareTo(cyl3));
        assertEquals(1, cyl3.compareTo(cyl4));
	}

    @Test
	void testOctagonalPrism() {
        OctagonalPrism oct1 = new OctagonalPrism(2, 1);
        OctagonalPrism oct2 = new OctagonalPrism(2, 1);
        OctagonalPrism oct3 = new OctagonalPrism(3, 1);
        OctagonalPrism oct4 = new OctagonalPrism(1, 1);

        assertEquals(0, oct1.compareTo(oct2));
        assertEquals(-1, oct1.compareTo(oct3));
        assertEquals(1, oct1.compareTo(oct4));
	}
    
	@Test
	void testPentagonalPrism() {
        PentagonalPrism pent1 = new PentagonalPrism(2, 1);
        PentagonalPrism pent2 = new PentagonalPrism(2, 1);
        PentagonalPrism pent3 = new PentagonalPrism(3, 1);
        PentagonalPrism pent4 = new PentagonalPrism(1, 1);

        assertEquals(0, pent1.compareTo(pent2));
        assertEquals(-1, pent1.compareTo(pent3));
        assertEquals(1, pent1.compareTo(pent4));
	}
    
	@Test
	void testPyramid() {
        Pyramid pyr1 = new Pyramid(2, 1);
        Pyramid pyr2 = new Pyramid(2, 1);
        Pyramid pyr3 = new Pyramid(3, 1);
        Pyramid pyr4 = new Pyramid(1, 1);

        assertEquals(0, pyr1.compareTo(pyr2));
        assertEquals(-1, pyr1.compareTo(pyr3));
        assertEquals(1, pyr1.compareTo(pyr4));
	}
    
	@Test
	void testSquarePrism() {
        SquarePrism sq1 = new SquarePrism(2, 1);
        SquarePrism sq2 = new SquarePrism(2, 1);
        SquarePrism sq3 = new SquarePrism(3, 1);
        SquarePrism sq4 = new SquarePrism(1, 1);

        assertEquals(0, sq1.compareTo(sq2));
        assertEquals(-1, sq1.compareTo(sq3));
        assertEquals(1, sq1.compareTo(sq4));
	}
    
	@Test
	void testTrianglePrism() {
        TriangularPrism tri1 = new TriangularPrism(2, 1);
        TriangularPrism tri2 = new TriangularPrism(2, 1);
        TriangularPrism tri3 = new TriangularPrism(3, 1);
        TriangularPrism tri4 = new TriangularPrism(1, 1);

        assertEquals(0, tri1.compareTo(tri2));
        assertEquals(-1, tri1.compareTo(tri3));
        assertEquals(1, tri1.compareTo(tri4));
	}

}
