package Model.Data.Resources;

public class StadiumData {
    public static final String WC_COUNT = "Quantidade de banheiros",
                               SNACK_BAR_COUNT = "Quantidade de lanchonetes",
                               CAPACITY = "Capacidade";

    private int wcCount, snackBarCount, capacity;

    public StadiumData(int wcCount, int snackBarCount, int capacity){
        this.wcCount = wcCount;
        this.snackBarCount = snackBarCount;
        this.capacity = capacity;
    }
}
