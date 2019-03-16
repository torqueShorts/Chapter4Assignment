import javax.swing.*;

public class OCPviolation {

    private String employeeName;
    private int employeeSalary;
    private int empYears;
    private int newSalary;

    public OCPviolation(String name, int sal, int years)
    {
        employeeName = name;
        employeeSalary = sal;
        empYears = years;
    }

    public int salIncrease(int increase)
    {
        int amount = 0;
        if(empYears > 2010)
        {
            amount = employeeSalary + increase;

            newSalary = amount;

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Employee does not qualify for an increase");
        }

        return newSalary;
    }




}
