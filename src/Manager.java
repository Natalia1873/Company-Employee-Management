class Manager extends  AbstractEmployee {
    private double earnings;

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
        this.earnings = 115000 + Math.random() * 25000;
    }

    @Override
    public double getMonthSalary(){
        return baseSalary + (earnings * 0.05);
    }

    public  double getEarnings(){
        return earnings;
    }
}
