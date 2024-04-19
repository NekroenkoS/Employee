package example;

public class HRManager extends Employee{

    public HRManager(int salary) {
        super(salary);
    }

    @Override
    public void work(){

        System.out.println("HRManager works");
    }

    public void addEmployee(){

        System.out.println("HRManager adds employee");
    }
}
