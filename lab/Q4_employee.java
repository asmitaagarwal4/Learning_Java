package lab;

// Write a Java program to create a class called Employee with private instance 
// variables employee_id, employee_name, and employee_salary. Provide public 
// getter and setter methods to access and modify the id and name variables, but 
// provide a getter method for the salary variable that returns a formatted string. 

public class Q4_employee {
    private int emp_id;
    private String emp_name;
    private double emp_salary;

    public void setEmp_id(int id){
       this.emp_id= id;
    }

    public void setEmp_name(String name){
        emp_name=name;
    }

    public void setEmp_salary(double salary){
        emp_salary= salary;
    }

    public int getEmp_id(){
        return emp_id;
    }

    public String getEmp_name(){
        return emp_name;
    }

    public String getEmp_salary(){
        return String.format("%.2f",emp_salary);
    }

    public static void main(String[] args){
        Q4_employee a= new Q4_employee();
        a.setEmp_id(231);
        a.setEmp_name("neelam");
        a.setEmp_salary(55000);
        System.out.println(a.getEmp_id());
        System.out.println(a.getEmp_name());
        System.out.println(a.getEmp_salary());
    }

}
