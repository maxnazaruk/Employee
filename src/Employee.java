public class Employee {
    long id;
    String name;
    int age;
    int salary;
    boolean gender;
    int fixedBugs;
    int defaultBugRate = 1;

    public Employee(long id, String name, int age, int salary, boolean gender, int fixedBugs, int defaultBugRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary += this.getFixedBugs() * this.getDefaultBugRate();
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public int getDefaultBugRate() {
        return defaultBugRate;
    }

    public void setDefaultBugRate(int defaultBugRate) {
        this.defaultBugRate = defaultBugRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", fixedBugs=" + fixedBugs +
                ", defaultBugRate=" + defaultBugRate +
                '}';
    }
}
