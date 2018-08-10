package Model.Data;

import Model.Employee;

public class ProfessionalData {

    public static final String SALARY = "Salário",
                               JOB = "Cargo";

    private float salary;
    private Employee.Job job;

    public ProfessionalData(float salary, Employee.Job job){
        this.salary = salary;
        this.job = job;
    }

    public String toString(){
        return String.format("%s: %s\n%s: %.2f\n", JOB, job, SALARY, salary);
    }

    public Employee.Job getJob() {
        return job;
    }
}
