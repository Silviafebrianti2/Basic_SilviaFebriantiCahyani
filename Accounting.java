
public class Accounting extends Employee implements Payable {

    public Accounting(String id, String name, String gender, int age) {
        super(id, name, gender, age, "Accounting");
    }

    private boolean isSpecialID() {
        return getId().equals("A001");
    }

    @Override
    public double calculateSalary(Employee e) {
        if (!isSpecialID()) return 0.0;

        if (e.getRole().equalsIgnoreCase("Staff"))
            return 5000.0;

        if (e.getRole().equalsIgnoreCase("Manager"))
            return 7000.0;

        return 0.0;
    }

    @Override
    public double calculateSalary(Employee e, double bonus) {
        if (!isSpecialID()) return 0.0;

        if (e.getRole().equalsIgnoreCase("Manager"))
            return 7000.0 + (7000.0 * bonus);

        return 0.0;
    }

    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo() + " | Can calculate salaries for Staff & Manager";
    }
}
