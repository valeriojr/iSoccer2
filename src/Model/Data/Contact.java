package Model.Data;

public class Contact {

    public static final String EMAIL = "Endereço de e-mail",
                               PHONE = "Número do telefone";

    private String email, phone;

    public Contact(String email, String phone){
        this.email = email;
        this.phone = phone;
    }

    public String toString(){
        return String.format("%s: %s\n%s: %s\n", EMAIL, email, PHONE, phone);
    }
}
