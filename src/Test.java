public class Test {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        EmployeeService employeeService = new EmployeeService(employeeFactory.generateEmployees(10));

        employeeService.printEmployees();
        System.out.println();
        System.out.println("================= By Id =================");
        System.out.println();

        try {
            System.out.println(employeeService.getById(5).toString());
        } catch (NullPointerException e) {
            System.out.println("No such id");
        }

        System.out.println();
        System.out.println("================= By Name =================");
        System.out.println();
        System.out.println(employeeService.getByName(employeeService.employees[3].getName()));

        System.out.println();
        System.out.println("================= Sort By Name =================");
        System.out.println();
        for (Employee employee : employeeService.sortByName()) {
            System.out.println(employee.toString());
        }

        System.out.println();
        System.out.println("================= Sort by name and salary =================");
        System.out.println();
        for (Employee employee : employeeService.sortByNameAndSalary()) {
            System.out.println(employee.toString());
        }
        System.out.println();
        System.out.println("================= Edit =================");
        System.out.println();
        Employee editEmployee = new Employee(2, "NewEmployee", 20, 3000, true);
        System.out.println(employeeService.edit(editEmployee));

        System.out.println();
        System.out.println("================= Remove =================");
        System.out.println();
        try {
            System.out.println(employeeService.remove(3));
        } catch (NullPointerException ex) {
            System.out.println("No such Id");
        }

        System.out.println();
        System.out.println("================= Monthly Fee =================");
        System.out.println();
        System.out.println(employeeService.calculateSalaryAndBonus());

        System.out.println();
        System.out.println("================= Add new Employee =================");
        System.out.println();
        Manager manager = new Manager(5, "New Manager", 30, 5000, true);
        System.out.println(employeeService.employees.length);
        System.out.println();
        employeeService.add(manager);
        System.out.println();
        employeeService.printEmployees();
        System.out.println();
        System.out.println(employeeService.employees.length);
    }
}
