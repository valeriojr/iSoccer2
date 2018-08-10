package Model.Data;

public class DoctorData {
    public static final String CRM = "CRM";

    private String crm;

    public DoctorData(String crm){
        this.crm = crm;
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n", CRM, crm);
    }
}
