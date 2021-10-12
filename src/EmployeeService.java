import java.util.Arrays;
import java.util.Comparator;

public class EmployeeService {
    Employee[] employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    void printEmployees(){
        for (Employee employee : this.employees){
            System.out.println(employee.toString());
        }
    }

    Employee getById(long id){
        for (Employee employee : this.employees){
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

    Employee getByName(String name){
        Employee employee = null;
        for (Employee worker : this.employees){
            if(worker.getName().equals(name)){
                employee = worker;
                break;
            }
        }
        return employee;
    }

    Employee[] sortByName(){
         Arrays.sort(this.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        return this.employees;
    }

    Employee[] sortByNameAndSalary(){
        Arrays.sort(this.employees, new Comparator<Employee>() {

            public int compare(Employee e1, Employee e2) {

                String name1 = e1.getName();
                String name2 = e2.getName();
                int sComp = name1.compareTo(name2);

                if (sComp != 0) {
                    return sComp;
                }

                Integer salary1 = e1.getSalary();
                Integer salary2 = e2.getSalary();
                return salary1.compareTo(salary2);
            }});
        return this.employees;
    }

    Employee edit(Employee employee){
        Employee oldWorker = getById(employee.getId());

        for (Employee worker : this.employees){
            if(worker.getId() == employee.getId()){
                worker = employee;
            }
        }
        return oldWorker;
    }

    Employee remove(long id){
        Employee oldWorker = getById(id);

        for (Employee worker : this.employees){
            if(worker.getId() == id){
                worker = null;
            }
        }
        return oldWorker;
    }
}
