class Operator extends AbstractEmployee {

    public Operator(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double getMonthSalary(){
        return baseSalary;
    }
}
