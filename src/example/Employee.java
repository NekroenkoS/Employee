package example;

public class Employee {

    private final int salary;

    public Employee(int salary){
        this.salary=salary;
    }

    public void work(){

        System.out.println("Employee works");
    }

    public int getSalary(){

        return salary;
    }
}
