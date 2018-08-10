package Model.Data;

public class Doctor {
    public static final String CRM = "CRM";

    private String crm;

    public Doctor(String crm){
        this.crm = crm;
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n", CRM, crm);
    }
}
