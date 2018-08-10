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

    @Override
    public String toString() {
        return String.format("%s: %d\n%s: %d\n%s: %d\n", WC_COUNT, wcCount, SNACK_BAR_COUNT, snackBarCount, CAPACITY, capacity);
    }
}
