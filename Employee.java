public class Employee {
    private int empId;
    private String name;
    private String department;
    private String email;

    public Employee(int empId, String name, String department, String email) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.email = email;
    }
    private int leaveDays=20;

    public void setLeaveDays(int leaveDays) {
        if (leaveDays>=0)this.leaveDays = leaveDays;
        else System.out.println("Days cannot be negative");
    }

    public int getLeaveDays() {
        return leaveDays;
    }
}
