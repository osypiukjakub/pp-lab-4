public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Zbigniew Kowalski", 70000);
        employees[1] = new Employee("Helena Kowalska", 20000);
        employees[2] = new Employee("Michal Nowak", 67000);
        employees[3] = new Employee("Klara Ras", 8000);
        employees[4] = new Employee("Fiona Bus", 9000);

        System.out.println("Pracownik z indeksem 3:");
        System.out.println(employees[3]);

    
        employees[3].setSalary(54000);

      
        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}