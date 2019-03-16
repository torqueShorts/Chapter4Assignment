import javax.swing.*;

public abstract class OCPobey {

    private String employeeName = "Chad";
    private int employeeSalary = 24000;
    private int empYears = 2011;
    private int newSalary;

    public OCPobey()
    {

    }

    public OCPobey(String name, int sal, int years)
    {
        employeeName = name;
        employeeSalary = sal;
        empYears = years;
    }

    public abstract int salIncrease(int increase);



}
