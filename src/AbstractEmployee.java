abstract class AbstractEmployee implements Employee{
    protected String name;
    protected double baseSalary;

    public AbstractEmployee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public String getName(){
        return name;
    }
}
