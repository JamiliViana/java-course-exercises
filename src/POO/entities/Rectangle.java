package POO.entities;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        double area  = this.width * this.height;
        return area;
    }
    public double perimeter(){
        double perimeter = 2*(this.width +this.height);
        return perimeter;
    }
    public double diagonal(){
        double diagonal = Math.sqrt((Math.pow(this.height,2))+(Math.pow(this.width,2)));
        return diagonal;
    }

    @Override
    public String toString() {
        return "AREA = " +
                String.format("%.2f",area()) +
                "\n" +
                "PERIMETER = " +
                String.format("%.2f",perimeter()) +
                "\n" +
                "DIAGONAL = " +
                String.format("%.2f",diagonal());

    }
}
