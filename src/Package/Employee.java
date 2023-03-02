package Package;

public class Employee {

    private String fullName;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        if (department < 0 && department > 5) {
            throw new IllegalArgumentException("Неверное значение Департамента");
        }
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return id + ". Ф.И.О. " + fullName + " / Департамент " + department + " / Зарплата " + salary;
    }


}
