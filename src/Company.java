import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Company {
    private List<Employee> employees;
    private double income;

    public Company() {
        employees = new ArrayList<>();
        income = 0;
    }

    public void hire(Employee employee){
        employees.add(employee);
    }

    public void hireall(Collection<Employee> employees){
        this.employees.addAll(employees);
    }

    public void fire(Employee employee){
        employees.remove(employee);
    }

    public double getIncome(){
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count <= 0 || count > employees.size()) {
            return Collections.emptyList();
        }

        List<Employee> sortedEmployees = new ArrayList<>(employees);
        sortedEmployees.sort((e1, e2) ->
                Double.compare(e2.getMonthSalary(), e1.getMonthSalary()));
        return sortedEmployees.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count <= 0 || count > employees.size()) {
            return Collections.emptyList();
        }

        List<Employee> sortedEmployees = new ArrayList<>(employees);
        sortedEmployees.sort((e1, e2) ->
                Double.compare(e1.getMonthSalary(), e2.getMonthSalary()));
        return sortedEmployees.subList(0, count);
    }
}
