class TopManager extends AbstractEmployee{
    private Company company;

    public TopManager(String name, double baseSalary, Company company) {
        super(name, baseSalary);
        this.company = company;
    }

    @Override
    public  double getMonthSalary(){
        double salary = baseSalary;
        if (company.getIncome() > 10_000_000){
            salary += baseSalary * 1.5;
        }
        return salary;
    }
}
