package ir.webapp.junitproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {

    @Test
    void testF(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        assertEquals('F', gradeCalculator.checkGrade(59));
    }

    @Test
    void testD(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        assertEquals('D', gradeCalculator.checkGrade(69));
    }

    @Test
    void testC(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        assertEquals('C', gradeCalculator.checkGrade(79));
    }

    @Test
    void testB(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        assertEquals('B', gradeCalculator.checkGrade(89));
    }

    @Test
    void testA(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        assertEquals('A', gradeCalculator.checkGrade(100));
    }

    @Test
    void testNegativeNumber(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    gradeCalculator.checkGrade(-1);
                });
    }
}