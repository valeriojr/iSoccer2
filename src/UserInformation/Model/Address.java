package UserInformation.Model;

public class Address {
    public static final String ADDRESS = "Endereço",
                               CITY = "Cidade",
                               STATE = "Estado",
                               COUNTRY = "País";

    private String address, city, state, country;

    public Address(String address, String city, String state, String country){
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String toString(){
        return String.format("%s: %s\n%s: %s\n%s: %s\n%s: %s\n", ADDRESS, address, CITY, city, STATE, state, COUNTRY,
                country);
    }
}
