import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();

        company.setIncome(15_000_000);

        for (int i = 0; i < 180; i++) {
            company.hire(new Operator("Operator" + i, 30000 + Math.random() * 10000));
        }

        for (int i = 0; i < 80; i++) {
            company.hire(new Manager("Manager" + i, 50000 + Math.random() * 10000));
        }

        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager("TopManager" + i, 100000 + Math.random() * 20000, company));
        }

        System.out.println("=== Начальное состояние компании ===");
        System.out.println("Всего сотрудников: " + (180 + 80 + 10));


        System.out.println("\nТоп-15 самых высоких зарплат:");
        printSalaries(company.getTopSalaryStaff(15));


        System.out.println("\n30 самых низких зарплат:");
        printSalaries(company.getLowestSalaryStaff(30));


        List<Employee> allEmployees = new ArrayList<>(company.getTopSalaryStaff(270)); // получаем всех сотрудников
        int countToFire = allEmployees.size() / 2;


        Random random = new Random();
        for (int i = 0; i < countToFire; i++) {
            int index = random.nextInt(allEmployees.size());
            company.fire(allEmployees.get(index));
            allEmployees.remove(index);
        }

        System.out.println("\n=== После увольнения 50% сотрудников ===");
        System.out.println("Осталось сотрудников: " + allEmployees.size());


        System.out.println("\nТоп-15 самых высоких зарплат:");
        printSalaries(company.getTopSalaryStaff(15));


        System.out.println("\n30 самых низких зарплат:");
        printSalaries(company.getLowestSalaryStaff(30));
    }

    private static void printSalaries(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.printf("%s: %.2f руб.%n",
                    employee.getName(),
                    employee.getMonthSalary());
        }
    }
}



