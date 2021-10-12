import java.util.Random;

public class EmployeeFactory {
    int size;
    Employee[] generateEmployees(int size){
        this.size = size;
        Employee[] employees = new Employee[size];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        return employees;
    }

    Employee generateEmployee(){
        return new Employee(generateId(), generateName(), generateAge(), generateSalary(), generateGender(), generateFixedBugs(), 1);
    }

    String generateName(){
        char[] chars = new char[(new Random()).nextInt(10) + 5];
        for (int i = 0; i < chars.length; i++) {
            if(i == 0){
                chars[i] = (char)((new Random().nextInt(27) + 65));
            }else {
                chars[i] = (char)((new Random().nextInt(26) + 97));
            }
        }

        return new String(chars);
    }

    long generateId(){
        return new Random().nextInt(size) + 1;
    }

    int generateAge(){
        return new Random().nextInt(100) + 1;
    }

    int generateSalary(){
        return new Random().nextInt(5000) + 1000;
    }

    boolean generateGender(){
        return (new Random().nextInt(2)) == 1;
    }

    int generateFixedBugs(){
        return new Random().nextInt(200) + 50;
    }
}
