package POO.entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    public double totalGrade;

    public void finalGrade() {
        this.totalGrade = this.grade1 + this.grade2 + this.grade3;
    }

    public void passOrNot() {
        if (this.totalGrade >= 60) {
            System.out.println("FINAL GRADE = "+this.totalGrade);
            System.out.println("PASS");
        } else {
            double missing = 60 - this.totalGrade;
            System.out.println("FINAL GRADE = "+this.totalGrade);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f",missing," POINTS\n");
        }
    }
}
