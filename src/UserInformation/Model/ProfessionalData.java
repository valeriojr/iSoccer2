package UserInformation.Model;

public class ProfessionalData {

    public static final String SALARY = "Salário",
                               JOB = "Cargo";

    private float salary;
    private String job;

    public ProfessionalData(float salary, String job){
        this.salary = salary;
        this.job = job;
    }
}
