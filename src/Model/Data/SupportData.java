package Model.Data;

public class SupportData {
    public enum Type{
        JUNIOR("Júnior"),
        SENIOR("Sênior"),
        ELITE("Elite");

        private String name;

        Type(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    };
    private static float contributionPricing[] = {25.0f, 30.0f, 50.0f};
    public static final String CONTRIBUTION = "Valor da contribuição",
                               TYPE = "Categoria";

    private Type type;

    public SupportData(Type type){
        this.type = type;
    }

    public float getContribution(){
        return contributionPricing[type.ordinal()];
    }

    public static float getContribution(Type type){
        return contributionPricing[type.ordinal()];
    }

    public String toString(){
        return String.format("%s: %s\n%s: %.2f\n", TYPE, type.toString(), CONTRIBUTION, getContribution());
    }
}
