package ir.webapp.junitproject;

public class GradeCalculator {

    public char checkGrade(int grade){

        if (grade < 0){
            throw new IllegalArgumentException("Negative grade isn't accepted");
        }else if (grade < 60){
            return 'F';
        }else if (grade < 70){
            return 'D';
        }else if (grade < 80){
            return 'C';
        }else if (grade < 90){
            return 'B';
        }else {
            return 'A';
        }
    }

}
