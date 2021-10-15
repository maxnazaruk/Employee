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
        int random = (new Random()).nextInt(3);
        switch (random){
            case 0:
                return new Developer(generateId(), generateName(), generateAge(), generateSalary(), generateGender(), generateFixedBugs());
            case 1:
                return new Manager(generateId(), generateName(), generateAge(), generateSalary(), generateGender());
            case 2:
                return new Designer(generateId(), generateName(), generateAge(), generateSalary(), generateGender(), generateRate(), generateWorkedDays());
        }
        return null;
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

    int generateRate(){
        return new Random().nextInt(11) + 1;
    }

    int generateWorkedDays(){
        return new Random().nextInt(29) + 1;
    }
}
