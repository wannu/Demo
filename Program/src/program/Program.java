

package program;

import java.util.Scanner;

/**
 *
 * @author Nene Wann
 */

class Employee {
    private String employee_name;
    double employee_hours;
    double employee_hourlySalary;

  
    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

 
    public double getEmployee_hours() {
        return employee_hours;
    }

    public void setEmployee_hours(double employee_hours) {
        this.employee_hours = employee_hours;
    }

    public double getEmployee_hourlySalary() {
        return employee_hourlySalary;
    }

    public void setEmployee_hourlySalary(double employee_hourlySalary) {
        this.employee_hourlySalary = employee_hourlySalary;
    }
    public double calculatePay()
    {
        return employee_hours*employee_hourlySalary;
    }

}
class Manager extends Employee {
    private double manager_bonus;

    
    public double getManager_bonus() {
        return manager_bonus;
    }

    public void setManager_bonus(double manager_bonus) {
        this.manager_bonus = manager_bonus;
    }
    
    @Override
    public double calculatePay()
    {
        return employee_hours* employee_hourlySalary + manager_bonus;
    }
    
    
}
class Ceo extends Employee{
    
    private double ceo_bonus;
    private double ceo_stockPrice;
    private double ceo_numberSharesSold;

    public double getCeo_bonus() {
        return ceo_bonus;
    }

    public void setCeo_bonus(double ceo_bonus) {
        this.ceo_bonus = ceo_bonus;
    }

    public double getCeo_stockPrice() {
        return ceo_stockPrice;
    }

    public void setCeo_stockPrice(double ceo_stockPrice) {
        this.ceo_stockPrice = ceo_stockPrice;
    }

    public double getCeo_numberSharesSold() {
        return ceo_numberSharesSold;
    }

    public void setCeo_numberSharesSold(double ceo_numberSharesSold) {
        this.ceo_numberSharesSold = ceo_numberSharesSold;
    } 
    @Override
    public double calculatePay()
    {
        return ceo_stockPrice*ceo_numberSharesSold +ceo_bonus;
    }
   
}


public class Program {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Employee emp1= new Employee();
        System.out.println("Enter employee name");
        emp1.setEmployee_name(sc.next());
        System.out.println("Enter the hours");
        emp1.setEmployee_hours(sc.nextDouble());
        System.out.println("Enter the employee hourly salary");
        emp1.setEmployee_hourlySalary(sc.nextDouble());
        
        System.out.println("The total pay of the employee = $"+emp1.calculatePay());
        
        Manager emp2 = new Manager();
        System.out.println("Enter the manager name");
        emp2.setEmployee_name(sc.next());
        System.out.println("Enter the hours");
        emp2.setEmployee_hours(sc.nextDouble());
        System.out.println("Enter the manager hourly salary");
        emp2.setEmployee_hourlySalary(sc.nextDouble());
        System.out.println("Enter the manager bonus");
        emp2.setManager_bonus(sc.nextDouble());
        
        System.out.println("The total pay of the manager = $"+emp2.calculatePay());
        
        Ceo emp3 = new Ceo();
        System.out.println("Enter the Ceo name");
        emp3.setEmployee_name(sc.next());
        System.out.println("Enter the stock price");
        emp3.setCeo_stockPrice(sc.nextDouble());
        System.out.println("Enter the number of shares sold");
        emp3.setCeo_numberSharesSold(sc.nextDouble());
        System.out.println("Enter the Ceo bonus");
        emp3.setCeo_bonus(sc.nextDouble());
        
        System.out.println("The Ceo total pay = $"+emp3.calculatePay());
    }

}
