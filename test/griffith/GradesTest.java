package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GradesTest {

    @Test
    public void testGradesMax() {
        Grades grades = new Grades();
        
        assertEquals(98, grades.gradesMax(new int[]{50, 98, 76, 65}));
        assertEquals(0, grades.gradesMax(new int[]{0, -5, -10}));
        assertEquals(100, grades.gradesMax(new int[]{100, 100, 100}));
    }

    @Test
    public void testGradesTotal() {
        Grades grades = new Grades();
        
        assertEquals(290, grades.gradesTotal(new int[]{50, 98, 76, 65}));
        assertEquals(-15, grades.gradesTotal(new int[]{-5, -10}));
        assertEquals(0, grades.gradesTotal(new int[]{})); // Empty array case
    }

    @Test
    public void testGradesAverage() {
        Grades grades = new Grades();
        
        assertEquals(72.25, grades.gradesAverage(new int[]{50, 98, 76, 65}));
        assertEquals(-7.5, grades.gradesAverage(new int[]{-5, -10}));
        assertEquals(0, grades.gradesAverage(new int[]{})); // Empty array case
    }

    @Test
    public void testCountFails() {
        Grades grades = new Grades();
        
        assertEquals(2, grades.countFails(new int[]{50, 30, 20, 80}, 40));
        assertEquals(3, grades.countFails(new int[]{10, 15, 20}, 25));
        assertEquals(0, grades.countFails(new int[]{90, 100, 80}, 50));
    }
}


