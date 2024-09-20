package lab;
// Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects

class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle; 
    }

    public double calculateBonus() {
        // Default implementation for bonus calculation
        return 0.0;
    }

    public void generatePerformanceReport() {
        // Default implementation for performance report
        System.out.println("Performance report for " + name + ": No data available");
    }

    public void manageProjects() {
        // Default implementation for managing projects
        System.out.println("No projects to manage");
    }
}

// Subclass Manager
class Manager extends Employee {

    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    public double calculateBonus() {
        return salary * 0.1; // Bonus is 10% of salary for managers
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println("Performance report for Manager " + name + ": Excellent");
    }

    @Override
    public void manageProjects() {
        System.out.println("Manager " + name + " is managing projects");
    }
}

// Subclass Developer
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.05; // Bonus is 5% of salary for developers
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println("Performance report for Developer " + name + ": Satisfactory");
    }

    @Override
    public void manageProjects() {
        System.out.println("Developer " + name + " is contributing to projects");
    }
}

// Subclass Programmer
class Programmer extends Employee {


    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
       
    }

    @Override
    public double calculateBonus() {
        return salary * 0.03; // Bonus is 3% of salary for programmers
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println("Performance report for Programmer " + name + ": Needs improvement");
    }

    @Override
    public void manageProjects() {
        System.out.println("Programmer " + name + " is working on projects");
    }
}

// Main class to test the employee hierarchy
public class lab2{
    public static void main(String[] args) {
        Manager manager = new Manager("Ram", "block 1", 70000, "Manager");
        Developer developer = new Developer("Rima", "block 2", 60000, "Developer", "Java");
        Programmer programmer = new Programmer("Bob", "block 1", 50000, "Programmer");

        System.out.println(manager.name + "'s bonus: $" + manager.calculateBonus());
        manager.generatePerformanceReport();
        manager.manageProjects();

        System.out.println(developer.name + "'s bonus: $" + developer.calculateBonus());
        developer.generatePerformanceReport();
        developer.manageProjects();

        System.out.println(programmer.name + "'s bonus: $" + programmer.calculateBonus());
        programmer.generatePerformanceReport();
        programmer.manageProjects();
    }
}


