public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String birthDate, String name, long employeeId, String hireDate) {
        super(birthDate, name);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
