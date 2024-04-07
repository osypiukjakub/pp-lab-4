import Project.employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Zbigniew Kowalski", 70000,0);
        employees[1] = new Worker("Helena Kowalska", 20000,"Hydraulik");
        employees[2] = new Employee("Michal Nowak", 67000);
        employees[3] = new Worker("Klara Ras", 8000, "Straznik");
        employees[4] = new Worker("Fiona Bus", 9000, "Kucharz");

        System.out.println("Pracownik z indeksem 3:");
        System.out.println(employees[3]);

    
        employees[3].setSalary(54000);

        int niemanagerowie = 0;

        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                niemanagerowie++;
            }
        }

        ((Manager) employees[0]).setNumberOfSubordinates(niemanagerowie);

        employees[0].setSalary(7500);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}