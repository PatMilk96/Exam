public class Employee {
    private String name;
    private String employeeNumber;

    public Employee(String name, String employeeNumber) {
        setName(name);
        setEmployeeNumber(employeeNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        employeeNumber = employeeNumber;
    }
}
