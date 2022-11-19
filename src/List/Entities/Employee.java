package List.Entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double increase (double increaseValue){
        this.salary = ((increaseValue / 100) * this.salary) + this.salary;
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + ", " +
                name + ", " +
                String.format("%.2f",salary);
    }
}
