package Model.Data;

public class DriverData {
    public static final String CNH = "CNH";

    private String cnh;

    public DriverData(String cnh){
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n", CNH, cnh);
    }
}
